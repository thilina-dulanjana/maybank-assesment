package com.maybank.assesment.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "product", schema = "maybank")
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id", unique = true, nullable = false, updatable = false, length = 10)
    private int productId;
    
    @Column(name = "title", nullable = false, length = 150)
	private String productTitle;
    
    @Column(name = "description" , length = 650)
	private String productDescription;
	
	@Column(name = "url", nullable = false, length = 250) 
    private String productUrl;
    
    @Column(name = "price", nullable = false)
	private double productPrice;
	
	@Column(name = "msrp")
	private int productMsrp;
    
    @Column(name = "available", nullable = false)
    private boolean productAvailability;
    
    @ManyToOne( fetch = FetchType.LAZY )    
    @JoinColumn(name="catregory_id")
    @JsonBackReference
    private Category category;
    
    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn(name="merchant_id")
    @JsonBackReference
	private Merchant merchant;
	
	// @OneToMany( mappedBy = "imageId" , cascade = CascadeType.DETACH, fetch = FetchType.LAZY, targetEntity = Image.class )
	// private List<String> imageUrls;
	

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return this.productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductUrl() {
        return this.productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public double getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductMsrp() {
        return this.productMsrp;
    }

    public void setProductMsrp(int productMsrp) {
        this.productMsrp = productMsrp;
    }

    public boolean isProductAvailability() {
        return this.productAvailability;
    }

    public boolean getProductAvailability() {
        return this.productAvailability;
    }

    public void setProductAvailability(boolean productAvailability) {
        this.productAvailability = productAvailability;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


    public Merchant getMerchant() {
        return this.merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

	    // public List<String> getImageUrls() {
    //     return this.imageUrls;
    // }

    // public void setImageUrls(List<String> imageUrls) {
    //     this.imageUrls = imageUrls;
    // }
}