package com.wechat.alime.dao;



import java.util.Map;

import com.wechat.alime.pojo.Token;


public interface TokenDao {
	Token  getToken();
	void saveToken(Map map);
}
