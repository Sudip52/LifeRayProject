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
 * This class is a wrapper for {@link MovieLocalService}.
 * </p>
 *
 * @author    sudipshrestha
 * @see       MovieLocalService
 * @generated
 */
public class MovieLocalServiceWrapper implements MovieLocalService,
	ServiceWrapper<MovieLocalService> {
	public MovieLocalServiceWrapper(MovieLocalService movieLocalService) {
		_movieLocalService = movieLocalService;
	}

	/**
	* Adds the movie to the database. Also notifies the appropriate model listeners.
	*
	* @param movie the movie
	* @return the movie that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie addMovie(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.addMovie(movie);
	}

	/**
	* Creates a new movie with the primary key. Does not add the movie to the database.
	*
	* @param id the primary key for the new movie
	* @return the new movie
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie createMovie(
		long id) {
		return _movieLocalService.createMovie(id);
	}

	/**
	* Deletes the movie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the movie
	* @return the movie that was removed
	* @throws PortalException if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie deleteMovie(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.deleteMovie(id);
	}

	/**
	* Deletes the movie from the database. Also notifies the appropriate model listeners.
	*
	* @param movie the movie
	* @return the movie that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie deleteMovie(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.deleteMovie(movie);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _movieLocalService.dynamicQuery();
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
		return _movieLocalService.dynamicQuery(dynamicQuery);
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
		return _movieLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _movieLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _movieLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Movie fetchMovie(
		long id) throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.fetchMovie(id);
	}

	/**
	* Returns the movie with the primary key.
	*
	* @param id the primary key of the movie
	* @return the movie
	* @throws PortalException if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie getMovie(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.getMovie(id);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> getMovies(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.getMovies(start, end);
	}

	/**
	* Returns the number of movies.
	*
	* @return the number of movies
	* @throws SystemException if a system exception occurred
	*/
	public int getMoviesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.getMoviesCount();
	}

	/**
	* Updates the movie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param movie the movie
	* @return the movie that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie updateMovie(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.updateMovie(movie);
	}

	/**
	* Updates the movie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param movie the movie
	* @param merge whether to merge the movie with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the movie that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie updateMovie(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.updateMovie(movie, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _movieLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_movieLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _movieLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Movie update(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _movieLocalService.update(movie);
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Movie get(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.get(id);
	}

	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> fecthAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.fecthAll();
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Movie delete(
		long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _movieLocalService.delete(id);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public MovieLocalService getWrappedMovieLocalService() {
		return _movieLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedMovieLocalService(MovieLocalService movieLocalService) {
		_movieLocalService = movieLocalService;
	}

	public MovieLocalService getWrappedService() {
		return _movieLocalService;
	}

	public void setWrappedService(MovieLocalService movieLocalService) {
		_movieLocalService = movieLocalService;
	}

	private MovieLocalService _movieLocalService;
}