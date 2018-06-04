package mapper;

import cn.shouguang.bean.BabyServiceUser;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

public interface BabyServiceUserMapper {
    //向指定user中添加service信息
    public void addService(BabyServiceUser babyServiceUser);
    //向指定user and baby中添加service信息
    public void addServiceAndBaby(BabyServiceUser babyServiceUser);
    //查询与指定时间不冲突且status=1的babyid
    List<Integer> queryBabyIdbyTimeAndStatus(@Param("starttime")Date startTime, @Param("endtime") Date endTime);
}
