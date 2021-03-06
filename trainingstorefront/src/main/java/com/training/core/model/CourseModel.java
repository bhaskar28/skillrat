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
@Table(name="COURSE")
public class CourseModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="TITLE")
	private String title;
	
	@OneToOne
	@JoinColumn(name = "FIELD")
	private FieldModel field;
	
	@Column(name="CONTENT")
	private String content;
	
	@Column(name="CREATION_TIME")
	private Date creationTime;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public FieldModel getField() {
		return field;
	}
	public void setField(FieldModel field) {
		this.field = field;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
