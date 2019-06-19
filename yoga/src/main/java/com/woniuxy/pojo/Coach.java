package com.woniuxy.pojo;

import java.math.BigDecimal;

public class Coach {
    private Integer cid;

    private Integer reception;

    private Integer cstate;

    private BigDecimal cmoney;

    private Integer uid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getReception() {
        return reception;
    }

    public void setReception(Integer reception) {
        this.reception = reception;
    }

    public Integer getCstate() {
        return cstate;
    }

    public void setCstate(Integer cstate) {
        this.cstate = cstate;
    }

    public BigDecimal getCmoney() {
        return cmoney;
    }

    public void setCmoney(BigDecimal cmoney) {
        this.cmoney = cmoney;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}