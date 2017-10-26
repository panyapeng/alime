package com.wechat.alime.reqmessage;

import com.wechat.alime.base.BaseMessage;

/**
* 类名: TextMessage 
* 描述: 请求消息之文字消息 
* 开发人员： pyp 
* 发布版本：V1.0  
 */
public class TextMessage extends BaseMessage {

	private String Content;
	public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }		
}
