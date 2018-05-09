<%@ include file="/init.jsp" %>

<portlet:actionURL var="addMenuURL" name="addMenu" />

<aui:form action='<%= addMenuURL %>' name='<portlet:namespace />fm' method="post">
	
	<aui:select name="type" label="Food Type">
	       <aui:option label="Chinese" value="chinese" ></aui:option>
	       <aui:option label="Italian" value="italian" ></aui:option>
	       <aui:option label="Mexican" value="mexican" ></aui:option>
	       <aui:option label="Arabic" value="arabic" ></aui:option>
	       <aui:option label="Indian" value="indian" ></aui:option>
	</aui:select>

	<aui:input name="foodName" label="Food Name"/>
	<aui:input name="price" label="Price" />
	
	<aui:button-row>
         <aui:button type="submit" value="save" />
    </aui:button-row>
    
</aui:form>