package cn.shouguang.service.util;

import cn.shouguang.bean.BabyServiceUser;
import cn.shouguang.bean.BabySitter;
import mapper.BabyServiceUserMapper;
import mapper.BabySitterMapper;
import mapper.BabyTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OptimalAlgorithm {

    @Autowired
    private BabySitterMapper babySitterMapper;
    @Autowired
    private BabyTypeMapper babyTypeMapper;
    @Autowired
    private BabyServiceUserMapper babyServiceUserMapper;

    /*
    * 根据用户提供信息择优选择家政人员
    * */
    public BabySitter chooseBaby(BabyServiceUser babyServiceUser) {
        // 1 根据服务类型与所在地点挑选家政人员
       // int typeid = babyTypeMapper.queryBabyIdByType(babyServiceUser.getBabyType());
        // 2 获取符合服务类别的家政人员信息
        List<BabySitter> babySitters1 = babySitterMapper.queryBabySitterByType(babyServiceUser.getBabyType().getId());
        // 3 获取符合指定地点的家政人员信息
        List<BabySitter> babySitters2 = babySitterMapper.queryBabySitterByAddress(babyServiceUser.getChooseAddress());
        // 4 获取符合两者的家政人员信息并存入3中
        List<BabySitter> babySitters3 = new ArrayList<BabySitter>();
        for (BabySitter b1 : babySitters1) {
            for (BabySitter b2 : babySitters2) {
                if (b1.getUsername().equals(b2.getUsername()) && b1.getPassword().equals(b2.getPassword())) {
                    babySitters3.add(b1);
                    break;
                }
            }
        }
        // 5 判断服务时间是否空闲？查询babysitter表中时间不冲突的人员信息
        List<Integer> babyids = babyServiceUserMapper.queryBabyIdbyTimeAndStatus(babyServiceUser.getStartTime(), babyServiceUser.getEndTime());
        // 6 将查询到的人员信息按评分高低排序，评分高优先被选择
        BabySitter bestBabySitter = null;
        for (BabySitter babySitter : babySitters3) {
            for (int babyid : babyids) {
                if (babySitter.getId() == babyid) {
                    if (bestBabySitter == null) {
                        bestBabySitter = babySitter;
                    } else {
                        bestBabySitter = bestBabySitter.getCreadit() < babySitter.getCreadit() ? babySitter : bestBabySitter;
                    }
                }
            }
        }
        // 7 将筛选后结果根据人员评分排名，选择第一名。
        return bestBabySitter;
    }

}
