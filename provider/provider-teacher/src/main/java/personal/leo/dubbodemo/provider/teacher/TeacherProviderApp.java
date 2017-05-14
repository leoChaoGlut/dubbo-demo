package personal.leo.dubbodemo.provider.teacher;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 5/13/17 4:29 AM
 * @Description:
 */
@ComponentScan
public class TeacherProviderApp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
        System.in.read();
    }
}
