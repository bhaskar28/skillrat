package com.training.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FOLLOWER")
public class FollowerModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="CREATION_TIME")
	private Date createTime;
}
