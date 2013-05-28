package com.spshop.dto;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class ReviewDTO implements Serializable{
	
	private long id;
	
	private int rate;
	private String title;
	private Date postDate;
	private String content;
	private int voteCount;
	private int voteUseful;
	private String author;
	
	public ReviewDTO() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(int voteCount) {
		this.voteCount = voteCount;
	}

	public int getVoteUseful() {
		return voteUseful;
	}

	public void setVoteUseful(int voteUseful) {
		this.voteUseful = voteUseful;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
