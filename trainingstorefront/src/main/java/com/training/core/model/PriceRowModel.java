package com.training.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRICE_ROW")
public class PriceRowModel 
{
	@Id
	@GeneratedValue
	private Long id;
	
	
}
