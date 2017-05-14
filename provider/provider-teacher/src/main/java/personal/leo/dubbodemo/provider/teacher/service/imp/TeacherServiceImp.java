package personal.leo.dubbodemo.provider.teacher.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import personal.leo.dubbodemo.provider.service.StudentService;
import personal.leo.dubbodemo.provider.service.TeacherService;

import javax.annotation.PostConstruct;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 5/13/17 4:39 AM
 * @Description:
 */
@Service("teacherService")
public class TeacherServiceImp implements TeacherService {

    @Autowired
    StudentService studentService;

    public String getAllStudents() {
        return "TeacherServiceImp.getAllStudents - " + studentService.getStudent();
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println(studentService.getStudent());
    }
}
