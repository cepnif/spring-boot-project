package services;

import interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class MentorHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 8;
    }
}
