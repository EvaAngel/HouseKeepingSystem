package mapper;

import cn.shouguang.bean.Company;

import java.util.List;

public interface CompanyMapper {
    //查询所有的门店信息
    public List<Company> queryAllCompany();
}
