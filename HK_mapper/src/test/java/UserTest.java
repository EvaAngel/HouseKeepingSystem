import cn.shouguang.bean.User;
import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void getUser()
    {
       List<User> userList=userMapper.queryUser();
       System.out.println(userList.get(0).getUsername());
    }

}
