package com.sheng.service;

import com.sheng.vo.Admin.AdminUser;
import com.sheng.vo.Admin.AdminVo;

public interface AdminService {
    AdminVo userLogin(AdminUser adminUser);
}
