package com.lftechnology.ticketbookingsystem.admin;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.lftechnology.ticketbookingsystem.admin.model.Hall;
import com.lftechnology.ticketbookingsystem.admin.model.Movie;
import com.lftechnology.ticketbookingsystem.admin.model.Shift;
import com.lftechnology.ticketbookingsystem.admin.model.Ticket;
import com.lftechnology.ticketbookingsystem.admin.service.HallLocalServiceUtil;
import com.lftechnology.ticketbookingsystem.admin.service.MovieLocalServiceUtil;
import com.lftechnology.ticketbookingsystem.admin.service.ShiftLocalServiceUtil;
import com.lftechnology.ticketbookingsystem.admin.service.TicketLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class AdminPortlet
 */
public class AdminPortlet extends MVCPortlet {

	@Override
	public void doEdit(RenderRequest request, RenderResponse response)
			throws IOException, PortletException {
		super.doEdit(request, response);
	}

	public void commitMovie(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		
		Movie movie = AdminActionUtil.getMovie(request);
		Shift shift = AdminActionUtil.getShift(request);
		Ticket ticket = AdminActionUtil.getTicket(request);
		Hall hall = AdminActionUtil.getHall(request);
		System.out.println("I m in the commit Movie Section ......");
		System.out.println("the movie id : " + movie.getId());
		if (ValidatorUtil.validateMovie(movie, request)
				&& ValidatorUtil.validateShift(shift, request)
				&& ValidatorUtil.validateTicket(ticket, request)) {
						System.out.println("Adding process is going on.....");
			if (movie.getId() == 0 && shift.getId() == 0 && ticket.getId() == 0
					&& hall.getId() == 0) {
				MovieLocalServiceUtil.addMovie(movie);
				ShiftLocalServiceUtil.addShift(shift);
				HallLocalServiceUtil.addHall(hall);
				TicketLocalServiceUtil.addTicket(ticket);

			} else {
				MovieLocalServiceUtil.update(movie);
				ShiftLocalServiceUtil.update(shift);
				HallLocalServiceUtil.update(hall);
				TicketLocalServiceUtil.update(ticket);

			}
			SessionMessages.add(request, "SucessfullyAddedMovie");
			SessionMessages.add(request, "SucessfullyAddedShift");
			SessionMessages.add(request, "SucessfullyAddedHall");
			SessionMessages.add(request, "SucessfullyAddedTicket");
			System.out.println("I have added ");
		}
	}

	public void editMode(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		long id = ParamUtil.getLong(request, "id", 0L);
		System.out.println("Editing a new Record");
		System.out.println("the id is :" + id);
		if (id != 0) {
			System.out.println("You are in the edit Mode");
			Movie movie = MovieLocalServiceUtil.getMovie(id);
			Shift shift = ShiftLocalServiceUtil.getShift(id);
			Hall hall = HallLocalServiceUtil.getHall(id);
			Ticket ticket = TicketLocalServiceUtil.getTicket(id);
			request.setAttribute("movie", movie);
			request.setAttribute("ticket", ticket);
			request.setAttribute("shift", shift);
			request.setAttribute("hall", hall);

		}
		response.setRenderParameter("jspPage", "/html/admin/edit.jsp");
	}

	public void deleteMode(ActionRequest request, ActionResponse response)
			throws SystemException, PortalException {
		long id = ParamUtil.getLong(request, "id", 0L);

		if (id != 0)
			MovieLocalServiceUtil.delete(id);
		ShiftLocalServiceUtil.delete(id);
		TicketLocalServiceUtil.delete(id);
		HallLocalServiceUtil.delete(id);

	}

}
