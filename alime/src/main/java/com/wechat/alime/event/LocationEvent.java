package com.wechat.alime.event;

import com.wechat.alime.base.BaseEvent;

/**
* 类名: LocationEvent 
* 描述: 上报地理位置事件
* 开发人员： pyp 
* 发布版本：V1.0  
 */
public class LocationEvent extends BaseEvent {
	
	// 地理位置纬度
    private String Latitude;
    // 地理位置经度
    private String Longitude;
    // 地理位置精度
    private String Precision;

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

    public String getPrecision() {
        return Precision;
    }

    public void setPrecision(String precision) {
        Precision = precision;
    }
}
