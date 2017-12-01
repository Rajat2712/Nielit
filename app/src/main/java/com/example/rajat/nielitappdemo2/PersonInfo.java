package com.example.rajat.nielitappdemo2;

/**
 * Created by Rajat on 8/28/2016.
 */
public class PersonInfo {
    private String fname;
    private String lname;
    private String phone;
    private String email;
    private String cname;

    public PersonInfo(){

    }

    public PersonInfo(String fname,String lname,String phone,String email,String cname){
        this.fname=fname;
        this.lname=lname;
        this.phone=phone;
        this.email=email;
        this.cname=cname;
    }

    public String getFname(){
        return this.fname;
    }

    public void setFname(String fname){
        this.fname=fname;
    }

    public String getLname(){
        return this.lname;
    }

    public void setLname(String lname){
        this.lname=lname;
    }

    public String getPhone(){
        return this.getFname();
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getCname(){
        return this.cname;
    }

    public void setCname(String cname){
        this.cname=cname;
    }


}
