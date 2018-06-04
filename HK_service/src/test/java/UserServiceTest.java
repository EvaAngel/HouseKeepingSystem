import cn.shouguang.bean.*;
import cn.shouguang.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")
public class UserServiceTest {
    @Autowired
    private UserService userService;
    @Test
    public void orderServiceTest()
    {
        BabyServiceUser babyServiceUser=new BabyServiceUser();
        BabyType babyType=new BabyType();
        babyType.setId(3);
        babyServiceUser.setBabyType(babyType);
        SubBabyType subBabyType=new SubBabyType();
        subBabyType.setId(18);
        babyServiceUser.setSubType(subBabyType);
        babyServiceUser.setStartTime(Date.valueOf("2020-02-01"));
        babyServiceUser.setEndTime(Date.valueOf("2020-05-01"));
        babyServiceUser.setChooseAddress("山东省济南市历下区");
        babyServiceUser.setAdvice("需要找一个尽职尽责的月嫂，并且常驻家中，可以护理婴幼儿");
        User user=new User();
        user.setId(1);
        babyServiceUser.setUser(user);
        babyServiceUser.setStatus("1");
        // 预约服务功能测试
        BabySitter babySitter=userService.orderService(babyServiceUser);
    }
}
