<%@ include file="/init.jsp" %>

<portlet:actionURL var="addToCartActionURL" name="addToCartAction"/>

<aui:form name="fm" action="${addToCartActionURL}" method="post">

	<%
		List<Menu> menuList = (List<Menu>)request.getAttribute("menuList");
		
	%>

	<table id="menuList">
		<%
			for(Menu menu : menuList){
				%>
					<tr>
					    <td width="15%">
					    	<%-- <img alt="problem" src="<%= request.getContextPath() %>/images/menu_list.jpg" /> --%>
					    	<img src="<%= request.getContextPath() %>/images/menu_list4.jpg" alt="problem" style="width: 119px;">
					    </td>
					    <td width="65%">
					    	<div>
					    		<%= menu.getFoodName() %>  
					    		<aui:input name="check" type="checkbox" value="<%= menu.getPrice() %>" inlineLabel="true" label="<%= menu.getPrice()+"" %>" />
					    	</div>
					    </td>
					</tr>
				<%
			}
		%>
	</table>

	<h3>
		<liferay-ui:message key="Total Price" />
		<span id="totalPriceId" style="padding-left: 23px;">0</span>
	</h3>
	
	<div style="display:none;">
    	<aui:input typex="text" id="totalPriceIdHiddenValue" name="totalPriceIdHiddenValue" value="0" />
    </div>
    
	<aui:button-row>
        <aui:button name="saveButton" type="submit" value="Add To Cart"  />
        <aui:button name="cancelButton" type="button" value="Clear" onclick="location.reload();" />
    </aui:button-row>
    
</aui:form>


<script>

	total = 0;
	$(':checkbox').change(function() {
	
	    if($(this).prop('checked')){
	    	total = total + parseInt(this.value);
	    }
	    else{
	    	total = total - parseInt(this.value);
	    }
	    
		$('#totalPriceId').html(total);
		$('#<portlet:namespace/>totalPriceIdHiddenValue').val(total);
		
	}); 

</script>


<style>

	#menuList {
	    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	}
	
	#menuList td{
	    /*border: 1px solid #ddd;*/
	    padding: 8px;
	}
	
	#menuList tr:nth-child(even){
		background-color: #f2f2f2;
	}
	
	#menuList tr:hover {
		background-color: #ddd;
	}

</style>