package com.sandi.client.application.west;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class WestView extends ViewImpl implements WestPresenter.MyView {
	interface Binder extends UiBinder<Widget, WestView> {
	}

	@UiField
	SimplePanel main;

	@Inject
	WestView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == WestPresenter.SLOT_West) {
			main.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}
}
