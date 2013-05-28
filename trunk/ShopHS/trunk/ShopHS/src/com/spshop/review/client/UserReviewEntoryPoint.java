package com.spshop.review.client;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;
import com.spshop.review.client.gin.UserReviewGinjector;
import com.spshop.review.client.history.UserRevewPlaceHistoryMapper;
import com.spshop.review.client.history.UserReviewActivityMapper;
import com.spshop.review.client.place.ReviewListPlace;

public class UserReviewEntoryPoint implements EntryPoint {
	
	private final UserReviewGinjector injector = GWT.create(UserReviewGinjector.class);
	private final SimplePanel panel = new SimplePanel();
	private final UserRevewPlaceHistoryMapper historyMapper= GWT.create(UserRevewPlaceHistoryMapper.class);
	
	@Override
	public void onModuleLoad() {
	        EventBus eventBus = injector.getEventBus();
	      //  RootPanel.get().add(injector.getListView());
	        
	        PlaceController placeController = injector.getPlaceController().get();

	        // Start ActivityManager for the main widget with our ActivityMapper
	        UserReviewActivityMapper activityMapper = injector.getUserReviewActivityMapper().get();
	        ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
	        
	        activityManager.setDisplay(panel);

	        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
	        historyHandler.register(placeController, eventBus, new ReviewListPlace());

	        RootPanel.get().add(panel);
	        // Goes to the place represented on URL else default place
	        historyHandler.handleCurrentHistory();
	}

}
