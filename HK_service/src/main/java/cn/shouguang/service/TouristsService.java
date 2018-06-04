package cn.shouguang.service;

import cn.shouguang.api.TouristsApi;
import cn.shouguang.bean.Company;
import mapper.CompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TouristsService implements TouristsApi {

    @Autowired
    private CompanyMapper companyMapper;
    public List<Company> queryAllCompany() {
        return companyMapper.queryAllCompany();
    }
}
