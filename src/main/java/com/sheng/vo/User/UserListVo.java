package com.sheng.vo.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserListVo {
    //总记录数
    private int totalPage;
    //当前页码
    private  int pageNum;

    private List<UserVo> userVoList;
}
