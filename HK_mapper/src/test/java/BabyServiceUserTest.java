import cn.shouguang.bean.BabyServiceUser;
import cn.shouguang.bean.BabyType;
import cn.shouguang.bean.SubBabyType;
import cn.shouguang.bean.User;
import mapper.BabyServiceUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class BabyServiceUserTest {
    @Autowired
    private BabyServiceUserMapper babyServiceUserMapper;
    @Test
    public void addServiceTest()
    {
        BabyServiceUser babyServiceUser=new BabyServiceUser();
        BabyType babyType=new BabyType();
        babyType.setId(2);
        babyServiceUser.setBabyType(babyType);
        SubBabyType subBabyType=new SubBabyType();
        subBabyType.setId(10);
        babyServiceUser.setSubType(subBabyType);
        babyServiceUser.setStartTime(Date.valueOf("2018-02-01"));
        babyServiceUser.setEndTime(Date.valueOf("2018-05-01"));
        babyServiceUser.setChooseAddress("山东省济南市历下区");
        babyServiceUser.setAdvice("需要找一个尽职尽责的保姆，不提供住宿条件");
        User user=new User();
        user.setId(1);
        babyServiceUser.setUser(user);
        babyServiceUser.setStatus("1");
        babyServiceUserMapper.addService(babyServiceUser);
    }

}
