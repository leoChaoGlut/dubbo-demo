package personal.leo.provider.service.imp;

import personal.leo.provider.service.DemoService;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 3/21/17 2:42 PM
 * @Description:
 */
public class DemoServiceImp implements DemoService {

    @Override
    public String hello(String name) {
        String str = "hello " + name;
        System.out.println(str);
        return str;
    }
}
