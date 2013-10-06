package com.sandi.client.application.south;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Proxy;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.sandi.client.application.ApplicationPresenter;

public class SouthPresenter extends Presenter<SouthPresenter.MyView, SouthPresenter.MyProxy> {
	interface MyView extends View {
	}

	@ContentSlot
	public static final Type<RevealContentHandler<?>> SLOT_South = new Type<RevealContentHandler<?>>();

	@ProxyStandard
	public interface MyProxy extends Proxy<SouthPresenter> {
	}

	@Inject
	public SouthPresenter(EventBus eventBus, MyView view, MyProxy proxy) {
		super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetSouth);

	}

}
