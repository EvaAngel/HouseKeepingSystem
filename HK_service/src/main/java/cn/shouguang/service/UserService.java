package cn.shouguang.service;

import cn.shouguang.api.UserApi;
import cn.shouguang.bean.BabyServiceUser;
import cn.shouguang.bean.BabySitter;
import cn.shouguang.bean.User;
import cn.shouguang.service.util.OptimalAlgorithm;
import mapper.BabyServiceUserMapper;
import mapper.BabySitterMapper;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserApi {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BabyServiceUserMapper babyServiceUserMapper;
    @Autowired
    private OptimalAlgorithm optimalAlgorithm;
    @Autowired
    private BabySitterMapper babySitterMapper;
    //该方法实现预约家政服务
    public BabySitter orderService(BabyServiceUser babyServiceUser) {
        // 1 根据用户所需信息择优挑选家政人员
        BabySitter babySitter=optimalAlgorithm.chooseBaby(babyServiceUser);
        // 2 调用mapper将家政人员id与用户所需信息存入service表中
        babyServiceUser.setBabySitter(babySitter);
        babyServiceUserMapper.addServiceAndBaby(babyServiceUser);
        // 3 返回家政人员信息到用户列表中
        return babySitter;
    }
    // 在线选人服务
    public List<BabySitter> OnlineSelection() {
        // 通过mapper调用查询功能
        return babySitterMapper.queryBabySitter();
    }
    // 根据服务类型选人服务
    public List<BabySitter> OnlineSelectionByType(Integer typeId) {
        return babySitterMapper.queryBabySitterByType(typeId);
    }
    // 根据工作地址选人服务
    public List<BabySitter> OnlineSelectionByAddress(String address) {
        return babySitterMapper.queryBabySitterByAddress(address);
    }
    // 根据信用等级选人服务
    public List<BabySitter> OnlineSelectionByCreadit(Integer creadit) {
        return null;
    }
    // 根据年龄选人服务
    public List<BabySitter> OnlineSelectionByAge(Integer age) {
        return null;
    }
    //验证登录信息
    public boolean isLogin(String username, String password) {
        List<User> userList=userMapper.queryUser();
        for(User u :userList)
        {
            if(u.getUsername().equals(username)&&u.getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }
}
