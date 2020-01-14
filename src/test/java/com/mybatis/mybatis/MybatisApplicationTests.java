package com.mybatis.mybatis;

import com.mybatis.mybatis.dao.User;
import com.mybatis.mybatis.mapper.UserMapper;
import com.mybatis.mybatis.service.TestService;
import org.apache.ibatis.jdbc.SQL;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Autowired
	TestService testService;

	@Test
	void contextLoads() throws Exception {
		System.out.println(userMapper.getUser().size());

	}

	@Test
	public void test(){
		testService.test();
	}

}
