package com.sheng.service;

import com.sheng.model.User;
import com.sheng.vo.User.UserLike;
import com.sheng.vo.User.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //根据查询条件查询参数
    List<UserVo> queryUsersByQuery(UserLike userlike);

    //模糊查询查总记录是
    int queryTotalByQuery(@Param("query") String query);

    //添加用户
    int addUser(UserVo userVo);
}
