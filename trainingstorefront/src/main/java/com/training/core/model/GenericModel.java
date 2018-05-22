package com.training.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class GenericModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="CREATION_TIME")
	private Date creationTime;
	
	@Column(name="MODIFIED_TIME")
	private Date modifiedTime;
	
	
}
