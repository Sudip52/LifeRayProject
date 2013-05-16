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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the movie service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see MoviePersistenceImpl
 * @see MovieUtil
 * @generated
 */
public interface MoviePersistence extends BasePersistence<Movie> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MovieUtil} to access the movie persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the movie in the entity cache if it is enabled.
	*
	* @param movie the movie
	*/
	public void cacheResult(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie);

	/**
	* Caches the movies in the entity cache if it is enabled.
	*
	* @param movies the movies
	*/
	public void cacheResult(
		java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> movies);

	/**
	* Creates a new movie with the primary key. Does not add the movie to the database.
	*
	* @param id the primary key for the new movie
	* @return the new movie
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie create(
		long id);

	/**
	* Removes the movie with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the movie
	* @return the movie that was removed
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie remove(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lftechnology.ticketbookingsystem.admin.model.Movie updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the movie with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException} if it could not be found.
	*
	* @param id the primary key of the movie
	* @return the movie
	* @throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie findByPrimaryKey(
		long id)
		throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the movie with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the movie
	* @return the movie, or <code>null</code> if a movie with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.ticketbookingsystem.admin.model.Movie fetchByPrimaryKey(
		long id) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the movies.
	*
	* @return the movies
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.lftechnology.ticketbookingsystem.admin.model.Movie> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the movies from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of movies.
	*
	* @return the number of movies
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}