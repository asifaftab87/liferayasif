package org.liferayasif.restautrant.portlet;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.liferayasif.restautrant.constants.RestaurantControllerPortletKeys;
import org.liferayasif.sb.model.Menu;
import org.liferayasif.sb.service.MenuLocalServiceUtil;
import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

@Component(
	property = {
	"javax.portlet.name=" + RestaurantControllerPortletKeys.RestaurantController,
	"mvc.command.name=render_class"
	}, 
	service = MVCRenderCommand.class
)

public class RenderCommandURL implements MVCRenderCommand{

	public final static String MENU = "/menu.jsp";
	 
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		try{
			String searchId = ParamUtil.getString(renderRequest, "searchId");
			String tagName = ParamUtil.getString(renderRequest, "tagName");
			//System.out.println("searchId: "+searchId);
			//System.out.println("tagName: "+tagName);
			
			List<Menu> menuList = MenuLocalServiceUtil.findByType(tagName);
			//System.out.println("menuList: "+menuList);
			
			renderRequest.setAttribute("menuList", menuList);
			renderRequest.setAttribute("tagName", tagName);
			
			/*if(tagName.equals(BaseConstants.ALL)) {
				
			}
			else if(tagName.equals(BaseConstants.CHINESE)) {
				
			}
			else if(tagName.equals(BaseConstants.ITALIAN)) {
				
			}
			else if(tagName.equals(BaseConstants.MEXICAN)) {
							
						}
			else if(tagName.equals(BaseConstants.ARABIC)) {
				
			}
			else if(tagName.equals(BaseConstants.INDIAN)) {
				
			}*/
			
		}
		catch(Exception e){
			return MENU;
		}
		 return MENU;
	}
	
}
