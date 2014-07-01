package com.spshop.admin.shared;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.user.client.rpc.IsSerializable;

public class PagingAndSortingInfo implements IsSerializable{
	private int start;
	private int length;
	
	private Map<String, Boolean> sortingInfo = new HashMap<String, Boolean>();

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Map<String, Boolean> getSortingInfo() {
		return sortingInfo;
	}

	public void setSortingInfo(Map<String, Boolean> sortingInfo) {
		this.sortingInfo = sortingInfo;
	}
	
	
}
