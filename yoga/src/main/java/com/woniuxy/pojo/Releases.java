package com.woniuxy.pojo;

public class Releases {
    private Integer rdid;

    private String dm;

    private Integer pon;

    private Integer uid;

    public Integer getRdid() {
        return rdid;
    }

    public void setRdid(Integer rdid) {
        this.rdid = rdid;
    }

    public String getDm() {
        return dm;
    }

    public void setDm(String dm) {
        this.dm = dm == null ? null : dm.trim();
    }

    public Integer getPon() {
        return pon;
    }

    public void setPon(Integer pon) {
        this.pon = pon;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}