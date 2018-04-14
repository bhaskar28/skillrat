package com.training.core.data;

import java.util.Date;

public class FollowerData {
	private Long id;
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private Date createTime;
	
	@Override
	public String toString() {
		return "Data [id=" + id + ", createTime=" + createTime+       "]";
	}
}
