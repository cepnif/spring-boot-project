package services;

import interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private OfficeHours officeHours;

    @Autowired
    public Selenium(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Selenium teaching hours: " + (20 + officeHours.getHours()));
    }

}
