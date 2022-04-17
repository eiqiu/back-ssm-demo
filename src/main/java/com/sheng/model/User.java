package com.sheng.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userid;
    private int rid;
    private String username;
    private String password;
    private String mobile;
    private String email;
    private Date create_time;
    private boolean login_status;
}
