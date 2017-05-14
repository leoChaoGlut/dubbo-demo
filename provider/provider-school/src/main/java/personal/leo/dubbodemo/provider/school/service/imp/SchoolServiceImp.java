package personal.leo.dubbodemo.provider.school.service.imp;

import org.springframework.stereotype.Service;
import personal.leo.dubbodemo.provider.service.SchoolService;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 5/13/17 4:19 AM
 * @Description:
 */
@Service
public class SchoolServiceImp implements SchoolService {
    public String getAllTeachers() {
        return "SchoolServiceImp.getAllTeachers";
    }
}
