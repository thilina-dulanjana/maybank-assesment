package com.maybank.assesment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "merchant")
@Table(name = "merchant", schema = "maybank")
public class Merchant implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true, length = 10)
    private int merchantId;

    /*
     * @OneToMany(cascade = CascadeType.ALL, mappedBy = "productId", targetEntity =
     * Product.class) private Set<Product> products;
     */

    @Column(name = "name", nullable = false, length = 200)
    private String merchantName;


    public int getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(int merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }
}