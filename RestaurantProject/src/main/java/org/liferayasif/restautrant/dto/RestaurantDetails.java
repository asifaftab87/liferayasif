package org.liferayasif.restautrant.dto;

public class RestaurantDetails {

	private String imageURL;
	private String retaurantName;
	private String address;
	
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public String getRetaurantName() {
		return retaurantName;
	}
	public void setRetaurantName(String retaurantName) {
		this.retaurantName = retaurantName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "name: "+retaurantName+"    address: "+address+"   imageUrl: "+imageURL;
	}
}
