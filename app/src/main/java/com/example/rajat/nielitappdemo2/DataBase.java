package com.example.rajat.nielitappdemo2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajat on 8/25/2016.
 */
public class DataBase extends SQLiteOpenHelper {


    private static final String Key_Id="id";
    private static final String Key_CName="cname";
    private static final String Key_Duration="duration";
    private static final String Key_Fees="fees";
    private static final String Key_Eligibility="eligibility";
    private static final String Key_Module="module";
    private static final int DATABASE_VERSION = 4;
    private static final String DATABASE_NAME = "nielit";
    private static final String STABLE_NAME = "sttable";
    private static final String LTABLE_NAME = "lttable";
    private static final String DTABLE_NAME = "dtable";
    private static final String PTABLE_NAME = "pttable";



    public DataBase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public DataBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DataBase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SHORT_TABLE = "CREATE TABLE  IF NOT EXISTS  " + STABLE_NAME + "("
                + Key_Id + " INTEGER PRIMARY KEY AUTOINCREMENT," + Key_CName + " TEXT," + Key_Duration + " TEXT,"
                + Key_Fees + " TEXT," + Key_Eligibility +" TEXT," + Key_Module + " TEXT"  + ")";

        String CREATE_LONG_TABLE = "CREATE TABLE  IF NOT EXISTS  " + LTABLE_NAME + "("
                + Key_Id + " INTEGER PRIMARY KEY AUTOINCREMENT," + Key_CName + " TEXT," + Key_Duration + " TEXT,"
                + Key_Fees + " TEXT," + Key_Eligibility +" TEXT," + Key_Module + " TEXT" + ")";


        String CREATE_DIPLOMA_TABLE = "CREATE TABLE  IF NOT EXISTS  " + DTABLE_NAME + "("
                + Key_Id + " INTEGER PRIMARY KEY AUTOINCREMENT," + Key_CName + " TEXT," + Key_Duration + " TEXT,"
                + Key_Fees + " TEXT," + Key_Eligibility +" TEXT," + Key_Module + " TEXT" + ")";


        String CREATE_PROJECT_TABLE = "CREATE TABLE  IF NOT EXISTS  " + PTABLE_NAME + "("
                + Key_Id + " INTEGER PRIMARY KEY AUTOINCREMENT," + Key_CName + " TEXT," + Key_Duration + " TEXT,"
                + Key_Fees + " TEXT," + Key_Eligibility +" TEXT," + Key_Module + " TEXT" + ")";


