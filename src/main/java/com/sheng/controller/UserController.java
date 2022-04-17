package com.sheng.controller;

import com.sheng.model.Role;
import com.sheng.model.User;
import com.sheng.service.UserService;
import com.sheng.vo.JsonVo;
import com.sheng.vo.Meta;
import com.sheng.vo.User.UserLike;
import com.sheng.vo.User.UserListVo;
import com.sheng.vo.User.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    //查询用户
    @RequestMapping(value = "/userList", produces = "application/json;charset=utf-8",
            method = RequestMethod.GET)
    public @ResponseBody JsonVo userList(UserLike userlike){
        userlike.setStartIndex(userlike.getPageSize(),userlike.getPageNum());
        Meta meta = new Meta();
        JsonVo jsonVo = new JsonVo();
        List<UserVo> userVoList = userService.queryUsersByQuery(userlike);
        int num = userService.queryTotalByQuery(userlike.getQuery());
        if(userVoList.size()==0){
            meta.setStatus(400);
            meta.setMsg("查询失败");
            jsonVo.setMeta(meta);
            return jsonVo;
        }
        UserListVo userListVo = new UserListVo();
        userListVo.setUserVoList(userVoList);
        userListVo.setPageNum(userlike.getPageNum());
        userListVo.setTotalPage(num);
        meta.setMsg("获取成功");
        meta.setStatus(200);
        jsonVo.setData(userListVo);
        jsonVo.setMeta(meta);
        return jsonVo;
    }

    //添加用户
    @RequestMapping(value = "/addUser", produces = "application/json;charset=utf-8")
    public @ResponseBody JsonVo addUser(@RequestBody UserVo userVo){
        //userVo.setRid(Role.getByRolename(userVo.getRolename()).getRid());
        System.out.println(userVo.getRolename());

        Meta meta = new Meta();
        JsonVo jsonVo = new JsonVo();
        System.out.println(userVo.toString());
        int ifSucceed = userService.addUser(userVo);
        if (ifSucceed == 1){
            meta.setMsg("添加成功");
            meta.setStatus(200);
        }else {
            meta.setMsg("添加失败");
            meta.setStatus(400);
        }
        jsonVo.setMeta(meta);
        return jsonVo;
    }
}
