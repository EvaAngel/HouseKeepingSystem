package mapper;

import cn.shouguang.bean.BabySitter;

import java.util.List;

public interface BabySitterMapper {
    //查询所有的家政人员信息
    List<BabySitter> queryBabySitter();
    //根据地点选择家政人员
    List<BabySitter> queryBabySitterByAddress(String address);
    //根据类别id选择家政人员
    List<BabySitter> queryBabySitterByType(Integer typeid);

}