        db.execSQL(CREATE_SHORT_TABLE);
        db.execSQL(CREATE_LONG_TABLE);
        db.execSQL(CREATE_DIPLOMA_TABLE);
        db.execSQL(CREATE_PROJECT_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + STABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + LTABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + DTABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + PTABLE_NAME);
        onCreate(db);
    }


    public void SaddCouse(CourseListDemo courseListDemo){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Key_CName, courseListDemo.getName());
        values.put(Key_Duration, courseListDemo.getDuration());
        values.put(Key_Fees, courseListDemo.getFees());
        values.put(Key_Eligibility, courseListDemo.getEligibility());
        values.put(Key_Module, courseListDemo.getModule());
        db.insert(STABLE_NAME, null, values);
        db.close();
    }

    public void LaddCouse(CourseListDemo courseListDemo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Key_CName, courseListDemo.getName());
        values.put(Key_Duration, courseListDemo.getDuration());
        values.put(Key_Fees, courseListDemo.getFees());
        values.put(Key_Eligibility,courseListDemo.getEligibility());
        values.put(Key_Module, courseListDemo.getModule());
        db.insert(LTABLE_NAME, null, values);
        db.close();
    }

    public void DaddCouse(CourseListDemo courseListDemo)  {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Key_CName, courseListDemo.getName());
        values.put(Key_Duration, courseListDemo.getDuration());
        values.put(Key_Fees, courseListDemo.getFees());
        values.put(Key_Eligibility,courseListDemo.getEligibility());
        values.put(Key_Module, courseListDemo.getModule());

        db.insert(DTABLE_NAME, null, values);
        db.close();
    }

    public void PaddCouse(CourseListDemo courseListDemo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Key_CName, courseListDemo.getName());
        values.put(Key_Duration, courseListDemo.getDuration());
        values.put(Key_Fees, courseListDemo.getFees());
        values.put(Key_Eligibility,courseListDemo.getEligibility());
        values.put(Key_Module, courseListDemo.getModule());

        db.insert(PTABLE_NAME, null, values);
        db.close();
    }

    /*CourseListDemo SgetCourse(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(STABLE_NAME, new String[] { Key_Id,
                        Key_FName,Key_LName,Key_Ph_No,Key_Email }, Key_Id + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Contact contact = new Contact(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1),cursor.getString(2), cursor.getString(3),cursor.getString(4));
        db.close();
        return contact;
    }*/

    List<CourseListDemo> getSCourseN(String name){

        SQLiteDatabase db=this.getReadableDatabase();
        List<CourseListDemo> courseListDemoList=new ArrayList<CourseListDemo>();
        Cursor cursor=db.query(STABLE_NAME, null, Key_CName + "=?", new String[]{String.valueOf(name)}, null, null, null, null);
       /* cursor=db.query(LTABLE_NAME, null, Key_CName + "=?", new String[]{String.valueOf(name)}, null, null, null, null);
        cursor=db.query(DTABLE_NAME, null, Key_CName + "=?", new String[]{String.valueOf(name)}, null, null, null, null);
        cursor=db.query(PTABLE_NAME, null, Key_CName + "=?", new String[]{String.valueOf(name)}, null, null, null, null);
       */ if(cursor!=null)
            cursor.moveToFirst();

        do{
            CourseListDemo courseListDemo = new CourseListDemo(cursor.getString(1),cursor.getString(2), cursor.getString(3),cursor.getString(4),cursor.getString(4));

            courseListDemoList.add(courseListDemo);


        }while (cursor.moveToNext());

        db.close();
        return courseListDemoList;
    }

    List<CourseListDemo> getLCourseN(String name){

        SQLiteDatabase db=this.getReadableDatabase();
        List<CourseListDemo> courseListDemoList=new ArrayList<CourseListDemo>();
        Cursor cursor=db.query(LTABLE_NAME, null, Key_CName + "=?", new String[]{String.valueOf(name)}, null, null, null, null);
        if(cursor!=null)
            cursor.moveToFirst();

        do{
            CourseListDemo courseListDemo = new CourseListDemo(cursor.getString(1),cursor.getString(2), cursor.getString(3),cursor.getString(4),cursor.getString(4));

            courseListDemoList.add(courseListDemo);


        }while (cursor.moveToNext());

        db.close();
        return courseListDemoList;
    }

    List<CourseListDemo> getDCourseN(String name){

        SQLiteDatabase db=this.getReadableDatabase();
        List<CourseListDemo> courseListDemoList=new ArrayList<CourseListDemo>();
        Cursor cursor=db.query(DTABLE_NAME, null, Key_CName + "=?", new String[]{String.valueOf(name)}, null, null, null, null);
        if(cursor!=null)
            cursor.moveToFirst();

        do{
            CourseListDemo courseListDemo = new CourseListDemo(cursor.getString(1),cursor.getString(2), cursor.getString(3),cursor.getString(4),cursor.getString(4));

            courseListDemoList.add(courseListDemo);


        }while (cursor.moveToNext());

        db.close();
        return courseListDemoList;
    }

    List<CourseListDemo> getPCourseN(String name){

        SQLiteDatabase db=this.getReadableDatabase();
        List<CourseListDemo> courseListDemoList=new ArrayList<CourseListDemo>();
        Cursor cursor=db.query(PTABLE_NAME, null, Key_CName + "=?", new String[]{String.valueOf(name)}, null, null, null, null);
        if(cursor!=null)
            cursor.moveToFirst();

        do{
            CourseListDemo courseListDemo = new CourseListDemo(cursor.getString(1),cursor.getString(2), cursor.getString(3),cursor.getString(4),cursor.getString(4));

            courseListDemoList.add(courseListDemo);


        }while (cursor.moveToNext());

        db.close();
        return courseListDemoList;
    }



    public List<CourseListDemo> getAllSCourses() {
        List<CourseListDemo> courseListDemoList = new ArrayList<CourseListDemo>();
        String selectQuery = "SELECT  * FROM " + STABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {

            do {
                CourseListDemo courseListDemo = new CourseListDemo();
                courseListDemo.setName(cursor.getString(1));
                courseListDemo.setDuration(cursor.getString(2));
                courseListDemo.setFees(cursor.getString(3));
                courseListDemo.setEligibility(cursor.getString(4));
                courseListDemo.setModule(cursor.getString(5));
                courseListDemoList.add(courseListDemo);
            } while (cursor.moveToNext());
        }else {courseListDemoList=null; }
        cursor.close();
        db.close();


        return courseListDemoList;
    }

    public List<CourseListDemo> getAllLCourses() {
        List<CourseListDemo> courseListDemoList = new ArrayList<CourseListDemo>();
        String selectQuery = "SELECT  * FROM " + LTABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {

            do {
                CourseListDemo courseListDemo = new CourseListDemo();
                courseListDemo.setName(cursor.getString(1));
                courseListDemo.setDuration(cursor.getString(2));
                courseListDemo.setFees(cursor.getString(3));
                courseListDemo.setEligibility(cursor.getString(4));
                courseListDemo.setModule(cursor.getString(5));
                courseListDemoList.add(courseListDemo);
            } while (cursor.moveToNext());
        }else {courseListDemoList=null; }
        cursor.close();
        db.close();


        return courseListDemoList;
    }

    public List<CourseListDemo> getAllDCourses() {
        List<CourseListDemo> courseListDemoList = new ArrayList<CourseListDemo>();
        String selectQuery = "SELECT  * FROM " + DTABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {

            do {
                CourseListDemo courseListDemo = new CourseListDemo();
                courseListDemo.setName(cursor.getString(1));
                courseListDemo.setDuration(cursor.getString(2));
                courseListDemo.setFees(cursor.getString(3));
                courseListDemo.setEligibility(cursor.getString(4));
                courseListDemo.setModule(cursor.getString(5));
                courseListDemoList.add(courseListDemo);
            } while (cursor.moveToNext());
        }else {courseListDemoList=null; }
        cursor.close();
        db.close();


        return courseListDemoList;
    }

    public List<CourseListDemo> getAllPCourses() {
        List<CourseListDemo> courseListDemoList = new ArrayList<CourseListDemo>();
        String selectQuery = "SELECT  * FROM " + PTABLE_NAME;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {

            do {
                CourseListDemo courseListDemo = new CourseListDemo();
                courseListDemo.setName(cursor.getString(1));
                courseListDemo.setDuration(cursor.getString(2));
                courseListDemo.setFees(cursor.getString(3));
                courseListDemo.setEligibility(cursor.getString(4));
                courseListDemo.setModule(cursor.getString(5));
                courseListDemoList.add(courseListDemo);
            } while (cursor.moveToNext());
        }else {courseListDemoList=null; }
        cursor.close();
        db.close();


        return courseListDemoList;
    }


    /*public int updateContact(Contact contact,int id) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Key_FName, contact.getFName());
        values.put(Key_LName, contact.getLName());
        values.put(Key_Ph_No, contact.getPhoneNumber());
        values.put(Key_Email, contact.getEmail());

        return db.update(TABLE_NAME, values, Key_Id + " = ?",
                new String[] { String.valueOf(id) });
    }


    public void deleteContact(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAME, Key_Id + " = ?",
                new String[]{String.valueOf(id)});
        db.close();
    }*/


    public int getSCourseCount() {
        String countQuery = "SELECT  * FROM " + STABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        return cursor.getCount();
    }

    public int getLCourseCount() {
        String countQuery = "SELECT  * FROM " + LTABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        return cursor.getCount();
    }

    public int getDCourseCount() {
        String countQuery = "SELECT  * FROM " + DTABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        return cursor.getCount();
    }

    public int getPCourseCount() {
        String countQuery = "SELECT  * FROM " + PTABLE_NAME;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        return cursor.getCount();
    }

    public void SClearData(){

        SQLiteDatabase db = this.getWritableDatabase();
        /*db.execSQL("DROP TABLE IF EXISTS " + STABLE_NAME);
        String CREATE_SHORT_TABLE = "CREATE TABLE  IF NOT EXISTS  " + STABLE_NAME + "("
                + Key_Id + " INTEGER PRIMARY KEY AUTOINCREMENT," + Key_CName + " TEXT," + Key_Duration + " TEXT,"
                + Key_Fees + " TEXT," + Key_Eligibility +" TEXT," + Key_Module + " TEXT"  + ")";
        db.execSQL(CREATE_SHORT_TABLE);
*/
        //db.execSQL("TRUNCATE table" + STABLE_NAME);
        if(getSCourseCount()!=0)
        db.delete(STABLE_NAME,null,null);

        db.close();


    }

    public void LClearData(){


        SQLiteDatabase db = this.getWritableDatabase();
        if(getLCourseCount()!=0)
        db.delete(LTABLE_NAME,null,null);

        db.close();


    }

    public void DClearData(){

        SQLiteDatabase db = this.getWritableDatabase();
        if(getDCourseCount()!=0)
        db.delete(DTABLE_NAME,null,null);

        db.close();


    }

    public void PTClearData(){

        SQLiteDatabase db = this.getWritableDatabase();
        if(getPCourseCount()!=0)
        db.delete(PTABLE_NAME,null,null);

        db.close();


    }

}
