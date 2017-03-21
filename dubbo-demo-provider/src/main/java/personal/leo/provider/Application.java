package personal.leo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 3/21/17 2:48 PM
 * @Description:
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        ctx.start();
        while (true) {

        }
    }

}
