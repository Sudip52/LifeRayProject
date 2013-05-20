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


import com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException;
import com.lftechnology.ticketbookingsystem.admin.model.Movie;
import com.lftechnology.ticketbookingsystem.admin.model.Shift;
import com.lftechnology.ticketbookingsystem.admin.service.ShiftLocalServiceUtil;
import com.lftechnology.ticketbookingsystem.admin.service.base.ShiftLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the shift local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.ticketbookingsystem.admin.service.ShiftLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sudipshrestha
 * @see com.lftechnology.ticketbookingsystem.admin.service.base.ShiftLocalServiceBaseImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.ShiftLocalServiceUtil
 */
public class ShiftLocalServiceImpl extends ShiftLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lftechnology.ticketbookingsystem.admin.service.ShiftLocalServiceUtil} to access the shift local service.
	 */
	
	public Shift addShift(Shift shift) throws SystemException
	{
		Shift newShift= null;
		
		try {
			newShift = shiftPersistence.create(counterLocalService.increment(Shift.class.getName()));
			//newShift = ShiftLocalServiceUtil.getShift(shift.getId());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		newShift.setShiftname(shift.getShiftname());
		newShift.setTime(shift.getTime());
		
		newShift.setCompanyId(shift.getCompanyId());
		newShift.setGroupId(shift.getGroupId());
		
		//commit changes to the db
		newShift = shiftPersistence.update(newShift, false);
		
		return newShift;
	
	}
	
	public Shift update(Shift shift) {
		Shift newShift = null;
		try {
			newShift = ShiftLocalServiceUtil
					.getShift(shift.getId());

			// newCustomer.setAge(customer.getAge());
			
			newShift.setShiftname(shift.getShiftname());
			newShift.setTime(shift.getTime());
			
			newShift.setGroupId(shift.getGroupId());
			newShift.setCompanyId(shift.getCompanyId());
			//Commit changes to dB
			shiftPersistence.update(newShift, true);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newShift;
	}

	public Shift get(long id) throws SystemException
	{
		Shift shift = shiftPersistence.fetchByPrimaryKey(id);
		return shift;
	}
	
	
	public List<Shift> fecthAll() throws SystemException
	{
		return  shiftPersistence.findAll();
		
		
	}
	
	public Shift delete(long id) throws SystemException, PortalException
	{
		Shift shift = null;
		try {
			shift = shiftPersistence.remove(id);
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return shift;			
	}

}