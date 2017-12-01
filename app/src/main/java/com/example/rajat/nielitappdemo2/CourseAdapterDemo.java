package com.example.rajat.nielitappdemo2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Rajat on 8/23/2016.
 */
public class CourseAdapterDemo extends RecyclerView.Adapter<CourseAdapterDemo.MyViewHolder>{

    private List<CourseListDemo> courseListDemoList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, duration, fees;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.title);
            fees = (TextView) view.findViewById(R.id.genre);
            duration = (TextView) view.findViewById(R.id.year);
        }
    }


    public CourseAdapterDemo(List<CourseListDemo> courseListDemoList) {
        this.courseListDemoList = courseListDemoList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.course_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CourseListDemo movie = courseListDemoList.get(position);
        holder.name.setText(movie.getName());
        holder.fees.setText(movie.getFees());
        holder.duration.setText(movie.getDuration());
    }

    @Override
    public int getItemCount() {
        return courseListDemoList.size();
    }

}
