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

import com.lftechnology.ticketbookingsystem.admin.NoSuchHallException;
import com.lftechnology.ticketbookingsystem.admin.model.Hall;
import com.lftechnology.ticketbookingsystem.admin.model.impl.HallImpl;
import com.lftechnology.ticketbookingsystem.admin.model.impl.HallModelImpl;

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
 * The persistence implementation for the hall service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see HallPersistence
 * @see HallUtil
 * @generated
 */
public class HallPersistenceImpl extends BasePersistenceImpl<Hall>
	implements HallPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link HallUtil} to access the hall persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = HallImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(HallModelImpl.ENTITY_CACHE_ENABLED,
			HallModelImpl.FINDER_CACHE_ENABLED, HallImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(HallModelImpl.ENTITY_CACHE_ENABLED,
			HallModelImpl.FINDER_CACHE_ENABLED, HallImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(HallModelImpl.ENTITY_CACHE_ENABLED,
			HallModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the hall in the entity cache if it is enabled.
	 *
	 * @param hall the hall
	 */
	public void cacheResult(Hall hall) {
		EntityCacheUtil.putResult(HallModelImpl.ENTITY_CACHE_ENABLED,
			HallImpl.class, hall.getPrimaryKey(), hall);

		hall.resetOriginalValues();
	}

	/**
	 * Caches the halls in the entity cache if it is enabled.
	 *
	 * @param halls the halls
	 */
	public void cacheResult(List<Hall> halls) {
		for (Hall hall : halls) {
			if (EntityCacheUtil.getResult(HallModelImpl.ENTITY_CACHE_ENABLED,
						HallImpl.class, hall.getPrimaryKey()) == null) {
				cacheResult(hall);
			}
			else {
				hall.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all halls.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(HallImpl.class.getName());
		}

		EntityCacheUtil.clearCache(HallImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the hall.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Hall hall) {
		EntityCacheUtil.removeResult(HallModelImpl.ENTITY_CACHE_ENABLED,
			HallImpl.class, hall.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Hall> halls) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Hall hall : halls) {
			EntityCacheUtil.removeResult(HallModelImpl.ENTITY_CACHE_ENABLED,
				HallImpl.class, hall.getPrimaryKey());
		}
	}

	/**
	 * Creates a new hall with the primary key. Does not add the hall to the database.
	 *
	 * @param id the primary key for the new hall
	 * @return the new hall
	 */
	public Hall create(long id) {
		Hall hall = new HallImpl();

		hall.setNew(true);
		hall.setPrimaryKey(id);

		return hall;
	}

	/**
	 * Removes the hall with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the hall
	 * @return the hall that was removed
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchHallException if a hall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Hall remove(long id) throws NoSuchHallException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the hall with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hall
	 * @return the hall that was removed
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchHallException if a hall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Hall remove(Serializable primaryKey)
		throws NoSuchHallException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Hall hall = (Hall)session.get(HallImpl.class, primaryKey);

			if (hall == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHallException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(hall);
		}
		catch (NoSuchHallException nsee) {
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
	protected Hall removeImpl(Hall hall) throws SystemException {
		hall = toUnwrappedModel(hall);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, hall);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(hall);

		return hall;
	}

	@Override
	public Hall updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall,
		boolean merge) throws SystemException {
		hall = toUnwrappedModel(hall);

		boolean isNew = hall.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, hall, merge);

			hall.setNew(false);
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

		EntityCacheUtil.putResult(HallModelImpl.ENTITY_CACHE_ENABLED,
			HallImpl.class, hall.getPrimaryKey(), hall);

		return hall;
	}

	protected Hall toUnwrappedModel(Hall hall) {
		if (hall instanceof HallImpl) {
			return hall;
		}

		HallImpl hallImpl = new HallImpl();

		hallImpl.setNew(hall.isNew());
		hallImpl.setPrimaryKey(hall.getPrimaryKey());

		hallImpl.setId(hall.getId());
		hallImpl.setHallname(hall.getHallname());
		hallImpl.setContact_no(hall.getContact_no());
		hallImpl.setCompanyId(hall.getCompanyId());
		hallImpl.setGroupId(hall.getGroupId());

		return hallImpl;
	}

	/**
	 * Returns the hall with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the hall
	 * @return the hall
	 * @throws com.liferay.portal.NoSuchModelException if a hall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Hall findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the hall with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchHallException} if it could not be found.
	 *
	 * @param id the primary key of the hall
	 * @return the hall
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchHallException if a hall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Hall findByPrimaryKey(long id)
		throws NoSuchHallException, SystemException {
		Hall hall = fetchByPrimaryKey(id);

		if (hall == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchHallException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return hall;
	}

	/**
	 * Returns the hall with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hall
	 * @return the hall, or <code>null</code> if a hall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Hall fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the hall with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the hall
	 * @return the hall, or <code>null</code> if a hall with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Hall fetchByPrimaryKey(long id) throws SystemException {
		Hall hall = (Hall)EntityCacheUtil.getResult(HallModelImpl.ENTITY_CACHE_ENABLED,
				HallImpl.class, id);

		if (hall == _nullHall) {
			return null;
		}

		if (hall == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				hall = (Hall)session.get(HallImpl.class, Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (hall != null) {
					cacheResult(hall);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(HallModelImpl.ENTITY_CACHE_ENABLED,
						HallImpl.class, id, _nullHall);
				}

				closeSession(session);
			}
		}

		return hall;
	}

	/**
	 * Returns all the halls.
	 *
	 * @return the halls
	 * @throws SystemException if a system exception occurred
	 */
	public List<Hall> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Hall> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the halls.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of halls
	 * @param end the upper bound of the range of halls (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of halls
	 * @throws SystemException if a system exception occurred
	 */
	public List<Hall> findAll(int start, int end,
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

		List<Hall> list = (List<Hall>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_HALL);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_HALL;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Hall>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Hall>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the halls from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Hall hall : findAll()) {
			remove(hall);
		}
	}

	/**
	 * Returns the number of halls.
	 *
	 * @return the number of halls
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_HALL);

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
	 * Initializes the hall persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.lftechnology.ticketbookingsystem.admin.model.Hall")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Hall>> listenersList = new ArrayList<ModelListener<Hall>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Hall>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(HallImpl.class.getName());
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
	private static final String _SQL_SELECT_HALL = "SELECT hall FROM Hall hall";
	private static final String _SQL_COUNT_HALL = "SELECT COUNT(hall) FROM Hall hall";
	private static final String _ORDER_BY_ENTITY_ALIAS = "hall.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Hall exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(HallPersistenceImpl.class);
	private static Hall _nullHall = new HallImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Hall> toCacheModel() {
				return _nullHallCacheModel;
			}
		};

	private static CacheModel<Hall> _nullHallCacheModel = new CacheModel<Hall>() {
			public Hall toEntityModel() {
				return _nullHall;
			}
		};
}