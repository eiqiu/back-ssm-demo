package com.sheng.service.impl;

import com.sheng.dao.AdminDao;
import com.sheng.service.AdminService;
import com.sheng.vo.Admin.AdminUser;
import com.sheng.vo.Admin.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public AdminVo userLogin(AdminUser adminUser) {
        return adminDao.userLogin(adminUser);
    }
}
