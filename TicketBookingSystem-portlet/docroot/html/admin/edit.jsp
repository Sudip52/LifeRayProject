<%@page import="com.lftechnology.ticketbookingsystem.admin.model.Ticket"%>
<%@page import="com.lftechnology.ticketbookingsystem.admin.model.Hall"%>
<%@page import="com.lftechnology.ticketbookingsystem.admin.model.Shift"%>
<%@page
	import="com.lftechnology.ticketbookingsystem.admin.model.impl.HallImpl"%>
<%@page
	import="com.lftechnology.ticketbookingsystem.admin.model.impl.TicketImpl"%>
<%@page
	import="com.lftechnology.ticketbookingsystem.admin.model.impl.ShiftImpl"%>
<%@page
	import="com.lftechnology.ticketbookingsystem.admin.model.impl.MovieImpl"%>
<%@page import="com.lftechnology.ticketbookingsystem.admin.model.Movie"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>



<liferay-theme:defineObjects />
<portlet:defineObjects />

<portlet:actionURL name="commitCustomer" var="commitUrl"></portlet:actionURL>

This is the
<b>Admin Portlet</b>
portlet in Edit mode.

<%
	Movie movie = (Movie) request.getAttribute("movie");

	if (movie == null) {
		movie = new MovieImpl();

	}
	Shift shift = (Shift) request.getAttribute("shift");
	if (shift == null) {

		shift = new ShiftImpl();
	}
	Hall hall = (Hall) request.getAttribute("hall");
	if (hall == null) {
		hall = new HallImpl();

	}

	Ticket ticket = (Ticket) request.getAttribute("ticket");
	if (ticket == null) {
		ticket = new TicketImpl();
	}
%>

<aui:form action=" commitUrl">
	<aui:fieldset>


		<aui:input name="moviename" id="moviename" label="Movie Name"
			value="<%=movie.getMoviename()%>"></aui:input>
		<aui:input name="director" id="directorname" label="Director"
			value="<%=movie.getDirectorname()%>"></aui:input>
		<aui:input name="shiftname" id="shift_id" label="Shift Name"
			value="<%=shift.getShiftname()%>"></aui:input>
		<aui:input name="time" id="shifttime" label="Shift Time"
			value="<%=shift.getTime()%>"></aui:input>
		<aui:input name="hallname" id="hallname" label="Hall Name"
			value="<%=hall.getHallname()%>"></aui:input>
		<aui:input name="contact_no" id="contact_no" label="Contact No."
			value="<%=hall.getContact_no()%>"></aui:input>
		<aui:input name="ticketname" id="ticketname" label="Ticket Catagory"
			value="<%=ticket.getTicketname()%>"></aui:input>
		<aui:input name="price" id="ticketprice" label="Ticket Price"
			value="<%=ticket.getPrice()%>"></aui:input>
		
		<aui:button-row>
			<aui:button type="submit" value="Submit"></aui:button>
			<aui:button onClick="" value="Clear"></aui:button>
		</aui:button-row>

	</aui:fieldset>
</aui:form>

