package com.sandi.client.application.south;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;

public class SouthModule extends AbstractPresenterModule {
	@Override
	protected void configure() {
		bindPresenter(SouthPresenter.class, SouthPresenter.MyView.class,
				SouthView.class, SouthPresenter.MyProxy.class);
	}
}
