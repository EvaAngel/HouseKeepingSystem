package cn.shouguang.bean;

import java.sql.Date;
/*
*  中间表：家政人员与用户的之间表：包括用工时间
* */
public class BabyServiceUser {
    private Integer id;
    private BabyType babyType;
    private SubBabyType subType;
    private Date startTime;
    private Date endTime;
    private String chooseAddress;
    private String advice;
    private User user;
    private BabySitter babySitter;
    private String status;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BabyType getBabyType() {
        return babyType;
    }

    public void setBabyType(BabyType babyType) {
        this.babyType = babyType;
    }

    public SubBabyType getSubType() {
        return subType;
    }

    public void setSubType(SubBabyType subType) {
        this.subType = subType;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getChooseAddress() {
        return chooseAddress;
    }

    public void setChooseAddress(String chooseAddress) {
        this.chooseAddress = chooseAddress;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BabySitter getBabySitter() {
        return babySitter;
    }

    public void setBabySitter(BabySitter babySitter) {
        this.babySitter = babySitter;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
