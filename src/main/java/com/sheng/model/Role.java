package com.sheng.model;

public enum Role {
    MANNAGER(1,"管理员"),
    COMMON(2,"普通会员"),
    VIP(3,"会员用户"),
    GOLD(4,"黄金会员"),
    DIMOND(5,"钻石会员"),
    OTHER(0,"未知用户");
    private int rid;
    private String rolename;

    Role(int rid, String rolename) {
        this.rid = rid;
        this.rolename = rolename;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public static int getByRolename(String rolename){
        for (Role contants : values()){
            if (contants.getRolename() == rolename){
                return contants.getRid();
            }
        }
        return 0;
    }
}
