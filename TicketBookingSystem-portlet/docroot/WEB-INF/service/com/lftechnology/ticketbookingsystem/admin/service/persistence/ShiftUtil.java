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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the shift service. This utility wraps {@link ShiftPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see ShiftPersistence
 * @see ShiftPersistenceImpl
 * @generated
 */
public class ShiftUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Shift shift) {
		getPersistence().clearCache(shift);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Shift> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Shift> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Shift> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Shift update(Shift shift, boolean merge)
		throws SystemException {
		return getPersistence().update(shift, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Shift update(Shift shift, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(shift, merge, serviceContext);
	}

	/**
	* Caches the shift in the entity cache if it is enabled.
	*
	* @param shift the shift
	*/
	public static void cacheResult(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift) {
		getPersistence().cacheResult(shift);
	}

	/**
	* Caches the shifts in the entity cache if it is enabled.
	*
	* @param shifts the shifts
	*/
	public static void cacheResult(
		java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> shifts) {
		getPersistence().cacheResult(shifts);
	}

	/**
	* Creates a new shift with the primary key. Does not add the shift to the database.
	*
	* @param id the primary key for the new shift
	* @return the new shift
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the shift with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the shift
	* @return the shift that was removed
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException if a shift with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift remove(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Shift updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(shift, merge);
	}

	/**
	* Returns the shift with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException} if it could not be found.
	*
	* @param id the primary key of the shift
	* @return the shift
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException if a shift with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift findByPrimaryKey(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the shift with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the shift
	* @return the shift, or <code>null</code> if a shift with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Shift fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the shifts.
	*
	* @return the shifts
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Shift> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the shifts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of shifts.
	*
	* @return the number of shifts
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ShiftPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ShiftPersistence)PortletBeanLocatorUtil.locate(com.lftechnology.ticketbookingsystem.admin.service.ClpSerializer.getServletContextName(),
					ShiftPersistence.class.getName());

			ReferenceRegistry.registerReference(ShiftUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(ShiftPersistence persistence) {
	}

	private static ShiftPersistence _persistence;
}