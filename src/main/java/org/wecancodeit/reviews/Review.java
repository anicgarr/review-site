package org.wecancodeit.reviews;

public class Review {

	private long id;
	private String title;
	private String reviewCategory;

	public Review(long id, String title, String reviewCategory, String content, String imageUrl) {
		this.id=id;
		this.title=title;
		this.reviewCategory=reviewCategory;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String getReviewCategory() {
		return reviewCategory;
	}
}
