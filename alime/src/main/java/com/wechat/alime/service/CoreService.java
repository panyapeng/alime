package com.wechat.alime.service;

import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import com.wechat.alime.respmessage.TextRespMessage;
import com.wechat.alime.util.MessageUtil;

/**
* 类名: CoreService </br>
* 描述: 核心服务类 </br>
* 开发人员： pyp </br>
* 发布版本：V1.0  </br>
 */
public class CoreService {
    /**
     * 处理微信发来的请求
     * @param request
     * @return xml
     */
    public static String processRequest(HttpServletRequest request) {
        // xml格式的消息数据
        String respXml = null;
        // 默认返回的文本消息内容
        String respContent = "未知的消息类型！";
        try {
            // 调用parseXml方法解析请求消息
            Map<String, String> requestMap = MessageUtil.parseXml(request);
            // 发送方帐号
            String fromUserName = requestMap.get("FromUserName");
            // 开发者微信号
            String toUserName = requestMap.get("ToUserName");
            // 消息类型
            String msgType = requestMap.get("MsgType");

            // 回复文本消息
            TextRespMessage textRespMessage = new TextRespMessage();
            textRespMessage.setToUserName(fromUserName);
            textRespMessage.setFromUserName(toUserName);
            textRespMessage.setCreateTime(new Date().getTime());
            textRespMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);

            // 文本消息
            if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
                respContent = "您发送的是文本消息！";
            }
            // 图片消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
                respContent = "来张自拍给我养养眼呗！";
            }
            // 语音消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
                respContent = "别给我整这么难的啊，我还小！";
            }
            // 视频消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VIDEO)) {
                respContent = "视频看多了对眼不好，我不看！";
            }
            // 视频消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_SHORTVIDEO)) {
                respContent = "要整咱们就整大的，别玩小的了！";
            }
            // 地理位置消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
                respContent = "您给我位置我也过不去啊！";
            }
            // 链接消息
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
                respContent = "您给我链接也没啥用，我定力好，不会点的！";
            }
            // 事件推送
            else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
                // 事件类型
                String eventType = requestMap.get("Event");
                // 关注
                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
                    respContent = "谢谢您的关注！";
                }
                // 取消关注
                else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
                    // TODO 取消订阅后用户不会再收到公众账号发送的消息，因此不需要回复
                }
                // 扫描带参数二维码
                else if (eventType.equals(MessageUtil.EVENT_TYPE_SCAN)) {
                    // TODO 处理扫描带参数二维码事件
                }
                // 上报地理位置
                else if (eventType.equals(MessageUtil.EVENT_TYPE_LOCATION)) {
                    // TODO 处理上报地理位置事件
                }
                // 自定义菜单
                else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
                    // TODO 处理菜单点击事件
                }
            }
            // 设置文本消息的内容
            textRespMessage.setContent(respContent);
            // 将文本消息对象转换成xml
            respXml = MessageUtil.messageToXml(textRespMessage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respXml;
    }
}   