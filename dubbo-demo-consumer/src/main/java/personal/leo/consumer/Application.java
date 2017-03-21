package personal.leo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import personal.leo.provider.service.DemoService;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 3/21/17 2:52 PM
 * @Description:
 */
public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        ctx.start();

        DemoService demoService = (DemoService) ctx.getBean("demoService");

        String[] names = {"leo", "neo", "geo"};

        for (String name : names) {
            String str = demoService.hello(name);
            System.out.println(str);
        }

    }

}

