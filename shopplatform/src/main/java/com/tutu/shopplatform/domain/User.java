package com.tutu.shopplatform.domain;

public class User {
    private int uid;
    private String uname;
    private String upassword;
    private String uaddress;
    public void setUserId(int userid) {
        this.uid = userid;
    }
    public void setName(String userName) {
        this.uname = userName;
    }
    public void setPassword(String userPassword) {
        this.upassword = userPassword;
    }
    public void setAddress(String userAddress) {
        this.uaddress = userAddress;
    }

    public int getUserId() {
        return uid;
    }
    public String getUserName() {
        return uname;
    }
    public String getUserPassword() {
        return upassword;
    }
    public String getUserAddress() {
        return uaddress;
    }
}
