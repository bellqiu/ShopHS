package com.spshop.review.client.presenter;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.spshop.review.client.history.UserReviewPlaceController;
import com.spshop.review.client.place.WriteReviewPlace;
import com.spshop.review.client.presenter.interfaces.IUserReviewListView;
import com.spshop.review.client.view.UserReviewListView;

@Singleton
public class UserReviewListPresenter extends AbstractActivity implements IUserReviewListView.Presenter{
	
	private UserReviewPlaceController placeController;
	private UserReviewListView listView;
	
	@Inject
	public UserReviewListPresenter(UserReviewPlaceController placeController, UserReviewListView listView) {
		this.placeController = placeController;
		this.listView = listView;
		bind();
	}
	
	private void bind() {
		listView.getWriteReviewHandlers().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				goTo(new WriteReviewPlace());
			}
		});
	}

	@Override
	public void goTo(Place place) {
		placeController.goTo(place);
	}

	@Override
	public void start(AcceptsOneWidget panel,
			com.google.gwt.event.shared.EventBus eventBus) {
		panel.setWidget(listView.asWidget());
	}
	
	
}
