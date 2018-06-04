package cn.shouguang.api;

import cn.shouguang.bean.BabyServiceUser;
import cn.shouguang.bean.BabySitter;
import cn.shouguang.bean.BabyType;

import java.sql.Date;
import java.util.List;

public interface UserApi {
    //登录服务
    //注册服务
    //快速预约服务：根据用户条件自动匹配家政人员
    public BabySitter orderService(BabyServiceUser babyServiceUser);
    // 在线选人服务
    public List<BabySitter> OnlineSelection();
    // 根据服务类型选人服务
    public List<BabySitter> OnlineSelectionByType(Integer typeId);
    // 根据工作地址选人服务
    public List<BabySitter> OnlineSelectionByAddress(String address);
    // 根据信用等级选人服务
    public List<BabySitter> OnlineSelectionByCreadit(Integer creadit);
    // 根据年龄选人服务
    public List<BabySitter> OnlineSelectionByAge(Integer age);
    //用户登录页面
    public boolean isLogin(String username,String password);
}
