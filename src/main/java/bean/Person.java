package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component               //把这个类变成bean
public class Person {
    @Value("78")         //自动注入基本类型
    private int age;
    @Value("老王" )
    private String name;
    @Autowired           //自动注入引用；类型
    private Address address;

    public void PerRun()
    {
        System.out.println("Person类");
    }

    public void getPA( )
    {
        System.out.println(this.age+"岁的"+this.name+"住在"+address.getAddress());
    }

}
