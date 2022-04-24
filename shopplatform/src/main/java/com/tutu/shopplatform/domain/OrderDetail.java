package com.tutu.shopplatform.domain;

public class OrderDetail {
    private int oid;
    private int pid;
    private int pnum;
    private int oriprice;
    private int realprice;

    public int getoid() {
        return oid;
    }

    public int getpid() {
        return pid;
    }

    public int getpnum() {
        return pnum;
    }

    public int getoriprice() {
        return oriprice;
    }

    public int getrealprice() {
        return realprice;
    }


    public void setoid(int oid) {
        this.oid = oid;
    }

    public void setpid(int pid) {
        this.pid = pid;
    }

    public void setpnum(int pnum) {
        this.pnum = pnum;
    }

    public void setoriprice(int oriprice) {
        this.oriprice = oriprice;
    }

    public void setrealprice(int realprice) {
        this.realprice = realprice;
    }

}
