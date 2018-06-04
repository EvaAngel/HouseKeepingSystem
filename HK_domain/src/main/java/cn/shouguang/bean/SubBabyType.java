package cn.shouguang.bean;

public class SubBabyType {
    private Integer id;
    private String subType;
    private BabyType babyType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public BabyType getBabyType() {
        return babyType;
    }

    public void setBabyType(BabyType babyType) {
        this.babyType = babyType;
    }
}
