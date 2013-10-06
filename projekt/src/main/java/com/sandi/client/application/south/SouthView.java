package com.sandi.client.application.south;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class SouthView extends ViewImpl implements SouthPresenter.MyView {
	interface Binder extends UiBinder<Widget, SouthView> {
	}

	@UiField
	SimplePanel main;

	@Inject
	SouthView(Binder uiBinder) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public void setInSlot(Object slot, IsWidget content) {
		if (slot == SouthPresenter.SLOT_South) {
			main.setWidget(content);
		} else {
			super.setInSlot(slot, content);
		}
	}
}
