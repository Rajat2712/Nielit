package com.example.rajat.nielitappdemo2;

/**
 * Created by Rajat on 8/23/2016.
 */
public class CourseListDemo {
    private String name,duration,fees,eligibility,module;

    public CourseListDemo() {
    }

    public CourseListDemo(String name, String duration, String fees,String eligibility,String module) {
        this.name = name;
        this.duration = duration;
        this.fees = fees;
        this.eligibility=eligibility;
        this.module=module;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public String getEligibility() {
        return eligibility;
    }

    public void setEligibility(String eligibility) {
        this.eligibility = eligibility;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

}
