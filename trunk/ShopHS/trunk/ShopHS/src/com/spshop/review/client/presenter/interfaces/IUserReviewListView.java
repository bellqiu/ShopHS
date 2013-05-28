package com.spshop.review.client.presenter.interfaces;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.IsWidget;

public interface IUserReviewListView extends IsWidget {
	public HasClickHandlers getWriteReviewHandlers();
	
	public interface Presenter {
        void goTo(Place place);
    }
}
