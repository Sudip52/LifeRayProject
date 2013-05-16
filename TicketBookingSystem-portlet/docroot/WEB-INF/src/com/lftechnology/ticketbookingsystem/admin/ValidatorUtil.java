package com.lftechnology.ticketbookingsystem.admin;

import javax.portlet.ActionRequest;

import com.lftechnology.ticketbookingsystem.admin.model.Hall;
import com.lftechnology.ticketbookingsystem.admin.model.Movie;
import com.lftechnology.ticketbookingsystem.admin.model.Shift;
import com.lftechnology.ticketbookingsystem.admin.model.Ticket;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.Validator;

public class ValidatorUtil {
	
	public static boolean validateMovie(Movie movie, ActionRequest request)
	{
		boolean isValidSucess = true;
		 
		if (Validator.isNull(movie.getMoviename()))
		{
			SessionErrors.add(request, "MovieNameIsRequired");
			isValidSucess = false;
			
		}
		if (Validator.isNull(movie.getDirectorname()))
		{
			SessionErrors.add(request, "DirectorNameIsRequired");
			isValidSucess = false;
		}
		return isValidSucess;		
	}
	public static boolean validateShift(Shift shift, ActionRequest request)
	{
		boolean isValidateSucess = true;
		
		if(Validator.isNull(shift.getShiftname()))
		{
			SessionErrors.add(request,"ShiftNameIsRequired");
			isValidateSucess = false;
		}
		return isValidateSucess;
	}
	public static boolean validateHall(Hall hall, ActionRequest request)
	{
		boolean isValidateSucess = true;
		
		if(Validator.isNull(hall.getHallname()))
		{
			SessionErrors.add(request,"HallNameIsRequired");
			isValidateSucess = false;
		}
		return isValidateSucess;
	}
	
	public static boolean validateTicket(Ticket ticket, ActionRequest request)
	{
		boolean isValidateSucess = true;
		
		if(Validator.isNull(ticket.getTicketname()))
		{
			SessionErrors.add(request,"TicketNameIsRequired");
			isValidateSucess = false;
		}
		
		if (Validator.isNull(ticket.getPrice()))
		{
			SessionErrors.add(request, "TicketPriceIsRequired");
		}
		return isValidateSucess;
	}
		
}
