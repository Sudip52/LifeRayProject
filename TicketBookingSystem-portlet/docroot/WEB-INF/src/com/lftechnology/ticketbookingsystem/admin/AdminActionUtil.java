package com.lftechnology.ticketbookingsystem.admin;

import javax.portlet.ActionRequest;

import com.lftechnology.ticketbookingsystem.admin.model.Hall;
import com.lftechnology.ticketbookingsystem.admin.model.Movie;
import com.lftechnology.ticketbookingsystem.admin.model.Shift;
import com.lftechnology.ticketbookingsystem.admin.model.Ticket;
import com.lftechnology.ticketbookingsystem.admin.model.impl.HallImpl;
import com.lftechnology.ticketbookingsystem.admin.model.impl.MovieImpl;
import com.lftechnology.ticketbookingsystem.admin.model.impl.ShiftImpl;
import com.lftechnology.ticketbookingsystem.admin.model.impl.TicketImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

public class AdminActionUtil {
	
	public static Movie getMovie(ActionRequest request) throws PortalException, SystemException{
		
		Movie movie = new MovieImpl();
		
		movie.setId(ParamUtil.getLong(request, "id"));
		
		movie.setMoviename(ParamUtil.getString(request, "moviename"));
		movie.setDirectorname(ParamUtil.getString(request, "directorname"));
		movie.setShift_id(ParamUtil.getLong(request, "shift_id"));
		movie.setHall_id(ParamUtil.getLong(request, "hall_id"));
		movie.setTicket_id(ParamUtil.getLong(request, "ticket_id"));
		
		User user = UserLocalServiceUtil.getUser(PortalUtil.getUserId(request));
		movie.setCompanyId(PortalUtil.getCompanyId(request));
		movie.setGroupId(user.getGroupId());
		return movie;
	}
	
	public static Shift getShift(ActionRequest request) throws PortalException, SystemException 
	
	{
		Shift shift = new ShiftImpl();
		
		shift.setId(ParamUtil.getLong(request, "id"));
		
		shift.setShiftname(ParamUtil.getString(request, "shiftname"));
		shift.setTime(ParamUtil.getString(request, "time"));
		
		User user = UserLocalServiceUtil.getUser(PortalUtil.getUserId(request));
		shift.setCompanyId(PortalUtil.getCompanyId(request));
		shift.setGroupId(user.getGroupId());
		return shift;
	}
	
	
	public static Hall getHall(ActionRequest request) throws PortalException, SystemException 
	
	{
		Hall hall = new HallImpl();
		
		hall.setId(ParamUtil.getLong(request, "id"));
		
		hall.setHallname(ParamUtil.getString(request, "hallname"));
		hall.setContact_no(ParamUtil.getString(request, "contact_no"));
		
		User user = UserLocalServiceUtil.getUser(PortalUtil.getUserId(request));
		hall.setCompanyId(PortalUtil.getCompanyId(request));
		hall.setGroupId(user.getGroupId());
		return hall;
	}
	
	public static Ticket getTicket(ActionRequest request) throws PortalException, SystemException 
	
	{
		Ticket ticket = new TicketImpl();
		
		ticket.setId(ParamUtil.getLong(request, "id"));
		
		ticket.setTicketname(ParamUtil.getString(request, "ticketname"));
		ticket.setPrice(ParamUtil.getLong(request, "price"));
		
		User user = UserLocalServiceUtil.getUser(PortalUtil.getUserId(request));
		ticket.setCompanyId(PortalUtil.getCompanyId(request));
		ticket.setGroupId(user.getGroupId());
		return ticket;
	}
}
