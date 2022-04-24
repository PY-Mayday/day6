package com.tutu.shopplatform.domain;

public class Product {
    private String pname;
    private int pid;
    private int sid;
    private int pprice;

    public String getPname() {
        return pname;
    }

    public int getPid() {
        return pid;
    }

    public int getSid() {
        return sid;
    }

    public int getPprice() {
        return pprice;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }
}
