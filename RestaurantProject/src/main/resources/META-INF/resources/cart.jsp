<%@ include file="/init.jsp" %>


<%
	String totalPrice = (String)renderRequest.getAttribute("totalPrice");   
%>
<liferay-ui:message key="Total Price" />: <%= totalPrice %>
