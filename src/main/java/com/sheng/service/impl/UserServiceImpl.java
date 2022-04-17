package com.sheng.service.impl;

import com.sheng.dao.UserDao;
import com.sheng.model.Role;
import com.sheng.model.User;
import com.sheng.service.UserService;
import com.sheng.vo.User.UserLike;
import com.sheng.vo.User.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<UserVo> queryUsersByQuery(UserLike userlike) {
        return userDao.queryUsersByQuery(userlike);
    }

    @Override
    public int queryTotalByQuery(String query) {
        return userDao.queryTotalByQuery(query);
    }

    @Override
    public int addUser(UserVo userVo) {
        return userDao.addUser(userVo);
    }
}
