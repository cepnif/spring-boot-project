import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Course course1 = container.getBean("selenium", Course.class);
        Course course2 = container.getBean("java", Course.class);
        course1.getTeachingHours();
        course2.getTeachingHours();
    }
}
