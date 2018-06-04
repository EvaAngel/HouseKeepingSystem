package cn.shouguang.bean;

import cn.shouguang.bean.parent.Person;

import java.sql.Date;

public class BabySitter extends Person{
    private String avatar;
    private String experiment;
    private Date choosetime;
    private String chooseaddress;
    private User user;
    private Company company;
    private BabyType babyType;
    private String status;

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getExperiment() {
        return experiment;
    }

    public void setExperiment(String experiment) {
        this.experiment = experiment;
    }

    public Date getChoosetime() {
        return choosetime;
    }

    public void setChoosetime(Date choosetime) {
        this.choosetime = choosetime;
    }

    public String getChooseaddress() {
        return chooseaddress;
    }

    public void setChooseaddress(String chooseaddress) {
        this.chooseaddress = chooseaddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public BabyType getBabyType() {
        return babyType;
    }

    public void setBabyType(BabyType babyType) {
        this.babyType = babyType;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }
}
