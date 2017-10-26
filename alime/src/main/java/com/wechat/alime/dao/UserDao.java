package com.wechat.alime.dao;


import org.apache.ibatis.annotations.Param;



public interface UserDao {
	String  selectByPrimaryKey(@Param("userid")String userid);
}
