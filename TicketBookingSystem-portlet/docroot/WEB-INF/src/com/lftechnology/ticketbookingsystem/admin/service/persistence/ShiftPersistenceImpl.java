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

import com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException;
import com.lftechnology.ticketbookingsystem.admin.model.Shift;
import com.lftechnology.ticketbookingsystem.admin.model.impl.ShiftImpl;
import com.lftechnology.ticketbookingsystem.admin.model.impl.ShiftModelImpl;

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
 * The persistence implementation for the shift service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author sudipshrestha
 * @see ShiftPersistence
 * @see ShiftUtil
 * @generated
 */
public class ShiftPersistenceImpl extends BasePersistenceImpl<Shift>
	implements ShiftPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ShiftUtil} to access the shift persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ShiftImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ShiftModelImpl.ENTITY_CACHE_ENABLED,
			ShiftModelImpl.FINDER_CACHE_ENABLED, ShiftImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ShiftModelImpl.ENTITY_CACHE_ENABLED,
			ShiftModelImpl.FINDER_CACHE_ENABLED, ShiftImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ShiftModelImpl.ENTITY_CACHE_ENABLED,
			ShiftModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the shift in the entity cache if it is enabled.
	 *
	 * @param shift the shift
	 */
	public void cacheResult(Shift shift) {
		EntityCacheUtil.putResult(ShiftModelImpl.ENTITY_CACHE_ENABLED,
			ShiftImpl.class, shift.getPrimaryKey(), shift);

		shift.resetOriginalValues();
	}

	/**
	 * Caches the shifts in the entity cache if it is enabled.
	 *
	 * @param shifts the shifts
	 */
	public void cacheResult(List<Shift> shifts) {
		for (Shift shift : shifts) {
			if (EntityCacheUtil.getResult(ShiftModelImpl.ENTITY_CACHE_ENABLED,
						ShiftImpl.class, shift.getPrimaryKey()) == null) {
				cacheResult(shift);
			}
			else {
				shift.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all shifts.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ShiftImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ShiftImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the shift.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Shift shift) {
		EntityCacheUtil.removeResult(ShiftModelImpl.ENTITY_CACHE_ENABLED,
			ShiftImpl.class, shift.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Shift> shifts) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Shift shift : shifts) {
			EntityCacheUtil.removeResult(ShiftModelImpl.ENTITY_CACHE_ENABLED,
				ShiftImpl.class, shift.getPrimaryKey());
		}
	}

	/**
	 * Creates a new shift with the primary key. Does not add the shift to the database.
	 *
	 * @param id the primary key for the new shift
	 * @return the new shift
	 */
	public Shift create(long id) {
		Shift shift = new ShiftImpl();

		shift.setNew(true);
		shift.setPrimaryKey(id);

		return shift;
	}

	/**
	 * Removes the shift with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the shift
	 * @return the shift that was removed
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException if a shift with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Shift remove(long id) throws NoSuchShiftException, SystemException {
		return remove(Long.valueOf(id));
	}

	/**
	 * Removes the shift with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shift
	 * @return the shift that was removed
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException if a shift with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shift remove(Serializable primaryKey)
		throws NoSuchShiftException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Shift shift = (Shift)session.get(ShiftImpl.class, primaryKey);

			if (shift == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchShiftException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(shift);
		}
		catch (NoSuchShiftException nsee) {
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
	protected Shift removeImpl(Shift shift) throws SystemException {
		shift = toUnwrappedModel(shift);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, shift);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(shift);

		return shift;
	}

	@Override
	public Shift updateImpl(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift,
		boolean merge) throws SystemException {
		shift = toUnwrappedModel(shift);

		boolean isNew = shift.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, shift, merge);

			shift.setNew(false);
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

		EntityCacheUtil.putResult(ShiftModelImpl.ENTITY_CACHE_ENABLED,
			ShiftImpl.class, shift.getPrimaryKey(), shift);

		return shift;
	}

	protected Shift toUnwrappedModel(Shift shift) {
		if (shift instanceof ShiftImpl) {
			return shift;
		}

		ShiftImpl shiftImpl = new ShiftImpl();

		shiftImpl.setNew(shift.isNew());
		shiftImpl.setPrimaryKey(shift.getPrimaryKey());

		shiftImpl.setId(shift.getId());
		shiftImpl.setShiftname(shift.getShiftname());
		shiftImpl.setTime(shift.getTime());
		shiftImpl.setCompanyId(shift.getCompanyId());
		shiftImpl.setGroupId(shift.getGroupId());

		return shiftImpl;
	}

	/**
	 * Returns the shift with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the shift
	 * @return the shift
	 * @throws com.liferay.portal.NoSuchModelException if a shift with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shift findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the shift with the primary key or throws a {@link com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException} if it could not be found.
	 *
	 * @param id the primary key of the shift
	 * @return the shift
	 * @throws com.lftechnology.ticketbookingsystem.admin.NoSuchShiftException if a shift with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Shift findByPrimaryKey(long id)
		throws NoSuchShiftException, SystemException {
		Shift shift = fetchByPrimaryKey(id);

		if (shift == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
			}

			throw new NoSuchShiftException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				id);
		}

		return shift;
	}

	/**
	 * Returns the shift with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shift
	 * @return the shift, or <code>null</code> if a shift with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Shift fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the shift with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the shift
	 * @return the shift, or <code>null</code> if a shift with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Shift fetchByPrimaryKey(long id) throws SystemException {
		Shift shift = (Shift)EntityCacheUtil.getResult(ShiftModelImpl.ENTITY_CACHE_ENABLED,
				ShiftImpl.class, id);

		if (shift == _nullShift) {
			return null;
		}

		if (shift == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				shift = (Shift)session.get(ShiftImpl.class, Long.valueOf(id));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (shift != null) {
					cacheResult(shift);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(ShiftModelImpl.ENTITY_CACHE_ENABLED,
						ShiftImpl.class, id, _nullShift);
				}

				closeSession(session);
			}
		}

		return shift;
	}

	/**
	 * Returns all the shifts.
	 *
	 * @return the shifts
	 * @throws SystemException if a system exception occurred
	 */
	public List<Shift> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Shift> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	public List<Shift> findAll(int start, int end,
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

		List<Shift> list = (List<Shift>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_SHIFT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SHIFT;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Shift>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Shift>)QueryUtil.list(q, getDialect(), start,
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
	 * Removes all the shifts from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Shift shift : findAll()) {
			remove(shift);
		}
	}

	/**
	 * Returns the number of shifts.
	 *
	 * @return the number of shifts
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SHIFT);

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
	 * Initializes the shift persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.lftechnology.ticketbookingsystem.admin.model.Shift")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Shift>> listenersList = new ArrayList<ModelListener<Shift>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Shift>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(ShiftImpl.class.getName());
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
	private static final String _SQL_SELECT_SHIFT = "SELECT shift FROM Shift shift";
	private static final String _SQL_COUNT_SHIFT = "SELECT COUNT(shift) FROM Shift shift";
	private static final String _ORDER_BY_ENTITY_ALIAS = "shift.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Shift exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ShiftPersistenceImpl.class);
	private static Shift _nullShift = new ShiftImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Shift> toCacheModel() {
				return _nullShiftCacheModel;
			}
		};

	private static CacheModel<Shift> _nullShiftCacheModel = new CacheModel<Shift>() {
			public Shift toEntityModel() {
				return _nullShift;
			}
		};
}