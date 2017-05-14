package personal.leo.dubbodemo.provider.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import personal.leo.dubbodemo.provider.service.TeacherService;

import javax.annotation.PostConstruct;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 5/13/17 4:45 AM
 * @Description:
 */
@Component
public class MyTest {
    
    @Autowired
    TeacherService teacherService;

    @PostConstruct
    private void postConstruct() {
        System.out.println(teacherService.getAllStudents());
    }
}
