package com.zepto.category.entity;

import java.util.List;

import com.zepto.product.entity.ProductEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Category")
public class CategoryEntity 
{

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String name;

	    private String description;

	    private String imageUrl;

	    private String active;
	    
	    @OneToMany(mappedBy = "category" , cascade = CascadeType.ALL)
	    private List<ProductEntity> prodducts;

		public int getId() {
			return id;
		}

		public void setId(int id) {
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

		public String getImageUrl() {
			return imageUrl;
		}

		public void setImageUrl(String imageUrl) {
			this.imageUrl = imageUrl;
		}

		public String getActive() {
			return active;
		}

		public void setActive (String active) {
			this.active = active;
		}
	
}
