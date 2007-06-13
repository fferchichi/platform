/***************************************************************************
 * Copyright 2001-2003 The eXo Platform SARL         All rights reserved.  *
 * Please look at license.txt in info directory for more license detail.   *
 **************************************************************************/
package org.exoplatform.portal.webui.page;

import org.exoplatform.webui.application.WebuiRequestContext;
import org.exoplatform.webui.core.UIComponent;
import org.exoplatform.webui.core.lifecycle.Lifecycle;

/**
 * Created by The eXo Platform SARL
 * Author : Tuan Nguyen
 *          tuan08@users.sourceforge.net
 * May 8, 2006
 */
public class UIPageLifecycle extends Lifecycle { 
  
  public void processRender(UIComponent uicomponent , WebuiRequestContext context) throws Exception { 
    UIPage uiPage = (UIPage) uicomponent;
    if(uiPage.getMaximizedUIPortlet() != null){
      UIComponent uiComponent = uiPage.getMaximizedUIPortlet();
      uiComponent.processRender(context);
      return;
    }
    super.processRender(uicomponent, context);
  }
  
}