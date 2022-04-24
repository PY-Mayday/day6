package com.tutu.shopplatform.domain;

public class Order {
    private int oid;
    private int uid;
    private int did;
    private int otime;
    private String oaddress;
    private int oriprice;
    private int realprice;

    public int getoid() {
        return oid;
    }

    public int getuid() {
        return uid;
    }

    public int getdid() {
        return did;
    }

    public int getotime() {
        return otime;
    }

    public String getoaddress() {
        return oaddress;
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

    public void setuid(int uid) {
        this.uid = uid;
    }

    public void setotime(int otime) {
        this.otime = otime;
    }

    public void setdid(int did) {
        this.did = did;
    }

    public void setoaddress(String oaddress) {
        this.oaddress = oaddress;
    }

    public void setoriprice(int oriprice) {
        this.oriprice = oriprice;
    }

    public void setrealprice(int realprice) {
        this.realprice = realprice;
    }

}
