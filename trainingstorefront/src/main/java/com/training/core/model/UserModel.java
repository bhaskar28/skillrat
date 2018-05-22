package com.training.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Table(name="USER")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class UserModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	
	@Column(name="CREATION_TIME")
	private Date creationTime;
	
	@Column(name="MODIFIED_TIME")
	private Date modifiedTime;
	
	@OneToOne
	@JoinColumn(name = "CREATED_BY")
	private UserModel createBy;
	
	@OneToOne
	@JoinColumn(name = "MODIFIED_BY")
	private UserModel modifiedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public UserModel getCreateBy() {
		return createBy;
	}

	public void setCreateBy(UserModel createBy) {
		this.createBy = createBy;
	}

	public UserModel getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(UserModel modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
}
