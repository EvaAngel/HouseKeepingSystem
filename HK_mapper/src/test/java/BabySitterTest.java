import cn.shouguang.bean.BabySitter;
import mapper.BabySitterMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class BabySitterTest {
    @Autowired
    private BabySitterMapper babySitterMapper;
    @Test
    public void queryBabaSitterByAddressTest()
    {
        String address ="山东省济南市历下区";
        List<BabySitter> babySitters=babySitterMapper.queryBabySitterByAddress(address);
        System.out.println(babySitters.get(0).getRealname());
    }
    @Test
    public void queryBabaSitterByTypeTest()
    {
        Integer typeid=1;
        List<BabySitter> babySitters=babySitterMapper.queryBabySitterByType(typeid);
        System.out.println(babySitters.get(0).getRealname());
    }
}
