package cn.shouguang.api;

import cn.shouguang.bean.Company;

import java.util.List;

// 对未登录人员提供的服务
public interface TouristsApi {
    //查询家政人员信息

    //查询家政门店信息
    public List<Company> queryAllCompany();
    //根据服务类型查询家政门店信息

    //根据服务地点查询家政门店信息

    //根据门店查询所在门店的人员信息
    //登录功能
    //注册功能

}
