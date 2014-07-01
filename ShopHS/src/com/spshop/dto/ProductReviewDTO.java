package com.spshop.dto;

import java.io.Serializable;

public class ProductReviewDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5879237076591725306L;
	private int overallReating;
	private int rateCount;
	
	public int getOverallReating() {
		return overallReating;
	}
	public void setOverallReating(int overallReating) {
		this.overallReating = overallReating;
	}
	public int getRateCount() {
		return rateCount;
	}
	public void setRateCount(int rateCount) {
		this.rateCount = rateCount;
	}
}
