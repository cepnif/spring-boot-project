package services;

import interfaces.Course;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class Java implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: 40");
    }
}

