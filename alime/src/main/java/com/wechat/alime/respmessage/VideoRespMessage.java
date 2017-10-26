package com.wechat.alime.respmessage;

import com.wechat.alime.base.BaseRespMessage;

/**
* 类名: VideoRespMessage </br>
* 描述: 视频消息</br>
* 开发人员： pyp </br>
* 发布版本：V1.0  </br>
 */
public class VideoRespMessage extends BaseRespMessage{
	 // 媒体文件id
    private String MediaId;
    // 缩略图的媒体id
    private String ThumbMediaId;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getThumbMediaId() {
        return ThumbMediaId;
    }

    public void setThumbMediaId(String thumbMediaId) {
        ThumbMediaId = thumbMediaId;
    }
}
