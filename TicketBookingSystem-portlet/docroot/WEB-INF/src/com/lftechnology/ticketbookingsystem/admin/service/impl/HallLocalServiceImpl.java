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

import java.util.List;

import com.lftechnology.ticketbookingsystem.admin.NoSuchHallException;
import com.lftechnology.ticketbookingsystem.admin.model.Hall;
import com.lftechnology.ticketbookingsystem.admin.model.Shift;
import com.lftechnology.ticketbookingsystem.admin.service.HallLocalServiceUtil;
import com.lftechnology.ticketbookingsystem.admin.service.base.HallLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
/**
 * The implementation of the hall local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.ticketbookingsystem.admin.service.HallLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sudipshrestha
 * @see com.lftechnology.ticketbookingsystem.admin.service.base.HallLocalServiceBaseImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.HallLocalServiceUtil
 */
public class HallLocalServiceImpl extends HallLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lftechnology.ticketbookingsystem.admin.service.HallLocalServiceUtil} to access the hall local service.
	 */
	public Hall addHall(Hall hall) throws SystemException
	{
		Hall newHall= null;
		
		try {
			newHall = hallPersistence.create(counterLocalService.increment(Hall.class.getName()));
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		newHall.setHallname(hall.getHallname());
		newHall.setContact_no(hall.getContact_no());
		
		newHall.setCompanyId(hall.getCompanyId());
		newHall.setGroupId(hall.getGroupId());
		
		//commit changees to the db
	
		newHall = hallPersistence.update(newHall, false);
	
		
		return newHall;
	}
	
	
	public Hall update(Hall hall) throws PortalException, SystemException {
		Hall newHall =	HallLocalServiceUtil
					.getHall(hall.getId());

			// newCustomer.setAge(customer.getAge());
			
			newHall.setHallname(hall.getHallname());
			newHall.setContact_no(hall.getContact_no());
			
			newHall.setGroupId(hall.getGroupId());
			newHall.setCompanyId(hall.getCompanyId());
			//Commit changes to dB
			hallPersistence.update(newHall, true);
		return newHall;
	}
	
	public Hall get(long id) throws SystemException
	{
		Hall hall = hallPersistence.fetchByPrimaryKey(id);
		return hall;
	}
	
	
	public List<Hall> fecthAll() throws SystemException
	{
		return  hallPersistence.findAll();
		
		
	}
	
	public Hall delete(long id) throws SystemException, PortalException
	{
		Hall hall = null;
		try {
			hall = hallPersistence.remove(id);
		} catch (NoSuchHallException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hall;			
	}
	
}