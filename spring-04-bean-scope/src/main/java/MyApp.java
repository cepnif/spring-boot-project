import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course1 = container.getBean("selenium", Course.class);
        Course course2 = container.getBean("selenium", Course.class);
        course1.getTeachingHours();
        course2.getTeachingHours();

        System.out.println("Pointing to the same object " + (course1 == course2));
        System.out.println("Memory location for course1: " + course1);
        System.out.println("Memory location for course2: " + course2);
    }
}
