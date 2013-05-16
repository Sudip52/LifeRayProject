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

import com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException;
import com.lftechnology.ticketbookingsystem.admin.model.Movie;
import com.lftechnology.ticketbookingsystem.admin.model.impl.MovieImpl;
import com.lftechnology.ticketbookingsystem.admin.model.impl.MovieModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the movie service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see MoviePersistence
 * @see MovieUtil
 * @generated
 */
public class MoviePersistenceImpl extends BasePersistenceImpl<Movie>
	implements MoviePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MovieUtil} to access the movie persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MovieImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MovieModelImpl.ENTITY_CACHE_ENABLED,
			MovieModelImpl.FINDER_CACHE_ENABLED, MovieImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MovieModelImpl.ENTITY_CACHE_ENABLED,
			MovieModelImpl.FINDER_CACHE_ENABLED, MovieImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MovieModelImpl.ENTITY_CACHE_ENABLED,
			MovieModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the movie in the entity cache if it is enabled.
	 *
	 * @param movie the movie
	 */
	public void cacheResult(Movie movie) {
		EntityCacheUtil.putResult(MovieModelImpl.ENTITY_CACHE_ENABLED,
			MovieImpl.class, movie.getPrimaryKey(), movie);

		movie.resetOriginalValues();
	}

	/**
	 * Caches the movies in the entity cache if it is enabled.
	 *
	 * @param movies the movies
	 */
	public void cacheResult(List<Movie> movies) {
		for (Movie movie : movies) {
			if (EntityCacheUtil.getResult(MovieModelImpl.ENTITY_CACHE_ENABLED,
						MovieImpl.class, movie.getPrimaryKey()) == null) {
				cacheResult(movie);
			}
			else {
				movie.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all movies.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(MovieImpl.class.getName());
		}

		EntityCacheUtil.clearCache(MovieImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the movie.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Movie movie) {
		EntityCacheUtil.removeResult(MovieModelImpl.ENTITY_CACHE_ENABLED,
			MovieImpl.class, movie.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Movie> movies) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Movie movie : movies) {
			EntityCacheUtil.removeResult(MovieModelImpl.ENTITY_CACHE_ENABLED,
				MovieImpl.class, movie.getPrimaryKey());
		}
	}

	/**
	 * Creates a new movie with the primary key. Does not add the movie to the database.
	 *
	 * @param id the primary key for the new movie
	 * @return the new movie
	 */
	public Movie create(long id) {
		Movie movie = new MovieImpl();

		movie.setNew(true);
		movie.setPrimaryKey(id);

		return movie;
	}

	/**
	 * Removes the movie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the movie
	 * @return the movie that was removed
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException if a movie with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Movie remove(long id) throws NoSuchMovieException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the movie with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the movie
	 * @return the movie that was removed
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException if a movie with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Movie remove(Serializable primaryKey)
		throws NoSuchMovieException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Movie movie = (Movie)session.get(MovieImpl.class, primaryKey);

			if (movie == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMovieException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(movie);
		}
		catch (NoSuchMovieException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Movie removeImpl(Movie movie) throws SystemException {
		movie = toUnwrappedModel(movie);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, movie);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(movie);

		return movie;
	}

	@Override
	public Movie updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie,
		boolean merge) throws SystemException {
		movie = toUnwrappedModel(movie);

		boolean isNew = movie.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, movie, merge);

			movie.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(MovieModelImpl.ENTITY_CACHE_ENABLED,
			MovieImpl.class, movie.getPrimaryKey(), movie);

		return movie;
	}

	protected Movie toUnwrappedModel(Movie movie) {
		if (movie instanceof MovieImpl) {
			return movie;
		}

		MovieImpl movieImpl = new MovieImpl();

		movieImpl.setNew(movie.isNew());
		movieImpl.setPrimaryKey(movie.getPrimaryKey());

		movieImpl.setId(movie.getId());
		movieImpl.setMoviename(movie.getMoviename());
		movieImpl.setDirectorname(movie.getDirectorname());
		movieImpl.setShift_id(movie.getShift_id());
		movieImpl.setHall_id(movie.getHall_id());
		movieImpl.setTicket_id(movie.getTicket_id());
		movieImpl.setCompanyId(movie.getCompanyId());
		movieImpl.setGroupId(movie.getGroupId());

		return movieImpl;
	}

	/**
	 * Returns the movie with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the movie
	 * @return the movie
	 * @throws com.liferay.portal.NoSuchModelException if a movie with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Movie findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the movie with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException} if it could not be found.
	 *
	 * @param id the primary key of the movie
	 * @return the movie
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException if a movie with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Movie findByPrimaryKey(long id)
		throws NoSuchMovieException, SystemException {
		Movie movie = fetchByPrimaryKey(id);

		if (movie == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchMovieException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return movie;
	}

	/**
	 * Returns the movie with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the movie
	 * @return the movie, or <code>null</code> if a movie with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Movie fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the movie with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the movie
	 * @return the movie, or <code>null</code> if a movie with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Movie fetchByPrimaryKey(long id) throws SystemException {
		Movie movie = (Movie)EntityCacheUtil.getResult(MovieModelImpl.ENTITY_CACHE_ENABLED,
				MovieImpl.class, id);

		if (movie == _nullMovie) {
			return null;
		}

		if (movie == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				movie = (Movie)session.get(MovieImpl.class, Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (movie != null) {
					cacheResult(movie);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(MovieModelImpl.ENTITY_CACHE_ENABLED,
						MovieImpl.class, id, _nullMovie);
				}

				closeSession(session);
			}
		}

		return movie;
	}

	/**
	 * Returns all the movies.
	 *
	 * @return the movies
	 * @throws SystemException if a system exception occurred
	 */
	public List<Movie> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Movie> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Movie> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Movie> list = (List<Movie>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MOVIE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MOVIE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Movie>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Movie>)QueryUtil.list(q, getDialect(), start,
							end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the movies from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Movie movie : findAll()) {
			remove(movie);
		}
	}

	/**
	 * Returns the number of movies.
	 *
	 * @return the number of movies
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MOVIE);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the movie persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.lftechnology.ticketbookingsystem.admin.model.Movie")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Movie>> listenersList = new ArrayList<ModelListener<Movie>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Movie>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(MovieImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = HallPersistence.class)
	protected HallPersistence hallPersistence;
	@BeanReference(type = MoviePersistence.class)
	protected MoviePersistence moviePersistence;
	@BeanReference(type = ShiftPersistence.class)
	protected ShiftPersistence shiftPersistence;
	@BeanReference(type = TicketPersistence.class)
	protected TicketPersistence ticketPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_MOVIE = "SELECT movie FROM Movie movie";
	private static final String _SQL_COUNT_MOVIE = "SELECT COUNT(movie) FROM Movie movie";
	private static final String _ORDER_BY_ENTITY_ALIAS = "movie.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Movie exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(MoviePersistenceImpl.class);
	private static Movie _nullMovie = new MovieImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Movie> toCacheModel() {
				return _nullMovieCacheModel;
			}
		};

	private static CacheModel<Movie> _nullMovieCacheModel = new CacheModel<Movie>() {
			public Movie toEntityModel() {
				return _nullMovie;
			}
		};
}