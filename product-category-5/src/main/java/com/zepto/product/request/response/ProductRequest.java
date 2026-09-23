package com.zepto.product.request.response;

public class ProductRequest {
	
	  private String name;

	    private String description;

	    private String imageUrl;

	    private String active;
	    
	    private String categoryId;

		public String getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
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

		public void setActive(String active) {
			this.active = active;
		}
	    
	    

}
