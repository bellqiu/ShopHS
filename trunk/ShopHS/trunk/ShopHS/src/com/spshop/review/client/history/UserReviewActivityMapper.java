package com.spshop.review.client.history;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.spshop.review.client.place.ReviewListPlace;
import com.spshop.review.client.place.WriteReviewPlace;
import com.spshop.review.client.presenter.UserReviewComposePresenter;
import com.spshop.review.client.presenter.UserReviewListPresenter;
@Singleton
public class UserReviewActivityMapper implements ActivityMapper {
	
	@Inject
	private UserReviewListPresenter reviewListPresenter;
	@Inject
	private UserReviewComposePresenter composePresenter;

    public UserReviewActivityMapper() {
        super();
    }

    @Override
    public Activity getActivity(Place place) {
    	System.out.println("reviewListPresenter:"+reviewListPresenter);
    	System.out.println("composePresenter:"+composePresenter);
        if (place instanceof WriteReviewPlace){
            return composePresenter;
        }else if(place instanceof ReviewListPlace){
        	return reviewListPresenter;
        }
        return reviewListPresenter;
    }
}