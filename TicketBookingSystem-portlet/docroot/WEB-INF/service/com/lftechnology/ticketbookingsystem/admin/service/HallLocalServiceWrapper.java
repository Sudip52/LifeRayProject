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

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link HallLocalService}.
 * </p>
 *
 * @author    sudipshrestha
 * @see       HallLocalService
 * @generated
 */
public class HallLocalServiceWrapper implements HallLocalService,
	ServiceWrapper<HallLocalService> {
	public HallLocalServiceWrapper(HallLocalService hallLocalService) {
		_hallLocalService = hallLocalService;
	}

	/**
	* Adds the hall to the database. Also notifies the appropriate model listeners.
	*
	* @param hall the hall
	* @return the hall that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall addHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.addHall(hall);
	}

	/**
	* Creates a new hall with the primary key. Does not add the hall to the database.
	*
	* @param id the primary key for the new hall
	* @return the new hall
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall createHall(
		long id) {
		return _hallLocalService.createHall(id);
	}

	/**
	* Deletes the hall with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the hall
	* @return the hall that was removed
	* @throws PortalException if a hall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall deleteHall(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.deleteHall(id);
	}

	/**
	* Deletes the hall from the database. Also notifies the appropriate model listeners.
	*
	* @param hall the hall
	* @return the hall that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall deleteHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.deleteHall(hall);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hallLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.dynamicQuery(dynamicQuery);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.dynamicQuery(dynamicQuery, start, end);
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
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Hall fetchHall(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.fetchHall(id);
	}

	/**
	* Returns the hall with the primary key.
	*
	* @param id the primary key of the hall
	* @return the hall
	* @throws PortalException if a hall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall getHall(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.getHall(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.getPersistedModel(primaryKeyObj);
	}

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
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Hall> getHalls(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.getHalls(start, end);
	}

	/**
	* Returns the number of halls.
	*
	* @return the number of halls
	* @throws SystemException if a system exception occurred
	*/
	public int getHallsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.getHallsCount();
	}

	/**
	* Updates the hall in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hall the hall
	* @return the hall that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall updateHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.updateHall(hall);
	}

	/**
	* Updates the hall in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hall the hall
	* @param merge whether to merge the hall with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the hall that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Hall updateHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.updateHall(hall, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _hallLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_hallLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _hallLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Hall update(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hallLocalService.update(hall);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public HallLocalService getWrappedHallLocalService() {
		return _hallLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedHallLocalService(HallLocalService hallLocalService) {
		_hallLocalService = hallLocalService;
	}

	public HallLocalService getWrappedService() {
		return _hallLocalService;
	}

	public void setWrappedService(HallLocalService hallLocalService) {
		_hallLocalService = hallLocalService;
	}

	private HallLocalService _hallLocalService;
}