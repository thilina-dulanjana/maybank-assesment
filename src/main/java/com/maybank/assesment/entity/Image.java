package com.maybank.assesment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "image" ,schema = "maybank" )
public class Image {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	@Column(name = "image_id", unique = true, nullable = false, length = 10)
	private int imageId;
	
	@Column(name = "image_url", nullable = false)
	private String imageUrl;
	
	@Column(name = "product_id", nullable = false)
	private int productId;
    

    public int getImageId() {
        return this.imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
    
}