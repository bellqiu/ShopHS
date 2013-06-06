package com.spshop.dto;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

public class SettingSummaryDTO implements IsSerializable, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long detailId;
	private String key;
	private String value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public long getDetailId() {
		return detailId;
	}
	public void setDetailId(long detailId) {
		this.detailId = detailId;
	}
	
	
}

