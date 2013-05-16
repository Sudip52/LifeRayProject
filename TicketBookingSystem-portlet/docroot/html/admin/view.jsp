<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri = "http://alloy.liferay.com/tld/aui" prefix = "aui" %>
<%@ taglib uri = "http://liferay.com/tld/theme" prefix = "liferay-theme" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />

This is the <b>Admin Portlet</b> portlet in View mode.

<portlet:renderURL var="createURL" portletMode="edit" ></portlet:renderURL>
<br>

<a href = "<%=createURL %>">Click Here to Edit</a>




