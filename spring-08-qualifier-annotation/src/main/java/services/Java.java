package services;

import interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private OfficeHours officeHours;

    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: " + (40 + officeHours.getHours()));
    }
}

