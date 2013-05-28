package com.spshop.review.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public class WriteReviewPlace extends Place{
	
	private static final String WRITE_REVIEW_PLACE = "WRITE_REVIEW";
	
	public static class Tokenizer implements PlaceTokenizer<WriteReviewPlace>{

		@Override
		public String getToken(WriteReviewPlace place){
			return WRITE_REVIEW_PLACE;
		}

		@Override
		public WriteReviewPlace getPlace(String token){
			return new WriteReviewPlace();
		}

	}
	
}
