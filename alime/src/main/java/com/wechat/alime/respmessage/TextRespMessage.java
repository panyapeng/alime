package com.wechat.alime.respmessage;

import com.wechat.alime.base.BaseRespMessage;

/**
* 类名: TextRespMessage </br>
* 描述: 文本消息 </br>
* 开发人员： pyp </br>
* 发布版本：V1.0  </br>
 */
public class TextRespMessage extends BaseRespMessage{
	 // 回复的消息内容
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
