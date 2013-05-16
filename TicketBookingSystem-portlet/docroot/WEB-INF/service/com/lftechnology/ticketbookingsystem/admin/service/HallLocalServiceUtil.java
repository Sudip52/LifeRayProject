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
 * The utility for the hall local service. This utility wraps {@link com.lftechnology.ticketbookingsystem.admin.service.impl.HallLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sudipshrestha
 * @see HallLocalService
 * @see com.lftechnology.ticketbookingsystem.admin.service.base.HallLocalServiceBaseImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.impl.HallLocalServiceImpl
 * @generated
 */
public class HallLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.lftechnology.ticketbookingsystem.admin.service.impl.HallLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the hall to the database. Also notifies the appropriate model listeners.
	*
	* @param hall the hall
	* @return the hall that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Hall addHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addHall(hall);
	}

	/**
	* Creates a new hall with the primary key. Does not add the hall to the database.
	*
	* @param id the primary key for the new hall
	* @return the new hall
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Hall createHall(
		long id) {
		return getService().createHall(id);
	}

	/**
	* Deletes the hall with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the hall
	* @return the hall that was removed
	* @throws PortalException if a hall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Hall deleteHall(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteHall(id);
	}

	/**
	* Deletes the hall from the database. Also notifies the appropriate model listeners.
	*
	* @param hall the hall
	* @return the hall that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Hall deleteHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteHall(hall);
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

	public static com.lftechnology.ticketbookingsystem.admin.model.Hall fetchHall(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchHall(id);
	}

	/**
	* Returns the hall with the primary key.
	*
	* @param id the primary key of the hall
	* @return the hall
	* @throws PortalException if a hall with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Hall getHall(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getHall(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Hall> getHalls(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHalls(start, end);
	}

	/**
	* Returns the number of halls.
	*
	* @return the number of halls
	* @throws SystemException if a system exception occurred
	*/
	public static int getHallsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHallsCount();
	}

	/**
	* Updates the hall in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hall the hall
	* @return the hall that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Hall updateHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateHall(hall);
	}

	/**
	* Updates the hall in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hall the hall
	* @param merge whether to merge the hall with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the hall that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Hall updateHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateHall(hall, merge);
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

	public static com.lftechnology.ticketbookingsystem.admin.model.Hall update(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().update(hall);
	}

	public static void clearService() {
		_service = null;
	}

	public static HallLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					HallLocalService.class.getName());

			if (invokableLocalService instanceof HallLocalService) {
				_service = (HallLocalService)invokableLocalService;
			}
			else {
				_service = new HallLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(HallLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(HallLocalService service) {
	}

	private static HallLocalService _service;
}