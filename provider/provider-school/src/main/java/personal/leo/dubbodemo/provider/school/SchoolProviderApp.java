package personal.leo.dubbodemo.provider.school;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 5/12/17 9:50 PM
 * @Description:
 */
public class SchoolProviderApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
        System.in.read();
    }
}
