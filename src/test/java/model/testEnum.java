package model;

import com.sheng.model.Role;

public class testEnum {


    public static void main(String[] args) {
        String rolename = "钻石会员";
        System.out.println(Role.getByRolename(rolename));
    }
}
