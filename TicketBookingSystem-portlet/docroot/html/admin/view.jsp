<%@page import="com.liferay.portal.kernel.dao.search.SearchContainer"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page
	import="com.lftechnology.ticketbookingsystem.admin.service.MovieLocalServiceUtil"%>
<%@page import="com.lftechnology.ticketbookingsystem.admin.model.Movie"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="java.util.List"%>

<%@ taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>


<liferay-theme:defineObjects />
<portlet:defineObjects />

<portlet:renderURL portletMode="edit" var="createURL"></portlet:renderURL>
<br>
This is the
<b>Admin Portlet</b>
portlet in View mode.



<a href="<%=createURL%>">Click Here to Edit</a>

<liferay-ui:search-container emptyResultsMessage="movie-empty-list"
	delta="5">

	<liferay-ui:search-container-results>
		<%
			List<Movie> list = MovieLocalServiceUtil.fecthAll();
					results = ListUtil.subList(list,
							searchContainer.getStart(),
							searchContainer.getEnd());
					total = list.size();
					pageContext.setAttribute("results", results);
					pageContext.setAttribute("total", total);
		%>

	</liferay-ui:search-container-results>

	<liferay-ui:search-container-row className="Movie" keyProperty="id"
		modelVar="movie">
		<liferay-ui:search-container-column-text orderable="ture"
			name="Movie Name" property="moviename" />
		<liferay-ui:search-container-column-text orderable="ture"
			name="Movie Director" property="directorname" />
			

		<liferay-ui:search-container-column-text>
			<%
				Long primKey = ((Movie) row.getObject()).getId();
			%>
			<portlet:actionURL name="editMode" var="editUrl">
				<portlet:param name="id" value="<%=primKey.toString()%>" />
				</portlet:actionURL>
				<a href="<%=editUrl%>">Edit</a>
				
				<portlet:actionURL name = "deleteMode" var = "deleteUrl">
					<portlet:param name="id" value="<%=primKey.toString() %>" />
					
				 </portlet:actionURL>
				 <a href = "<%=deleteUrl %>">Delete</a>
		</liferay-ui:search-container-column-text>




	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>



