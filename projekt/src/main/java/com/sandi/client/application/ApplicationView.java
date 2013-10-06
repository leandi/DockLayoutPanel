/**
 * Copyright 2012 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.sandi.client.application;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class ApplicationView extends ViewImpl implements ApplicationPresenter.MyView {
    public interface Binder extends UiBinder<Widget, ApplicationView> {
    }

    
	@UiField SimplePanel north;
	@UiField SimplePanel south;
	@UiField SimplePanel west;
	@UiField SimplePanel center;

    @Inject
    public ApplicationView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
        
        west.setTitle("west");
        north.setTitle("North");
        south.setTitle("south");
        center.setTitle("Center");
    }
        
    @Override
    public void setInSlot(Object slot, IsWidget content) {
      if (slot == ApplicationPresenter.SLOT_SetNorth) {
        north.setWidget(content);
      } else if (slot == ApplicationPresenter.SLOT_SetSouth) {
        south.setWidget(content);
      } else if (slot == ApplicationPresenter.SLOT_SetWest) {
        west.setWidget(content);
      } else if (slot == ApplicationPresenter.SLOT_SetCenter) {
        center.setWidget(content);
      } else {
        super.setInSlot(slot, content);
      }
    }
}