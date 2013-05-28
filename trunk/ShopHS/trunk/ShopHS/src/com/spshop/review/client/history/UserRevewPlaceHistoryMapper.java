package com.spshop.review.client.history;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.spshop.review.client.place.ReviewListPlace;
import com.spshop.review.client.place.WriteReviewPlace;

@WithTokenizers({WriteReviewPlace.Tokenizer.class, ReviewListPlace.Tokenizer.class})
public interface UserRevewPlaceHistoryMapper extends PlaceHistoryMapper{
	
}