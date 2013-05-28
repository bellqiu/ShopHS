package com.spshop.review.client.gin;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Provider;
import com.google.web.bindery.event.shared.EventBus;
import com.spshop.review.client.history.UserReviewActivityMapper;
import com.spshop.review.client.presenter.UserReviewListPresenter;
import com.spshop.review.client.view.UserReviewListView;

@GinModules(UserReviewGinMoudle.class)
public interface UserReviewGinjector extends Ginjector {
	EventBus getEventBus();
	
	UserReviewListView getListView();
	
	UserReviewListPresenter getUserReviewListPresenter(); 
	
	Provider<PlaceController> getPlaceController();

	Provider<UserReviewActivityMapper> getUserReviewActivityMapper();
}