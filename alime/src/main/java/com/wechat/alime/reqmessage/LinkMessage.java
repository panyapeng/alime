package com.wechat.alime.reqmessage;

import com.wechat.alime.base.BaseMessage;

/**
* 类名: LinkMessage 
* 描述: 请求消息之链接消息 
* 开发人员： pyp 
* 发布版本：V1.0  
 */
public class LinkMessage extends BaseMessage{
	 // 消息标题
    private String Title;
    // 消息描述
    private String Description;
    // 消息链接
    private String Url;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
