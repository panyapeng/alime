package com.wechat.alime.main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.wechat.alime.menu.Button;
import com.wechat.alime.menu.CommonButton;
import com.wechat.alime.menu.ComplexButton;
import com.wechat.alime.menu.Menu;
import com.wechat.alime.pojo.AccessToken;
import com.wechat.alime.util.WeixinUtil;

public class MenuManager {
	 private static Logger log = LoggerFactory.getLogger(MenuManager.class);

	    public static void main(String[] args) {
	        // 第三方用户唯一凭证
	        String appId = "wx77c25950cda8fc00";
	        // 第三方用户唯一凭证密钥
	        String appSecret = "09783f480fee5f4e6bf5047b80e31ba7";

	        // 调用接口获取access_token
	        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);

	        if (null != at) {
	            // 调用接口创建菜单
	            int result = WeixinUtil.createMenu(getMenu(), at.getToken());
	            // 判断菜单创建结果
	            if (0 == result)
	                log.info("菜单创建成功！");
	            else
	                log.info("菜单创建失败，错误码：" + result);
	        }
	    }

	    /**
	     * 组装菜单数据
	     * 
	     * @return
	     */
	    private static Menu getMenu() {
	        CommonButton btn11 = new CommonButton();
	        btn11.setName("早饭");
	        btn11.setType("click");
	        btn11.setKey("11");

	        CommonButton btn12 = new CommonButton();
	        btn12.setName("午饭");
	        btn12.setType("click");
	        btn12.setKey("12");

	        CommonButton btn13 = new CommonButton();
	        btn13.setName("晚饭");
	        btn13.setType("click");
	        btn13.setKey("13");


	        CommonButton btn21 = new CommonButton();
	        btn21.setName("已到达的");
	        btn21.setType("click");
	        btn21.setKey("21");

	        CommonButton btn22 = new CommonButton();
	        btn22.setName("未到达的");
	        btn22.setType("click");
	        btn22.setKey("22");

	        CommonButton btn23 = new CommonButton();
	        btn23.setName("在路上的");
	        btn23.setType("click");
	        btn23.setKey("23");

	        CommonButton btn31 = new CommonButton();
	        btn31.setName("远方的");
	        btn31.setType("click");
	        btn31.setKey("31");

	        CommonButton btn32 = new CommonButton();
	        btn32.setName("身边的");
	        btn32.setType("click");
	        btn32.setKey("32");


	        
	        /**
	         * 微信：  mainBtn1,mainBtn2,mainBtn3底部的三个一级菜单。
	         */
	        
	        ComplexButton mainBtn1 = new ComplexButton();
	        mainBtn1.setName("生活");
	        //一级下有4个子菜单
	        mainBtn1.setSub_button(new CommonButton[] { btn11, btn12, btn13 });

	        
	        ComplexButton mainBtn2 = new ComplexButton();
	        mainBtn2.setName("旅程");
	        mainBtn2.setSub_button(new CommonButton[] { btn21, btn22, btn23});

	        
	        ComplexButton mainBtn3 = new ComplexButton();
	        mainBtn3.setName("他她");
	        mainBtn3.setSub_button(new CommonButton[] { btn31, btn32 });

	        
	        /**
	         * 封装整个菜单
	         */
	        Menu menu = new Menu();
	        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });
	        return menu;
	    }
}
