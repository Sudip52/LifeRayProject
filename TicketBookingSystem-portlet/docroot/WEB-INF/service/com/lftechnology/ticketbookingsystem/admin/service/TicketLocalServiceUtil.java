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

package com.lftechnology.ticketbookingsystem.admin.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the ticket local service. This utility wraps {@link com.lftechnology.ticketbookingsystem.admin.service.impl.TicketLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sudipshrestha
 * @see TicketLocalService
 * @see com.lftechnology.ticketbookingsystem.admin.service.base.TicketLocalServiceBaseImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.impl.TicketLocalServiceImpl
 * @generated
 */
public class TicketLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.lftechnology.ticketbookingsystem.admin.service.impl.TicketLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the ticket to the database. Also notifies the appropriate model listeners.
	*
	* @param ticket the ticket
	* @return the ticket that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket addTicket(
		com.lftechnology.ticketbookingsystem.admin.model.Ticket ticket)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addTicket(ticket);
	}

	/**
	* Creates a new ticket with the primary key. Does not add the ticket to the database.
	*
	* @param id the primary key for the new ticket
	* @return the new ticket
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket createTicket(
		long id) {
		return getService().createTicket(id);
	}

	/**
	* Deletes the ticket with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the ticket
	* @return the ticket that was removed
	* @throws PortalException if a ticket with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket deleteTicket(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTicket(id);
	}

	/**
	* Deletes the ticket from the database. Also notifies the appropriate model listeners.
	*
	* @param ticket the ticket
	* @return the ticket that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket deleteTicket(
		com.lftechnology.ticketbookingsystem.admin.model.Ticket ticket)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteTicket(ticket);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket fetchTicket(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchTicket(id);
	}

	/**
	* Returns the ticket with the primary key.
	*
	* @param id the primary key of the ticket
	* @return the ticket
	* @throws PortalException if a ticket with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket getTicket(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getTicket(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Ticket> getTickets(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTickets(start, end);
	}

	/**
	* Returns the number of tickets.
	*
	* @return the number of tickets
	* @throws SystemException if a system exception occurred
	*/
	public static int getTicketsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getTicketsCount();
	}

	/**
	* Updates the ticket in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ticket the ticket
	* @return the ticket that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket updateTicket(
		com.lftechnology.ticketbookingsystem.admin.model.Ticket ticket)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTicket(ticket);
	}

	/**
	* Updates the ticket in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param ticket the ticket
	* @param merge whether to merge the ticket with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the ticket that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket updateTicket(
		com.lftechnology.ticketbookingsystem.admin.model.Ticket ticket,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateTicket(ticket, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket update(
		com.lftechnology.ticketbookingsystem.admin.model.Ticket ticket)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().update(ticket);
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket get(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().get(id);
	}

	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Ticket> fecthAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fecthAll();
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Ticket delete(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(id);
	}

	public static void clearService() {
		_service = null;
	}

	public static TicketLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					TicketLocalService.class.getName());

			if (invokableLocalService instanceof TicketLocalService) {
				_service = (TicketLocalService)invokableLocalService;
			}
			else {
				_service = new TicketLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(TicketLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(TicketLocalService service) {
	}

	private static TicketLocalService _service;
}