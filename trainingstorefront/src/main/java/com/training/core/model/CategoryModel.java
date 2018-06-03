package com.training.core.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORY")
public class CategoryModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="CREATION_TIME")
	private Date creationTime;
	
	@Column(name="HAS_SUB_CATEGORIES")
	private Boolean hasSubCategories;

	@Column(name="HAS_SUP_CATEGORIES")
	private Boolean hasSuperCategories;
	
	@OneToOne
	@JoinColumn(name = "MEDIA")
	private MediaModel media;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Boolean getHasSubCategories() {
		return hasSubCategories;
	}

	public void setHasSubCategories(Boolean hasSubCategories) {
		this.hasSubCategories = hasSubCategories;
	}

	public Boolean getHasSuperCategories() {
		return hasSuperCategories;
	}

	public void setHasSuperCategories(Boolean hasSuperCategories) {
		this.hasSuperCategories = hasSuperCategories;
	}

	public MediaModel getMedia() {
		return media;
	}

	public void setMedia(MediaModel media) {
		this.media = media;
	}
	
}
