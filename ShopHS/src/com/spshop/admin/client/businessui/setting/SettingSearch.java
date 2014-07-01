package com.spshop.admin.client.businessui.setting;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.SimplePager;
import com.spshop.dto.SettingSummaryDTO;
import com.google.gwt.user.client.ui.VerticalPanel;

public class SettingSearch extends Composite {

	private static SettingSearchUiBinder uiBinder = GWT
			.create(SettingSearchUiBinder.class);

	@UiField VerticalPanel cell;
	@UiField VerticalPanel footer;
	private SettingSummaryDTO dto;
	
	private SimplePager pager = new SimplePager();
	private CellTable<SettingSummaryDTO> cellTable = new CellTable<SettingSummaryDTO>();

	public SimplePager getPager() {
		return pager;
	}

	interface SettingSearchUiBinder extends UiBinder<Widget, SettingSearch> {
	}

	public SettingSearch() {
		initWidget(uiBinder.createAndBindUi(this));
		cell.add(cellTable);
		footer.add(pager);
		//pager.setDisplay(cellTable);
	}
	
	public CellTable<SettingSummaryDTO> getCellTable() {
		return cellTable;
	}

	public SettingSummaryDTO getDto() {
		return dto;
	}

	public void setDto(SettingSummaryDTO dto) {
		this.dto = dto;
	}
}
