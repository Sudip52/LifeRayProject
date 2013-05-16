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

import com.lftechnology.ticketbookingsystem.admin.model.Ticket;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the ticket service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see TicketPersistenceImpl
 * @see TicketUtil
 * @generated
 */
public interface TicketPersistence extends BasePersistence<Ticket> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TicketUtil} to access the ticket persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the ticket in the entity cache if it is enabled.
	*
	* @param ticket the ticket
	*/
	public void cacheResult(
		com.lftechnology.ticketbookingsystem.admin.model.Ticket ticket);

	/**
	* Caches the tickets in the entity cache if it is enabled.
	*
	* @param tickets the tickets
	*/
	public void cacheResult(
		java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Ticket> tickets);

	/**
	* Creates a new ticket with the primary key. Does not add the ticket to the database.
	*
	* @param id the primary key for the new ticket
	* @return the new ticket
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Ticket create(
		long id);

	/**
	* Removes the ticket with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ticket
	* @return the ticket that was removed
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchTicketException if a ticket with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Ticket remove(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchTicketException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lftechnology.ticketbookingsystem.admin.model.Ticket updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Ticket ticket,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ticket with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchTicketException} if it could not be found.
	*
	* @param id the primary key of the ticket
	* @return the ticket
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchTicketException if a ticket with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Ticket findByPrimaryKey(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchTicketException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the ticket with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the ticket
	* @return the ticket, or <code>null</code> if a ticket with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Ticket fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the tickets.
	*
	* @return the tickets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Ticket> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the tickets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tickets
	* @param end the upper bound of the range of tickets (not inclusive)
	* @return the range of tickets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Ticket> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the tickets.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of tickets
	* @param end the upper bound of the range of tickets (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of tickets
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Ticket> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the tickets from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of tickets.
	*
	* @return the number of tickets
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}