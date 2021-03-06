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

package com.lftechnology.ticketbookingsystem.admin.service.base;

import com.lftechnology.ticketbookingsystem.admin.model.Ticket;
import com.lftechnology.ticketbookingsystem.admin.service.HallLocalService;
import com.lftechnology.ticketbookingsystem.admin.service.MovieLocalService;
import com.lftechnology.ticketbookingsystem.admin.service.ShiftLocalService;
import com.lftechnology.ticketbookingsystem.admin.service.TicketLocalService;
import com.lftechnology.ticketbookingsystem.admin.service.persistence.HallPersistence;
import com.lftechnology.ticketbookingsystem.admin.service.persistence.MoviePersistence;
import com.lftechnology.ticketbookingsystem.admin.service.persistence.ShiftPersistence;
import com.lftechnology.ticketbookingsystem.admin.service.persistence.TicketPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the ticket local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.lftechnology.ticketbookingsystem.admin.service.impl.TicketLocalServiceImpl}.
 * </p>
 *
 * @author sudipshrestha
 * @see com.lftechnology.ticketbookingsystem.admin.service.impl.TicketLocalServiceImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.TicketLocalServiceUtil
 * @generated
 */
public abstract class TicketLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements TicketLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.lftechnology.ticketbookingsystem.admin.service.TicketLocalServiceUtil} to access the ticket local service.
	 */

	/**
	 * Adds the ticket to the database. Also notifies the appropriate model listeners.
	 *
	 * @param ticket the ticket
	 * @return the ticket that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Ticket addTicket(Ticket ticket) throws SystemException {
		ticket.setNew(true);

		return ticketPersistence.update(ticket, false);
	}

	/**
	 * Creates a new ticket with the primary key. Does not add the ticket to the database.
	 *
	 * @param id the primary key for the new ticket
	 * @return the new ticket
	 */
	public Ticket createTicket(long id) {
		return ticketPersistence.create(id);
	}

	/**
	 * Deletes the ticket with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the ticket
	 * @return the ticket that was removed
	 * @throws PortalException if a ticket with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Ticket deleteTicket(long id) throws PortalException, SystemException {
		return ticketPersistence.remove(id);
	}

	/**
	 * Deletes the ticket from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ticket the ticket
	 * @return the ticket that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Ticket deleteTicket(Ticket ticket) throws SystemException {
		return ticketPersistence.remove(ticket);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Ticket.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return ticketPersistence.findWithDynamicQuery(dynamicQuery);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return ticketPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return ticketPersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return ticketPersistence.countWithDynamicQuery(dynamicQuery);
	}

	public Ticket fetchTicket(long id) throws SystemException {
		return ticketPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the ticket with the primary key.
	 *
	 * @param id the primary key of the ticket
	 * @return the ticket
	 * @throws PortalException if a ticket with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Ticket getTicket(long id) throws PortalException, SystemException {
		return ticketPersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return ticketPersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<Ticket> getTickets(int start, int end)
		throws SystemException {
		return ticketPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of tickets.
	 *
	 * @return the number of tickets
	 * @throws SystemException if a system exception occurred
	 */
	public int getTicketsCount() throws SystemException {
		return ticketPersistence.countAll();
	}

	/**
	 * Updates the ticket in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param ticket the ticket
	 * @return the ticket that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Ticket updateTicket(Ticket ticket) throws SystemException {
		return updateTicket(ticket, true);
	}

	/**
	 * Updates the ticket in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param ticket the ticket
	 * @param merge whether to merge the ticket with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the ticket that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Ticket updateTicket(Ticket ticket, boolean merge)
		throws SystemException {
		ticket.setNew(false);

		return ticketPersistence.update(ticket, merge);
	}

	/**
	 * Returns the hall local service.
	 *
	 * @return the hall local service
	 */
	public HallLocalService getHallLocalService() {
		return hallLocalService;
	}

	/**
	 * Sets the hall local service.
	 *
	 * @param hallLocalService the hall local service
	 */
	public void setHallLocalService(HallLocalService hallLocalService) {
		this.hallLocalService = hallLocalService;
	}

	/**
	 * Returns the hall persistence.
	 *
	 * @return the hall persistence
	 */
	public HallPersistence getHallPersistence() {
		return hallPersistence;
	}

	/**
	 * Sets the hall persistence.
	 *
	 * @param hallPersistence the hall persistence
	 */
	public void setHallPersistence(HallPersistence hallPersistence) {
		this.hallPersistence = hallPersistence;
	}

	/**
	 * Returns the movie local service.
	 *
	 * @return the movie local service
	 */
	public MovieLocalService getMovieLocalService() {
		return movieLocalService;
	}

	/**
	 * Sets the movie local service.
	 *
	 * @param movieLocalService the movie local service
	 */
	public void setMovieLocalService(MovieLocalService movieLocalService) {
		this.movieLocalService = movieLocalService;
	}

	/**
	 * Returns the movie persistence.
	 *
	 * @return the movie persistence
	 */
	public MoviePersistence getMoviePersistence() {
		return moviePersistence;
	}

	/**
	 * Sets the movie persistence.
	 *
	 * @param moviePersistence the movie persistence
	 */
	public void setMoviePersistence(MoviePersistence moviePersistence) {
		this.moviePersistence = moviePersistence;
	}

	/**
	 * Returns the shift local service.
	 *
	 * @return the shift local service
	 */
	public ShiftLocalService getShiftLocalService() {
		return shiftLocalService;
	}

	/**
	 * Sets the shift local service.
	 *
	 * @param shiftLocalService the shift local service
	 */
	public void setShiftLocalService(ShiftLocalService shiftLocalService) {
		this.shiftLocalService = shiftLocalService;
	}

	/**
	 * Returns the shift persistence.
	 *
	 * @return the shift persistence
	 */
	public ShiftPersistence getShiftPersistence() {
		return shiftPersistence;
	}

	/**
	 * Sets the shift persistence.
	 *
	 * @param shiftPersistence the shift persistence
	 */
	public void setShiftPersistence(ShiftPersistence shiftPersistence) {
		this.shiftPersistence = shiftPersistence;
	}

	/**
	 * Returns the ticket local service.
	 *
	 * @return the ticket local service
	 */
	public TicketLocalService getTicketLocalService() {
		return ticketLocalService;
	}

	/**
	 * Sets the ticket local service.
	 *
	 * @param ticketLocalService the ticket local service
	 */
	public void setTicketLocalService(TicketLocalService ticketLocalService) {
		this.ticketLocalService = ticketLocalService;
	}

	/**
	 * Returns the ticket persistence.
	 *
	 * @return the ticket persistence
	 */
	public TicketPersistence getTicketPersistence() {
		return ticketPersistence;
	}

	/**
	 * Sets the ticket persistence.
	 *
	 * @param ticketPersistence the ticket persistence
	 */
	public void setTicketPersistence(TicketPersistence ticketPersistence) {
		this.ticketPersistence = ticketPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the resource remote service.
	 *
	 * @return the resource remote service
	 */
	public ResourceService getResourceService() {
		return resourceService;
	}

	/**
	 * Sets the resource remote service.
	 *
	 * @param resourceService the resource remote service
	 */
	public void setResourceService(ResourceService resourceService) {
		this.resourceService = resourceService;
	}

	/**
	 * Returns the resource persistence.
	 *
	 * @return the resource persistence
	 */
	public ResourcePersistence getResourcePersistence() {
		return resourcePersistence;
	}

	/**
	 * Sets the resource persistence.
	 *
	 * @param resourcePersistence the resource persistence
	 */
	public void setResourcePersistence(ResourcePersistence resourcePersistence) {
		this.resourcePersistence = resourcePersistence;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		PersistedModelLocalServiceRegistryUtil.register("com.lftechnology.ticketbookingsystem.admin.model.Ticket",
			ticketLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.lftechnology.ticketbookingsystem.admin.model.Ticket");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
	}

	protected Class<?> getModelClass() {
		return Ticket.class;
	}

	protected String getModelClassName() {
		return Ticket.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = ticketPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = HallLocalService.class)
	protected HallLocalService hallLocalService;
	@BeanReference(type = HallPersistence.class)
	protected HallPersistence hallPersistence;
	@BeanReference(type = MovieLocalService.class)
	protected MovieLocalService movieLocalService;
	@BeanReference(type = MoviePersistence.class)
	protected MoviePersistence moviePersistence;
	@BeanReference(type = ShiftLocalService.class)
	protected ShiftLocalService shiftLocalService;
	@BeanReference(type = ShiftPersistence.class)
	protected ShiftPersistence shiftPersistence;
	@BeanReference(type = TicketLocalService.class)
	protected TicketLocalService ticketLocalService;
	@BeanReference(type = TicketPersistence.class)
	protected TicketPersistence ticketPersistence;
	@BeanReference(type = CounterLocalService.class)
	protected CounterLocalService counterLocalService;
	@BeanReference(type = ResourceLocalService.class)
	protected ResourceLocalService resourceLocalService;
	@BeanReference(type = ResourceService.class)
	protected ResourceService resourceService;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserLocalService.class)
	protected UserLocalService userLocalService;
	@BeanReference(type = UserService.class)
	protected UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private TicketLocalServiceClpInvoker _clpInvoker = new TicketLocalServiceClpInvoker();
}