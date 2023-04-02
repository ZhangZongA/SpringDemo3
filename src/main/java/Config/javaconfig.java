package Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration              //取代之前的javaconfig文件
@ComponentScan("bean")       //定义扫描的路径从中找出标识了需要装配的类自动装配到spring的bean容器中  扫描bean文件夹中所有的bean并放入容器
public class javaconfig {
}
