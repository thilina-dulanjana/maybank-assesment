package com.maybank.assesment.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
    @ManyToOne(cascade = CascadeType.DETACH ,targetEntity = Product.class)
	@JoinColumn(name = "product_id")
    private Product product;
    

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

}