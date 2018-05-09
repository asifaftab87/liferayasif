<%@ include file="/init.jsp" %>

<portlet:renderURL var="menuUrl" > 
	 <portlet:param name="searchId" value="menu" /> 
	 <portlet:param name="tagName" value="<%= (String)request.getAttribute("tagName") %>" />
	 <portlet:param name="mvcRenderCommandName" value="render_class"/>
</portlet:renderURL>


<% 
	PortletURL iteratorURL = renderResponse.createRenderURL();
	List<RestaurantDetails> restaurantDetailList = (List<RestaurantDetails>)request.getAttribute("restaurantDetailList");
	String tagName = (String)request.getAttribute("tagName");
	 
%>

<table id="restaurantList">
	<%
		for(RestaurantDetails restaurantDetails : restaurantDetailList){
			%>
				<tr>
				    <td width="35%">
				    	<img alt="problem" src="<%= themeDisplay.getPortalURL() + restaurantDetails.getImageURL() %>" width="300" height="270" />
				    </td>
				    <td width="65%">
				    	<div>
				    		<%= restaurantDetails.getRetaurantName() %>
				    	</div>
				    	<div>
				    		<%= restaurantDetails.getAddress() %>
				    	</div>
				    	<div>
				    		<aui:button type='button' name='view Menu' value="View Menu" onclick="redirectMenu();" />
				    	</div>
				    </td>
				</tr>
			<%
		}
	%>
</table>


<script>
	function redirectMenu(){
		location.href="<%= menuUrl.toString() %>";
	}
</script>



<style>

	#restaurantList {
	    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	}
	
	#restaurantList td{
	    /*border: 1px solid #ddd;*/
	    padding: 8px;
	}
	
	#restaurantList tr:nth-child(even){
		background-color: #f2f2f2;
	}
	
	#restaurantList tr:hover {
		background-color: #ddd;
	}

</style>











<%-- 
	<liferay-ui:search-container delta="20" emptyResultsMessage="No Books Found!!" iteratorURL="<%=iteratorURL%>">
	    <liferay-ui:search-container-results  results="<%= ListUtil.subList(restaurantDetailList, searchContainer.getStart(), searchContainer.getEnd()) %>" />
	    <liferay-ui:search-container-row className="org.liferayasif.restautrant.dto.RestaurantDetails" modelVar="book">
	        <liferay-ui:search-container-column-text name="imageURL" value="${book.imageURL}" />
	        <liferay-ui:search-container-column-text name="retaurantName" value="${book.retaurantName}" />
	        <liferay-ui:search-container-column-text name="address" value="${book.address}" />
	        <liferay-ui:search-container-column-jsp path="/WEB-INF/jsp/studentActions.jsp" align="right" />
	    </liferay-ui:search-container-row>
	    <liferay-ui:search-iterator />
	</liferay-ui:search-container> 
--%>



