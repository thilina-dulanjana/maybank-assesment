package com.maybank.assesment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "category" )
@Table(name = "category", schema = "maybank")
public class Category implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, unique = true, length = 10)
	private int categorId;
	
	@Column(name = "category_name", length = 500)
	private String categoryDesc;
	
	@Column(name = "parent_id", length = 50, nullable = false)
	private int parentId;

	public int getCategorId() {
		return categorId;
	}

	public void setCategorId(int categorId) {
		this.categorId = categorId;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
    
    public int getParentId() {
        return this.parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

}