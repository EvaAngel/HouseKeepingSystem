package mapper;

import cn.shouguang.bean.BabyType;

import java.util.List;

public interface BabyTypeMapper {
    //查询家政人员的所有类别
    List<BabyType> queryBabyType();
    Integer queryBabyIdByType(String name);
}
