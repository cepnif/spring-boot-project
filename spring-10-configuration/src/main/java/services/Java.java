package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Java implements Course {

    private ExtraSessions extraSessions;
    @Value("Java")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String days[];

    @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Java teaching hours: " + (40 + extraSessions.getHours()));
    }
}

