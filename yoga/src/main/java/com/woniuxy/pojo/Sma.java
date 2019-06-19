package com.woniuxy.pojo;

public class Sma {
    private Integer smid;

    private Integer time;

    private Integer smstate;

    private Integer sid;

    private String cid;

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getSmstate() {
        return smstate;
    }

    public void setSmstate(Integer smstate) {
        this.smstate = smstate;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }
}