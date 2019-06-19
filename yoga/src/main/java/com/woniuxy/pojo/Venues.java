package com.woniuxy.pojo;

import java.math.BigDecimal;

public class Venues {
    private Integer vid;

    private String vname;

    private BigDecimal vmoney;

    private String vphone;

    private String vqq;

    private String vuri;

    private String vmessage;

    private String vaddress;

    private BigDecimal vx;

    private BigDecimal vy;

    private Integer uid;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname == null ? null : vname.trim();
    }

    public BigDecimal getVmoney() {
        return vmoney;
    }

    public void setVmoney(BigDecimal vmoney) {
        this.vmoney = vmoney;
    }

    public String getVphone() {
        return vphone;
    }

    public void setVphone(String vphone) {
        this.vphone = vphone == null ? null : vphone.trim();
    }

    public String getVqq() {
        return vqq;
    }

    public void setVqq(String vqq) {
        this.vqq = vqq == null ? null : vqq.trim();
    }

    public String getVuri() {
        return vuri;
    }

    public void setVuri(String vuri) {
        this.vuri = vuri == null ? null : vuri.trim();
    }

    public String getVmessage() {
        return vmessage;
    }

    public void setVmessage(String vmessage) {
        this.vmessage = vmessage == null ? null : vmessage.trim();
    }

    public String getVaddress() {
        return vaddress;
    }

    public void setVaddress(String vaddress) {
        this.vaddress = vaddress == null ? null : vaddress.trim();
    }

    public BigDecimal getVx() {
        return vx;
    }

    public void setVx(BigDecimal vx) {
        this.vx = vx;
    }

    public BigDecimal getVy() {
        return vy;
    }

    public void setVy(BigDecimal vy) {
        this.vy = vy;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}