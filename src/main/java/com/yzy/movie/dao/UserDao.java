package com.yzy.movie.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yzy.movie.entity.UserTest;

@Repository("userDao")
public interface UserDao {

	@Select("select * from user where u_id=#{id}")
	@Results({
		@Result(id=true,property="id",column="u_id"),
		@Result(property="password",column="u_passwd")
	})
	UserTest finOne(String id);
}
