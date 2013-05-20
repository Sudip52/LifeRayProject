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
 * The utility for the shift local service. This utility wraps {@link com.lftechnology.ticketbookingsystem.admin.service.impl.ShiftLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sudipshrestha
 * @see ShiftLocalService
 * @see com.lftechnology.ticketbookingsystem.admin.service.base.ShiftLocalServiceBaseImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.impl.ShiftLocalServiceImpl
 * @generated
 */
public class ShiftLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.lftechnology.ticketbookingsystem.admin.service.impl.ShiftLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the shift to the database. Also notifies the appropriate model listeners.
	*
	* @param shift the shift
	* @return the shift that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift addShift(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addShift(shift);
	}

	/**
	* Creates a new shift with the primary key. Does not add the shift to the database.
	*
	* @param id the primary key for the new shift
	* @return the new shift
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift createShift(
		long id) {
		return getService().createShift(id);
	}

	/**
	* Deletes the shift with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shift
	* @return the shift that was removed
	* @throws PortalException if a shift with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift deleteShift(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteShift(id);
	}

	/**
	* Deletes the shift from the database. Also notifies the appropriate model listeners.
	*
	* @param shift the shift
	* @return the shift that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift deleteShift(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteShift(shift);
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

	public static com.lftechnology.ticketbookingsystem.admin.model.Shift fetchShift(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchShift(id);
	}

	/**
	* Returns the shift with the primary key.
	*
	* @param id the primary key of the shift
	* @return the shift
	* @throws PortalException if a shift with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift getShift(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getShift(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
	}

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
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> getShifts(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getShifts(start, end);
	}

	/**
	* Returns the number of shifts.
	*
	* @return the number of shifts
	* @throws SystemException if a system exception occurred
	*/
	public static int getShiftsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getShiftsCount();
	}

	/**
	* Updates the shift in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shift the shift
	* @return the shift that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift updateShift(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateShift(shift);
	}

	/**
	* Updates the shift in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shift the shift
	* @param merge whether to merge the shift with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the shift that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift updateShift(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateShift(shift, merge);
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

	public static com.lftechnology.ticketbookingsystem.admin.model.Shift update(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift) {
		return getService().update(shift);
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Shift get(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().get(id);
	}

	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> fecthAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fecthAll();
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Shift delete(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(id);
	}

	public static void clearService() {
		_service = null;
	}

	public static ShiftLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					ShiftLocalService.class.getName());

			if (invokableLocalService instanceof ShiftLocalService) {
				_service = (ShiftLocalService)invokableLocalService;
			}
			else {
				_service = new ShiftLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(ShiftLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(ShiftLocalService service) {
	}

	private static ShiftLocalService _service;
}