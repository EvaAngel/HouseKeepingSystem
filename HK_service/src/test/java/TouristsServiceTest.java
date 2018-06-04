import cn.shouguang.bean.Company;
import cn.shouguang.service.TouristsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext-*.xml")
public class TouristsServiceTest {
    @Autowired
    private TouristsService touristsService;
    @Test
    public void queryAllCompanyTest()
    {
        List<Company> companies=touristsService.queryAllCompany();
        System.out.println(companies.get(0).getCorporatehead());
    }
}
