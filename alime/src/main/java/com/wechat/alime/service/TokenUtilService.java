package com.wechat.alime.service;



import com.wechat.alime.pojo.Token;

public interface TokenUtilService {
	public Token getToken();
	public void saveToken( Token token);
}
