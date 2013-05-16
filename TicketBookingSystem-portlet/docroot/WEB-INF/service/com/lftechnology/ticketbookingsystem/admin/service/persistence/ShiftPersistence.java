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

package com.lftechnology.ticketbookingsystem.admin.service.persistence;

import com.lftechnology.ticketbookingsystem.admin.model.Shift;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the shift service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see ShiftPersistenceImpl
 * @see ShiftUtil
 * @generated
 */
public interface ShiftPersistence extends BasePersistence<Shift> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShiftUtil} to access the shift persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the shift in the entity cache if it is enabled.
	*
	* @param shift the shift
	*/
	public void cacheResult(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift);

	/**
	* Caches the shifts in the entity cache if it is enabled.
	*
	* @param shifts the shifts
	*/
	public void cacheResult(
		java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> shifts);

	/**
	* Creates a new shift with the primary key. Does not add the shift to the database.
	*
	* @param id the primary key for the new shift
	* @return the new shift
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Shift create(
		long id);

	/**
	* Removes the shift with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shift
	* @return the shift that was removed
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException if a shift with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Shift remove(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lftechnology.ticketbookingsystem.admin.model.Shift updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shift with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException} if it could not be found.
	*
	* @param id the primary key of the shift
	* @return the shift
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException if a shift with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Shift findByPrimaryKey(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the shift with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the shift
	* @return the shift, or <code>null</code> if a shift with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Shift fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the shifts.
	*
	* @return the shifts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the shifts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of shifts
	* @param end the upper bound of the range of shifts (not inclusive)
	* @return the range of shifts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the shifts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of shifts
	* @param end the upper bound of the range of shifts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shifts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the shifts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of shifts.
	*
	* @return the number of shifts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}