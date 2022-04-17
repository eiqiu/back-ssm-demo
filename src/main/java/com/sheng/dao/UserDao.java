package com.sheng.dao;

import com.sheng.model.User;
import com.sheng.vo.User.UserLike;
import com.sheng.vo.User.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<UserVo> queryUsersByQuery(@Param("userLike") UserLike userLike);

    //模糊查询查总记录是
    int queryTotalByQuery(@Param("query") String query);

    //添加用户
    int addUser(@Param("user") UserVo userVo);
}
