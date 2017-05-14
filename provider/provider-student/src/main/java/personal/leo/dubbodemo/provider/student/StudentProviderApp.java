package personal.leo.dubbodemo.provider.student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 5/13/17 4:32 AM
 * @Description:
 */

public class StudentProviderApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
        System.in.read();
    }
}
