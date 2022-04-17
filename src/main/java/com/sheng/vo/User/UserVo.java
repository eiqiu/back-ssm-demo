package com.sheng.vo.User;


import com.sheng.model.Role;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserVo {
    //返回给前端的数据
    private int userid;
    private int rid;
    private String sex;
    private String username;
    private String password;
    private String mobile;
    private String email;
    private String create_time;
    private Date create_time_cuo;
    private boolean loginStatus;
    private String rolename;

    public UserVo(){
        super();
    }
    public UserVo(int userid, int rid, String username, String sex, String password, String mobile, String email, Date create_time_cuo, boolean loginStatus, String rolename) {
        this.userid = userid;
        this.rid = rid;
        this.sex = sex;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.email = email;
        this.create_time_cuo = create_time_cuo;
        this.loginStatus = loginStatus;
        this.rolename = rolename;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time_cuo) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.create_time = sf.format(create_time_cuo);
    }

    public Date getCreate_time_cuo() {
        return create_time_cuo;
    }

    public void setCreate_time_cuo(Date create_time_cuo) {
        this.create_time_cuo = create_time_cuo;
        this.setCreate_time(create_time_cuo);
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean login_status) {
        this.loginStatus = login_status;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "userid=" + userid +
                ", rid=" + rid +
                ", sex='" + sex + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", create_time='" + create_time + '\'' +
                ", create_time_cuo=" + create_time_cuo +
                ", loginStatus=" + loginStatus +
                ", rolename='" + rolename + '\'' +
                '}';
    }
}
