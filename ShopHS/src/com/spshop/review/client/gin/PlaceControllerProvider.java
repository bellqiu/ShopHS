package com.spshop.review.client.gin;

import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;

@Singleton
public class PlaceControllerProvider implements Provider<PlaceController>{
	
	@Inject
	private EventBus eventBus;
	
	@Override
	public PlaceController get() {
		//System.out.println(eventBus+"................");
		return new PlaceController(eventBus);
	}

}
