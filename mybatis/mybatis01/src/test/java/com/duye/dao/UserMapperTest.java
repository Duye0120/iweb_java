package com.duye.dao;

import com.duye.bean.User;
import com.duye.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        // 1. 获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        // 2. 执行Sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }

        // 关闭SqlSession
        sqlSession.close();
    }
}
