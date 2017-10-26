package com.wechat.alime.util;


import org.springframework.beans.factory.annotation.Autowired;

import com.wechat.alime.pojo.Token;
import com.wechat.alime.service.TokenUtilService;



public class TokenUtil {
	
	@Autowired
	TokenUtilService tokenUtilService;
		/**
	    * 方法名：getToken</br>
	    * 详述：从数据库里面获取token</br>
	    * 开发人员：pyp </br>
	    * @return
	    * @throws
	     */
	public Token getToken(){
		return tokenUtilService.getToken();
	}
	public void saveToken(Token tokenEntity){
		tokenUtilService.saveToken(tokenEntity);
	}
}
