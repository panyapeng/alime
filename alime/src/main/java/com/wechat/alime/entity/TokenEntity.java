package com.wechat.alime.entity;

public class TokenEntity {
	private int id;
	private String accessToken;
	private int expressIn;
	private String dateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public int getExpressIn() {
		return expressIn;
	}
	public void setExpressIn(int expressIn) {
		this.expressIn = expressIn;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "TokenEntity [id=" + id + ", accessToken=" + accessToken + ", expressIn=" + expressIn + ", dateTime="
				+ dateTime + "]";
	}
	
}
