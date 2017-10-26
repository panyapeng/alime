package com.wechat.alime.event;

import com.wechat.alime.base.BaseEvent;

/**
* 类名: QRCodeEvent 
* 描述: 扫描带参数二维码事件 
* 开发人员： pyp 
* 发布版本：V1.0  
 */
public class QRCodeEvent extends BaseEvent {

	// 事件KEY值
    private String EventKey;
    // 用于换取二维码图片
    private String Ticket;

    public String getEventKey() {
        return EventKey;
    }

    public void setEventKey(String eventKey) {
        EventKey = eventKey;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
    }
}
