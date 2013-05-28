package com.spshop.review.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.spshop.review.client.presenter.interfaces.IUserReviewListView;
@Singleton
public class UserReviewListView extends Composite implements IUserReviewListView{

	@UiField Button writeReview;
	
	private static Binder uiBinder = GWT.create( Binder.class );

	public interface Binder extends UiBinder<Widget, UserReviewListView> {
	}
	
	public UserReviewListView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public HasClickHandlers getWriteReviewHandlers() {
		return writeReview;
	}

}
