package com.spshop.review.client.history;

import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

public class UserReviewPlaceController extends PlaceController{

	@Inject
	public UserReviewPlaceController(EventBus eventBus) {
		super(eventBus);
	}
		
}
