package com.sheng.dao;

import com.sheng.vo.Admin.AdminUser;
import com.sheng.vo.Admin.AdminVo;
import org.apache.ibatis.annotations.Param;

public interface AdminDao {
    AdminVo userLogin(@Param("adminUser") AdminUser adminUser);
}
