package com.sheng.controller;

import com.sheng.service.AdminService;
import com.sheng.util.JWTUtils;
import com.sheng.vo.Admin.AdminUser;
import com.sheng.vo.Admin.AdminVo;
import com.sheng.vo.JsonVo;
import com.sheng.vo.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class LoginController {
    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody JsonVo userLogin(@RequestBody AdminUser adminUser){
        //  jsonvo对象
        JsonVo jsonVo = new JsonVo();
        AdminVo adminVo = adminService.userLogin(adminUser);
        //  创建状态信息
        Meta meta = new Meta();
        if (adminVo == null) {
            meta.setMsg("用户名或密码错误");
            meta.setStatus(400);
            jsonVo.setMeta(meta);
            return jsonVo;
        } else {
            meta.setMsg("登陆成功");
            meta.setStatus(200);
            //  封装token令牌
            HashMap<String,String> map = new HashMap<>();
            map.put("id", adminVo.getAdminid()+"");
            map.put("username", adminVo.getUsername());
            String token = JWTUtils.getToken(map);
            adminVo.setToken(token);
            //  封装数据admin meta
            jsonVo.setData(adminVo);
            jsonVo.setMeta(meta);
            return jsonVo;
        }
    }
}
