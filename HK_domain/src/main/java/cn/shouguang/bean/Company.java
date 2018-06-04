package cn.shouguang.bean;

import cn.shouguang.bean.parent.Person;

public class Company extends Person {
    private String corporatehead;
    private String businesslicense;
    private Double capital;
    private String status;

    public String getCorporatehead() {
        return corporatehead;
    }

    public void setCorporatehead(String corporatehead) {
        this.corporatehead = corporatehead;
    }

    public String getBusinesslicense() {
        return businesslicense;
    }

    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
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
