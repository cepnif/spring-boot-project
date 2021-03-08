package services;

import interfaces.Course;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Java implements Course {

    private OfficeHours officeHours;

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: "
                + (23 + officeHours.getHours()));
    }
}
