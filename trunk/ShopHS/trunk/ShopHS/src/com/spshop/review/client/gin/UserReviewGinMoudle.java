package com.spshop.review.client.gin;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.spshop.review.client.presenter.interfaces.IUserReviewComposeView;
import com.spshop.review.client.presenter.interfaces.IUserReviewListView;
import com.spshop.review.client.view.UserReviewComposeView;
import com.spshop.review.client.view.UserReviewListView;

public class UserReviewGinMoudle extends AbstractGinModule{

	@Override
	protected void configure() {
		bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		bind(IUserReviewComposeView.class).to(UserReviewComposeView.class);
		bind(IUserReviewListView.class).to(UserReviewListView.class);
		bind(PlaceController.class).toProvider(PlaceControllerProvider.class);
		//bind(UserReviewListPresenter.class).to(UserReviewListPresenter.class);
		/*bind(IUserReviewListView.class).to(UserReviewListView.class);
		
		
		
		
		bind(UserReviewComposePresenter.class).toProvider(UserReviewComposePresenter.class);
	bind(UserReviewListPresenter.class).to(UserReviewListPresenter.class).in(Singleton.class);
		bind(UserReviewActivityMapper.class).to(UserReviewActivityMapper.class).in(Singleton.class);*/
	}

}
