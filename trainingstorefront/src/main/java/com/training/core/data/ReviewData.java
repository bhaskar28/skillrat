package com.training.core.data;

public class ReviewData 
{
	private Long id;
	private String comment;
	private Integer rating;
	private Long customerId;
	private Long givenByCustomer;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getGivenByCustomer() {
		return givenByCustomer;
	}
	public void setGivenByCustomer(Long givenByCustomer) {
		this.givenByCustomer = givenByCustomer;
	}
	@Override
	public String toString() {
		return "Data [id=" + id + ", givenByCustomer=" + givenByCustomer+", customerId=" + customerId+", rating=" + rating+", comment=" + comment+       "]";
	}
}
