package com.spshop.admin.client.businessui.setting;

import org.apache.struts.taglib.html.TextareaTag;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.RichTextArea;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.spshop.admin.client.AdminWorkspace;
import com.spshop.admin.client.rich.RichText;
import com.spshop.dto.SettingDTO;

public class SettingCreation extends Composite {

	private static SettingCreationUiBinder uiBinder = GWT
			.create(SettingCreationUiBinder.class);
	@UiField TextBox key;
	@UiField TextArea value;
	@UiField Button save;
	private SettingDTO settingDTO = new SettingDTO();

	interface SettingCreationUiBinder extends UiBinder<Widget, SettingCreation> {
	}

	public SettingCreation() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public void setSettingDTO(SettingDTO settingDTO){
		this.settingDTO.setDetailId(settingDTO.getDetailId());
		this.settingDTO.setKey(settingDTO.getKey());
		this.settingDTO.setValue(settingDTO.getValue());
		
		this.key.setValue(settingDTO.getKey());
		this.value.setValue(settingDTO.getValue());
	}

	@UiHandler("key")
	void onKeyKeyUp(KeyUpEvent event) {
		this.settingDTO.setKey(key.getText());
	}
	@UiHandler("value")
	void onValueKeyUp(KeyUpEvent event) {
		this.settingDTO.setValue(value.getValue());
	}
	@UiHandler("save")
	void onSaveClick(ClickEvent event) {
		
		final SettingCreation settingUI = this;
		
		AdminWorkspace.ADMIN_SERVICE_ASYNC.saveSettingDTO(settingDTO, new AsyncCallback<SettingDTO>() {
			
			@Override
			public void onSuccess(SettingDTO result) {
				settingUI.setSettingDTO(result);
			}
			
			@Override
			public void onFailure(Throwable caught) {
				Window.alert(caught.getLocalizedMessage());
			}
		});
	}
}
