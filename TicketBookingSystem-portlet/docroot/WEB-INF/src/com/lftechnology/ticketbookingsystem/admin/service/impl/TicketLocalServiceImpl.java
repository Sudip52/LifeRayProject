/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lftechnology.ticketbookingsystem.admin.service.impl;

import com.lftechnology.ticketbookingsystem.admin.model.Ticket;
import com.lftechnology.ticketbookingsystem.admin.service.TicketLocalServiceUtil;
import com.lftechnology.ticketbookingsystem.admin.service.base.TicketLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the ticket local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.ticketbookingsystem.admin.service.TicketLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sudipshrestha
 * @see com.lftechnology.ticketbookingsystem.admin.service.base.TicketLocalServiceBaseImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.TicketLocalServiceUtil
 */
public class TicketLocalServiceImpl extends TicketLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lftechnology.ticketbookingsystem.admin.service.TicketLocalServiceUtil} to access the ticket local service.
	 */
	
	public Ticket addTicket(Ticket ticket) 
	{
		Ticket newTicket= null;
		
		try {
			newTicket = TicketLocalServiceUtil.getTicket(ticket.getId());
		} catch (PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		newTicket.setTicketname(ticket.getTicketname());
		newTicket.setPrice(ticket.getPrice());
		
		return newTicket;
	}
	
	
	public Ticket update(Ticket ticket)throws SystemException, PortalException {
		Ticket newTicket =	TicketLocalServiceUtil
					.getTicket(ticket.getId());

			// newCustomer.setAge(customer.getAge());
			
			newTicket.setTicketname(ticket.getTicketname());
			newTicket.setPrice(ticket.getPrice());
			
			newTicket.setGroupId(ticket.getGroupId());
			newTicket.setCompanyId(ticket.getCompanyId());
			//Commit changes to dB
			ticketPersistence.update(newTicket, true);
		return newTicket;
	}
}