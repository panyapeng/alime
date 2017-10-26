package com.wechat.alime.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wechat.alime.dao.WeixinUserDao;
import com.wechat.alime.pojo.WeixinUserInfo;
import com.wechat.alime.service.WeixinUserInfoService;

@Service("weixinUserInfoService") 
public class WeixinUserInfoServiceImpl implements WeixinUserInfoService{

	@Resource
	private WeixinUserDao weixinUserDao;
	
	@Override
	public void saveUserInfo(WeixinUserInfo weixinUserInfo) {
		weixinUserDao.saveUserInfo(weixinUserInfo);
		
	}

}
