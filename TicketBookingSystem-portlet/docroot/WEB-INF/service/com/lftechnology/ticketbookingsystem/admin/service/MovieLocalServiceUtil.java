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
 * The utility for the movie local service. This utility wraps {@link com.lftechnology.ticketbookingsystem.admin.service.impl.MovieLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sudipshrestha
 * @see MovieLocalService
 * @see com.lftechnology.ticketbookingsystem.admin.service.base.MovieLocalServiceBaseImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.impl.MovieLocalServiceImpl
 * @generated
 */
public class MovieLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.lftechnology.ticketbookingsystem.admin.service.impl.MovieLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the movie to the database. Also notifies the appropriate model listeners.
	*
	* @param movie the movie
	* @return the movie that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie addMovie(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addMovie(movie);
	}

	/**
	* Creates a new movie with the primary key. Does not add the movie to the database.
	*
	* @param id the primary key for the new movie
	* @return the new movie
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie createMovie(
		long id) {
		return getService().createMovie(id);
	}

	/**
	* Deletes the movie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the movie
	* @return the movie that was removed
	* @throws PortalException if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie deleteMovie(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMovie(id);
	}

	/**
	* Deletes the movie from the database. Also notifies the appropriate model listeners.
	*
	* @param movie the movie
	* @return the movie that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie deleteMovie(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteMovie(movie);
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

	public static com.lftechnology.ticketbookingsystem.admin.model.Movie fetchMovie(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchMovie(id);
	}

	/**
	* Returns the movie with the primary key.
	*
	* @param id the primary key of the movie
	* @return the movie
	* @throws PortalException if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie getMovie(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getMovie(id);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> getMovies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMovies(start, end);
	}

	/**
	* Returns the number of movies.
	*
	* @return the number of movies
	* @throws SystemException if a system exception occurred
	*/
	public static int getMoviesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getMoviesCount();
	}

	/**
	* Updates the movie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param movie the movie
	* @return the movie that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie updateMovie(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMovie(movie);
	}

	/**
	* Updates the movie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param movie the movie
	* @param merge whether to merge the movie with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the movie that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.ticketbookingsystem.admin.model.Movie updateMovie(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateMovie(movie, merge);
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

	public static com.lftechnology.ticketbookingsystem.admin.model.Movie update(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().update(movie);
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Shift addShift(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addShift(shift);
	}

	public static com.lftechnology.ticketbookingsystem.admin.model.Hall addHall(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().addHall(hall);
	}

	public static void clearService() {
		_service = null;
	}

	public static MovieLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					MovieLocalService.class.getName());

			if (invokableLocalService instanceof MovieLocalService) {
				_service = (MovieLocalService)invokableLocalService;
			}
			else {
				_service = new MovieLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(MovieLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(MovieLocalService service) {
	}

	private static MovieLocalService _service;
}