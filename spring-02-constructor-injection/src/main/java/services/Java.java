package services;

import interfaces.Course;

public class Java implements Course {

    OfficeHours officeHours;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: "
                + (23 + officeHours.getHours()));
    }
}
