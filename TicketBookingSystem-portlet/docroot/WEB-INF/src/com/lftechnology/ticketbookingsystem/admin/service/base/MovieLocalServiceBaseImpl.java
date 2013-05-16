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

import com.lftechnology.ticketbookingsystem.admin.model.Movie;
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
 * The base implementation of the movie local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.lftechnology.ticketbookingsystem.admin.service.impl.MovieLocalServiceImpl}.
 * </p>
 *
 * @author sudipshrestha
 * @see com.lftechnology.ticketbookingsystem.admin.service.impl.MovieLocalServiceImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.MovieLocalServiceUtil
 * @generated
 */
public abstract class MovieLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements MovieLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.lftechnology.ticketbookingsystem.admin.service.MovieLocalServiceUtil} to access the movie local service.
	 */

	/**
	 * Adds the movie to the database. Also notifies the appropriate model listeners.
	 *
	 * @param movie the movie
	 * @return the movie that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Movie addMovie(Movie movie) throws SystemException {
		movie.setNew(true);

		return moviePersistence.update(movie, false);
	}

	/**
	 * Creates a new movie with the primary key. Does not add the movie to the database.
	 *
	 * @param id the primary key for the new movie
	 * @return the new movie
	 */
	public Movie createMovie(long id) {
		return moviePersistence.create(id);
	}

	/**
	 * Deletes the movie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the movie
	 * @return the movie that was removed
	 * @throws PortalException if a movie with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Movie deleteMovie(long id) throws PortalException, SystemException {
		return moviePersistence.remove(id);
	}

	/**
	 * Deletes the movie from the database. Also notifies the appropriate model listeners.
	 *
	 * @param movie the movie
	 * @return the movie that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	public Movie deleteMovie(Movie movie) throws SystemException {
		return moviePersistence.remove(movie);
	}

	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Movie.class,
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
		return moviePersistence.findWithDynamicQuery(dynamicQuery);
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
		return moviePersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
		return moviePersistence.findWithDynamicQuery(dynamicQuery, start, end,
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
		return moviePersistence.countWithDynamicQuery(dynamicQuery);
	}

	public Movie fetchMovie(long id) throws SystemException {
		return moviePersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the movie with the primary key.
	 *
	 * @param id the primary key of the movie
	 * @return the movie
	 * @throws PortalException if a movie with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Movie getMovie(long id) throws PortalException, SystemException {
		return moviePersistence.findByPrimaryKey(id);
	}

	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return moviePersistence.findByPrimaryKey(primaryKeyObj);
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
	public List<Movie> getMovies(int start, int end) throws SystemException {
		return moviePersistence.findAll(start, end);
	}

	/**
	 * Returns the number of movies.
	 *
	 * @return the number of movies
	 * @throws SystemException if a system exception occurred
	 */
	public int getMoviesCount() throws SystemException {
		return moviePersistence.countAll();
	}

	/**
	 * Updates the movie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param movie the movie
	 * @return the movie that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Movie updateMovie(Movie movie) throws SystemException {
		return updateMovie(movie, true);
	}

	/**
	 * Updates the movie in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param movie the movie
	 * @param merge whether to merge the movie with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	 * @return the movie that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Movie updateMovie(Movie movie, boolean merge)
		throws SystemException {
		movie.setNew(false);

		return moviePersistence.update(movie, merge);
	}

	/**
	 * Returns the hall local service.
	 *
	 * @return the hall local service
	 */
	
	
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
		PersistedModelLocalServiceRegistryUtil.register("com.lftechnology.ticketbookingsystem.admin.model.Movie",
			movieLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.lftechnology.ticketbookingsystem.admin.model.Movie");
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
		return Movie.class;
	}

	protected String getModelClassName() {
		return Movie.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = moviePersistence.getDataSource();

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
	private MovieLocalServiceClpInvoker _clpInvoker = new MovieLocalServiceClpInvoker();
}