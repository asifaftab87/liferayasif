package org.liferay.online.restaurant.application.list;

import org.liferay.online.restaurant.constants.AddMenuRestaurantControllerPanelCategoryKeys;
import org.liferay.online.restaurant.constants.AddMenuRestaurantControllerPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author user
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + AddMenuRestaurantControllerPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class AddMenuRestaurantControllerPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return AddMenuRestaurantControllerPortletKeys.AddMenuRestaurantController;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + AddMenuRestaurantControllerPortletKeys.AddMenuRestaurantController + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}