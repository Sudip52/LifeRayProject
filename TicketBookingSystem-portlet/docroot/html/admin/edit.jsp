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
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://liferay.com/tld/security"
	prefix="liferay-security"%>
<%@ taglib uri="http://liferay.com/tld/util" prefix="liferay-util"%>

<script>

	//alert("Sudip Is here");
	function clearForm(form){
		$(':input', form).each(function()
				
				{
			
			alert("Jquery Completed.....");
			
			var type = this.type;
			var tag = this.tagName.toLowerCase();
			
			if (type == 'text' || type == 'password' || type =='textarea')
				{
				this.value = "";
				}
			else if (type == 'checkbox' || type == "radio")
			{
				this.checked = false ;
				
			}
			else if (tag == 'select')
				{
				this.selectedIndex = '-1';
				}
		});
		
	};


</script>



<liferay-theme:defineObjects />
<portlet:defineObjects />

<portlet:actionURL name="commitMovie" var="commitUrl"></portlet:actionURL>

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

<liferay-ui:error key="movieNameIsRequired"
	message="movie-name-is-required" />
<liferay-ui:error key="directorNameIsRequired"
	message="director-name-is-required" />
<liferay-ui:error key="shiftNameIsRequired"
	message="shift-name-is-required" />
<liferay-ui:error key="hallNameIsRequired"
	message="hall-name-is-required" />
<liferay-ui:error key="ticketNameIsRequired"
	message="ticket-name-is-required" />
<liferay-ui:error key="ticketPriceIsRequired"
	message="ticket-price-is-required" />

<liferay-ui:success key="SucessfullyAddedMovie"
	message="sucessfully-added-movie" />
<liferay-ui:success key="SucessfullyAddedShift"
	message="sucessfully-added-shift" />
<liferay-ui:success key="SucessfullyAddedHall"
	message="sucessfully-added-hall" />
<liferay-ui:success key="SucessfullyAddedTicket"
	message="sucessfully-added-ticket" />




<aui:form name="form" action="<%= commitUrl %>">
	<aui:fieldset>
		<h4>Movies Details</h4>
		<br>
		<aui:input name="moviename" id="moviename" label="Movie Name"
			value="<%=movie.getMoviename()%>"></aui:input>
		<aui:input name="directorname" id="directorname" label="Director"
			value="<%=movie.getDirectorname()%>"></aui:input>
		<br>
		<h4>Movies Shift</h4>
		<br>
		<aui:input name="shiftname" id="shift_id" label="Shift Name"
			value="<%=shift.getShiftname()%>"></aui:input>
		<aui:input name="time" id="shifttime" label="Shift Time"
			value="<%=shift.getTime()%>"></aui:input>
		<br>
	
		<h4>Hall Details</h4>
		<br>
		<aui:input name="hallname" id="hallname" label="Hall Name"
			value="<%=hall.getHallname()%>"></aui:input>
		<aui:input name="contact_no" id="contact_no" label="Contact No."
			value="<%=hall.getContact_no()%>"></aui:input>

		<br>

		<h4>Tickets Details</h4>
		<br>

		<aui:input name="ticketname" id="ticketname" label="Ticket Catagory"
			value="<%=ticket.getTicketname()%>"></aui:input>
		<aui:input name="price" id="ticketprice" label="Ticket Price"
			value="<%=ticket.getPrice()%>"></aui:input>

		<aui:button-row>
			<aui:button type="submit" value="Submit"></aui:button>
<%-- 			<aui:button onClick="clearForm(this.form)" value="Clear"></aui:button> --%>
			<aui:button onClick = "form.reset()" value = "Clear" />
		</aui:button-row>

	</aui:fieldset>
</aui:form>