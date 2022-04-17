package com.sheng.vo.Admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminVo {
    private int adminid;
    private String username;
    private String password;
    private String token;
}
