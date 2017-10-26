package com.wechat.alime.service.impl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.wechat.alime.dao.UserDao;
import com.wechat.alime.service.UserService;



@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserDao userDao;  
    
    
 
    public String getUserById(String userid) {  
//    	System.out.println(userid+"=================");
//    	Map hashMap=new HashMap();
//        hashMap=this.userDao.selectByPrimaryKey(userid);
//        System.out.println(hashMap.size());
        String userName=this.userDao.selectByPrimaryKey(userid);
//        System.out.println(hashMap.get("username").toString());
//        user.setId(hashMap.get("userid").toString());
//        user.setUserName(hashMap.get("username").toString());
        return userName;  
    }  
  
}  
