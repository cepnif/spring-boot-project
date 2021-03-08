import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");
        Course course1 = container.getBean("java", Course.class);
        Course course2 = container.getBean("selenium", Course.class);
        ExtraSessions session1 = container.getBean("officeHours", ExtraSessions.class);

        course1.getTeachingHours();
        course2.getTeachingHours();
        session1.getHours();
    }
}
