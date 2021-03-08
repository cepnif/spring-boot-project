package services;

import interfaces.Course;

public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Selenium teaching hours: 13");
    }

    public void initMethod(){
        System.out.println("This is my init method.");
    }

    public void destroyMethod(){
        System.out.println("This is my destroy method.");
    }
}
