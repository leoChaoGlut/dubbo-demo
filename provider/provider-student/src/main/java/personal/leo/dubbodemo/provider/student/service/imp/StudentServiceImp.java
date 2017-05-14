package personal.leo.dubbodemo.provider.student.service.imp;

import org.springframework.stereotype.Service;
import personal.leo.dubbodemo.provider.service.StudentService;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 5/13/17 4:39 AM
 * @Description:
 */
@Service("studentService")
public class StudentServiceImp implements StudentService {
    public String getStudent() {
        return "StudentServiceImp.getStudent";
    }
}
