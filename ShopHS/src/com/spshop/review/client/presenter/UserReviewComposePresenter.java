package com.spshop.review.client.presenter;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.spshop.review.client.history.UserReviewPlaceController;
import com.spshop.review.client.presenter.interfaces.IUserReviewComposeView;

@Singleton
public class UserReviewComposePresenter extends AbstractActivity{
	@Inject
	private UserReviewPlaceController placeController;
	
	private IUserReviewComposeView reviewComposeView;
	
	@Inject
	public UserReviewComposePresenter(UserReviewPlaceController placeController,IUserReviewComposeView reviewComposeView) {
		this.placeController = placeController;
		this.reviewComposeView = reviewComposeView;
		bind();
	}
	
	private void bind() {
		
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus eventBus) {
		panel.setWidget(reviewComposeView);
	}

}
