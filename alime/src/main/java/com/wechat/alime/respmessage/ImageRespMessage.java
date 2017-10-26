package com.wechat.alime.respmessage;

import com.wechat.alime.base.BaseRespMessage;

/**
* 类名: ImageRespMessage </br>
* 描述: 图片消息 </br>
* 开发人员： pyp </br>
* 发布版本：V1.0  </br>
 */
public class ImageRespMessage extends BaseRespMessage{
	private String MediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
