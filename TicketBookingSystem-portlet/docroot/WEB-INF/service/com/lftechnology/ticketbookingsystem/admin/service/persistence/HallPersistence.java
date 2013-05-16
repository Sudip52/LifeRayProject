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

import com.lftechnology.ticketbookingsystem.admin.model.Hall;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the hall service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see HallPersistenceImpl
 * @see HallUtil
 * @generated
 */
public interface HallPersistence extends BasePersistence<Hall> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HallUtil} to access the hall persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the hall in the entity cache if it is enabled.
	*
	* @param hall the hall
	*/
	public void cacheResult(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall);

	/**
	* Caches the halls in the entity cache if it is enabled.
	*
	* @param halls the halls
	*/
	public void cacheResult(
		java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Hall> halls);

	/**
	* Creates a new hall with the primary key. Does not add the hall to the database.
	*
	* @param id the primary key for the new hall
	* @return the new hall
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall create(long id);

	/**
	* Removes the hall with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the hall
	* @return the hall that was removed
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchHallException if a hall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall remove(long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchHallException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lftechnology.ticketbookingsystem.admin.model.Hall updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the hall with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchHallException} if it could not be found.
	*
	* @param id the primary key of the hall
	* @return the hall
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchHallException if a hall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall findByPrimaryKey(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchHallException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the hall with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the hall
	* @return the hall, or <code>null</code> if a hall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the halls.
	*
	* @return the halls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Hall> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the halls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of halls
	* @param end the upper bound of the range of halls (not inclusive)
	* @return the range of halls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Hall> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the halls.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of halls
	* @param end the upper bound of the range of halls (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of halls
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Hall> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the halls from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of halls.
	*
	* @return the number of halls
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}