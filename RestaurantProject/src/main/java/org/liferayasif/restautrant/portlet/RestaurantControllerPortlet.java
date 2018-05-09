package org.liferayasif.restautrant.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.servlet.http.HttpServletRequest;

import org.liferayasif.restautrant.constants.RestaurantControllerPortletKeys;
import org.liferayasif.restautrant.dto.RestaurantDetails;
import org.osgi.service.component.annotations.Component;

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil;
import com.liferay.asset.kernel.service.AssetTagLocalServiceUtil;
import com.liferay.asset.kernel.service.persistence.AssetEntryQuery;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFileEntryMetadata;
import com.liferay.document.library.kernel.model.DLFileEntryType;
import com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryMetadataLocalServiceUtil;
import com.liferay.dynamic.data.mapping.kernel.DDMFormFieldValue;
import com.liferay.dynamic.data.mapping.kernel.DDMFormValues;
import com.liferay.dynamic.data.mapping.kernel.DDMStructure;
import com.liferay.dynamic.data.mapping.kernel.StorageEngineManagerUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

/**
 * @author user
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=RestaurantProject Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + RestaurantControllerPortletKeys.RestaurantController,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class RestaurantControllerPortlet extends MVCPortlet {
	
	private Log logger = LogFactoryUtil.getLog(RestaurantControllerPortlet.class);
	
	@ProcessAction(name="addToCartAction")
	public void addToCartAction(ActionRequest actionRequest, ActionResponse actionResponse){
		
	    String totalPriceIdHiddenValue = ParamUtil.getString(actionRequest, "totalPriceIdHiddenValue");
	    //logger.info(totalPriceIdHiddenValue);
	    actionRequest.setAttribute("totalPrice", totalPriceIdHiddenValue);
	    actionResponse.setRenderParameter("jspPage","/cart.jsp");
	    
	}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String tagName = StringPool.BLANK;
				
		try {
			
			long groupId = themeDisplay.getScopeGroupId();
			//logger.info(groupId);
			
			HttpServletRequest httpReq = PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(renderRequest)); 
			tagName = httpReq.getParameter("foodTypeTag");
			//logger.info("tag: "+tagName);
			
			if(Validator.isNull(tagName) || tagName.isEmpty()) {
				tagName = "all";
			}
			
			AssetEntryQuery assetEntryQuery = new AssetEntryQuery();
			assetEntryQuery.setAllTagIds(AssetTagLocalServiceUtil.getTagIds(groupId, new String[] {tagName}));
			assetEntryQuery.setGroupIds(new long[] {groupId});
			assetEntryQuery.setClassName(DLFileEntry.class.getName());
			List<AssetEntry> assetEntryList = AssetEntryLocalServiceUtil.getEntries(assetEntryQuery);
			
			if(assetEntryList.size()>0) {
				
				long[] assetEntryClassPKArray = new long[assetEntryList.size()];
				int i = 0;
				for(AssetEntry assetEntry : assetEntryList) {
					assetEntryClassPKArray[i++] = assetEntry.getClassPK();
				}
				
				DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(DLFileEntry.class, PortalClassLoaderUtil.getClassLoader());
				dynamicQuery.add(PropertyFactoryUtil.forName("fileEntryTypeId").eq(37130l));
				dynamicQuery.add(PropertyFactoryUtil.forName("fileEntryId").in(assetEntryClassPKArray));
				
				List<DLFileEntry> dlFileEntryList = DLFileEntryLocalServiceUtil.dynamicQuery(dynamicQuery);
				
				if(Validator.isNotNull(dlFileEntryList) && dlFileEntryList.size()>0) {
					
					List<RestaurantDetails> restaurantDetailList = new ArrayList<RestaurantDetails>();
					
					//String[] imageURLArray = new String[dlFileEntryList.size()];
					
					for(DLFileEntry dlFileEntry : dlFileEntryList) {
					
						RestaurantDetails restaurantDetails = new RestaurantDetails();
						
						StringBuffer imageURL = new StringBuffer(StringPool.SLASH);
						imageURL.append(RestaurantControllerPortletKeys.DOCUMENTS);
						imageURL.append(StringPool.SLASH);
						imageURL.append(groupId);
						imageURL.append(StringPool.SLASH);
						imageURL.append(dlFileEntry.getFolderId());
						imageURL.append(StringPool.SLASH);
						
						String[] fileNameArray = dlFileEntry.getFileName().split(StringPool.SPACE);
						StringBuffer fileName = new StringBuffer();
						
						for(int j=0 ; j<fileNameArray.length ; j++) {
							fileName.append(fileNameArray[j]);
							if(j<(fileNameArray.length-1)) {
								fileName.append(StringPool.PLUS);
							}
						}
						
						imageURL.append(fileName);
						imageURL.append(StringPool.SLASH);
						imageURL.append(dlFileEntry.getUuid());
						
						restaurantDetails.setImageURL(new String(imageURL));
						
						DLFileEntryType dLFileEntryType = dlFileEntry.getDLFileEntryType();
						
						List<DDMStructure> ddmStructureList = dLFileEntryType.getDDMStructures();
						
						for(DDMStructure ddmStructure : ddmStructureList) {
							
							long fileVersionId = dlFileEntry.getFileVersion(dlFileEntry.getVersion()).getFileVersionId();	
							
							DLFileEntryMetadata dlFileEntryMetadata = DLFileEntryMetadataLocalServiceUtil.fetchFileEntryMetadata(ddmStructure.getStructureId(), fileVersionId);
							
							DDMFormValues vals = StorageEngineManagerUtil.getDDMFormValues(dlFileEntryMetadata.getDDMStorageId());
							
							List<DDMFormFieldValue> fieldValueList = vals.getDDMFormFieldValues(); 
							
							int k = 0;
							for(DDMFormFieldValue fieldVal : fieldValueList){
								if(k++==0) {
									restaurantDetails.setRetaurantName(fieldVal.getValue().getString(themeDisplay.getLocale()));
								}
								else {
									restaurantDetails.setAddress(fieldVal.getValue().getString(themeDisplay.getLocale()));
								}
								//logger.info(fieldVal.getValue().getString(themeDisplay.getLocale()));
								
							}
							
						}
						restaurantDetailList.add(restaurantDetails);
					}
					//logger.info(restaurantDetailList.size());
					renderRequest.setAttribute("restaurantDetailList", restaurantDetailList);
					renderRequest.setAttribute("tagName", tagName);
				}
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		super.render(renderRequest, renderResponse);
	}
	
	
}