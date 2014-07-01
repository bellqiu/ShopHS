package com.spshop.review.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Singleton;
import com.spshop.review.client.presenter.interfaces.IUserReviewComposeView;
@Singleton
public class UserReviewComposeView extends Composite implements HasText, IUserReviewComposeView {

	private static UserReviewComposeViewUiBinder uiBinder = GWT
			.create(UserReviewComposeViewUiBinder.class);

	interface UserReviewComposeViewUiBinder extends
			UiBinder<Widget, UserReviewComposeView> {
	}

	public UserReviewComposeView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Button button;

	public UserReviewComposeView(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public void setText(String text) {
		button.setText(text);
	}

	public String getText() {
		return button.getText();
	}

}
