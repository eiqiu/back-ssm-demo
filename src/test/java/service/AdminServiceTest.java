package service;

import com.sheng.service.impl.AdminServiceImpl;
import com.sheng.vo.Admin.AdminUser;
import com.sheng.vo.Admin.AdminVo;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdminServiceTest extends TestCase {
    public void testUserLogin() {
        AdminUser adminUser = new AdminUser("admin","1");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminServiceImpl adminService = context.getBean("adminServiceImpl", AdminServiceImpl.class);
        AdminVo adminVo = adminService.userLogin(adminUser);
        System.out.println(adminVo);
    }
}
