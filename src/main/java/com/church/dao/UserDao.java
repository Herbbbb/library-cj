package com.church.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.church.condition.UserCond;
import com.church.model.UserModel;

public interface UserDao {

	public Integer insert(UserModel userModel);
	
	public UserModel queryOne(Long id);
	
	public List<UserModel> queryAll(UserCond cond);
	
	public UserModel queryByName(String name);
	
	public Integer countExist(@Param("uid") Long uid, @Param("role") Integer role);
	
	public Integer update(UserModel userModel);
	
	public Integer updatePassword(Long id, String password);
	
}
