package com.spshop.admin.client.grid;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.user.cellview.client.Column;

public abstract class ActionCellColumn<T, C> extends Column<T, C>{

	public ActionCellColumn(Cell<C> cell) {
		super(cell);
	}

}
