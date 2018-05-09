package org.liferay.online.restaurant.portlet;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import org.liferay.online.restaurant.constants.AddMenuRestaurantControllerPortletKeys;
import org.liferayasif.sb.model.Menu;
import org.liferayasif.sb.service.MenuLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author user
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.add-default-resource=true",
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.layout-cacheable=true",
		"com.liferay.portlet.private-request-attributes=false",
		"com.liferay.portlet.private-session-attributes=false",
		"com.liferay.portlet.render-weight=50",
		"com.liferay.portlet.use-default-template=true",
		"javax.portlet.display-name=AddMenuRestaurant Portlet",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + AddMenuRestaurantControllerPortletKeys.AddMenuRestaurantController,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.supports.mime-type=text/html"
	},
	service = Portlet.class
)
public class AddMenuRestaurantControllerPortlet extends MVCPortlet {
	
	@ProcessAction(name="addMenu")
	public void addMenu(ActionRequest actionRequest, ActionResponse actionResponse) {
		
		String type = ParamUtil.getString(actionRequest, "type");
		String foodName = ParamUtil.getString(actionRequest, "foodName");
		String price = ParamUtil.getString(actionRequest, "price");
		System.out.println("type: "+type);
		System.out.println("price: "+price);
		
		Menu menu = MenuLocalServiceUtil.createMenu(CounterLocalServiceUtil.increment());
		menu.setPrice(Long.valueOf(price));
		menu.setFoodName(foodName);
		menu.setType(type);
		menu = MenuLocalServiceUtil.updateMenu(menu);
		System.out.println("menu: "+menu);
		
	}
}