package com.wechat.alime.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wechat.alime.dao.TokenDao;
import com.wechat.alime.pojo.Token;
import com.wechat.alime.service.TokenUtilService;

@Service("tokenUtilService")
public class TokenUtilServiceImpl implements TokenUtilService{

	@Resource
	private TokenDao tokenDao;
	
	public Token getToken() {
		Token tokenEntity=new Token();
		try {
			tokenEntity=tokenDao.getToken();
		} catch (Exception e) {
			System.out.println("数据库操作异常：" + e.getMessage());
		}		
		return tokenEntity;
	}

	
	public void saveToken(Token tokenEntity) {
		try {			
			Map map =new HashMap();
			map.put("accessToken",tokenEntity.getAccessToken());
			map.put("expiresin",tokenEntity.getExpiresIn());
			map.put("createtime",new Date().getTime());
			tokenDao.saveToken(map);
		} catch (Exception e) {
			System.out.println("数据库操作异常：" + e.getMessage());
		}
				
	}

}
