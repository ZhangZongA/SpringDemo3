package bean;

import Config.javaconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppStart {
    public static void main(String[] args) {
        ApplicationContext ap=new AnnotationConfigApplicationContext(javaconfig.class);
        Person bean =  ap.getBean(Person.class);
        bean.getPA();
    }
}
