package com.wechat.alime.reqmessage;

import com.wechat.alime.base.BaseMessage;

/**
* 类名: ImageMessage 
* 描述: 请求消息之图片消息 
* 开发人员： pyp 
* 发布版本：V1.0  
 */
public class ImageMessage extends BaseMessage{
	 private String PicUrl;
	    private String MediaId;

	    public String getPicUrl() {
	        return PicUrl;
	    }

	    public void setPicUrl(String picUrl) {
	        PicUrl = picUrl;
	    }

	    public String getMediaId() {
	        return MediaId;
	    }

	    public void setMediaId(String mediaId) {
	        MediaId = mediaId;
	    }

}
