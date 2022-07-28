package com.npci.thymeleaf.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productid")
	private Integer productid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sku")
	private String sku;
	
	

	@Column(name = "description")
	private String description;
	
	@Column(name = "unitprice")
	private double unitprice;
	
	@Column(name = "imageurl")
	private String imageurl;
	
	@Column(name = "unitsinstock")
	private Integer unitsinstock;
	
	@Column(name = "datecreated")
	private Date datecreated;
	
	@Column(name = "lastupdated")
	private Date lastupdated;
	
	@Column(name = "categoryid")
	private Integer categoryid;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer productid, String name,String sku, String description, double unitprice, String imageurl, Integer unitsinstock,
			Date datecreated, Date lastupdated, Integer categoryid) {
		super();
		this.productid = productid;
		this.name = name;
		this.sku = sku;
		this.description = description;
		this.unitprice = unitprice;
		this.imageurl = imageurl;
		this.unitsinstock = unitsinstock;
		this.datecreated = datecreated;
		this.lastupdated = lastupdated;
		this.categoryid = categoryid;
	}

	public Integer getProductid() {
		return productid;
	}

	public void setProductid(Integer productid) {
		this.productid = productid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public Integer getUnitsinstock() {
		return unitsinstock;
	}

	public void setUnitsinstock(Integer unitsinstock) {
		this.unitsinstock = unitsinstock;
	}

	public Date getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}

	public Date getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}

	public Integer getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(Integer categoryid) {
		this.categoryid = categoryid;
	}

	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", description=" + description + ", unitprice="
				+ unitprice + ", imageurl=" + imageurl + ", unitsinstock=" + unitsinstock + ", datecreated="
				+ datecreated + ", lastupdated=" + lastupdated + ", categoryid=" + categoryid + "]";
	}
	
	

}
