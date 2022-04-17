package com.sheng.vo.Admin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 用于前端传来的json参数封装成实体
 */
public class AdminUser {
    private String username;
    private String password;
}
