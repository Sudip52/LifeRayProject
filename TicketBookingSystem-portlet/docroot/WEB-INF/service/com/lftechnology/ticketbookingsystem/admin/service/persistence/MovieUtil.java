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

import com.lftechnology.ticketbookingsystem.admin.model.Movie;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the movie service. This utility wraps {@link MoviePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see MoviePersistence
 * @see MoviePersistenceImpl
 * @generated
 */
public class MovieUtil {
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
	public static void clearCache(Movie movie) {
		getPersistence().clearCache(movie);
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
	public static List<Movie> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Movie> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Movie> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Movie update(Movie movie, boolean merge)
		throws SystemException {
		return getPersistence().update(movie, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Movie update(Movie movie, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(movie, merge, serviceContext);
	}

	/**
	* Caches the movie in the entity cache if it is enabled.
	*
	* @param movie the movie
	*/
	public static void cacheResult(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie) {
		getPersistence().cacheResult(movie);
	}

	/**
	* Caches the movies in the entity cache if it is enabled.
	*
	* @param movies the movies
	*/
	public static void cacheResult(
		java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> movies) {
		getPersistence().cacheResult(movies);
	}

	/**
	* Creates a new movie with the primary key. Does not add the movie to the database.
	*
	* @param id the primary key for the new movie
	* @return the new movie
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie create(
		long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the movie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the movie
	* @return the movie that was removed
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie remove(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(id);
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Movie updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(movie, merge);
	}

	/**
	* Returns the movie with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException} if it could not be found.
	*
	* @param id the primary key of the movie
	* @return the movie
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie findByPrimaryKey(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the movie with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the movie
	* @return the movie, or <code>null</code> if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the movies.
	*
	* @return the movies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the movies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of movies
	* @param end the upper bound of the range of movies (not inclusive)
	* @return the range of movies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the movies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of movies
	* @param end the upper bound of the range of movies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of movies
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the movies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of movies.
	*
	* @return the number of movies
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static MoviePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (MoviePersistence)PortletBeanLocatorUtil.locate(com.lftechnology.ticketbookingsystem.admin.service.ClpSerializer.getServletContextName(),
					MoviePersistence.class.getName());

			ReferenceRegistry.registerReference(MovieUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(MoviePersistence persistence) {
	}

	private static MoviePersistence _persistence;
}