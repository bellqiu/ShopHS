package com.spshop.review.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class ReviewListPlace extends Place{
	
	private static final String REVIEW_LIST_PLACE = "REVIEW_LIST";
	
	public static class Tokenizer implements PlaceTokenizer<ReviewListPlace>{

		@Override
		public String getToken(ReviewListPlace place){
			return REVIEW_LIST_PLACE;
		}

		@Override
		public ReviewListPlace getPlace(String token){
			return new ReviewListPlace();
		}

	}
	
}
