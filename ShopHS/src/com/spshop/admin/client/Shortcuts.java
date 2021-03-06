package com.spshop.admin.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.StackLayoutPanel;
public class Shortcuts extends ResizeComposite {

  interface Binder extends UiBinder<StackLayoutPanel, Shortcuts> { }
  private static final Binder binder = GWT.create(Binder.class);

  @UiField
  AccordionMenu imageManagement;
  
  @UiField
  AccordionMenu productManagement;
  
  @UiField
  AccordionMenu siteManagement;
  
  @UiField
  AccordionMenu userManagement;
  
  public Shortcuts() {
    initWidget(binder.createAndBindUi(this));
  }
}
