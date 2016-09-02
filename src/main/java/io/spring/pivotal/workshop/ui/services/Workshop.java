package io.spring.pivotal.workshop.ui.services;

public class Workshop {
	
	private String title;
	private String description;
	private String date;
	private String customerLogo;
	private String contentURL;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCustomerLogo() {
		return customerLogo;
	}

	public void setCustomerLogo(String customerLogo) {
		this.customerLogo = customerLogo;
	}
	
	public String getContentURL() {
		return contentURL;
	}

	public void setContentURL(String contentURL) {
		this.contentURL = contentURL;
	}
}
