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

package com.lftechnology.ticketbookingsystem.admin.model.impl;

import com.lftechnology.ticketbookingsystem.admin.model.Movie;
import com.lftechnology.ticketbookingsystem.admin.model.MovieModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Movie service. Represents a row in the &quot;ADMN_Movie&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lftechnology.ticketbookingsystem.admin.model.MovieModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MovieImpl}.
 * </p>
 *
 * @author sudipshrestha
 * @see MovieImpl
 * @see com.lftechnology.ticketbookingsystem.admin.model.Movie
 * @see com.lftechnology.ticketbookingsystem.admin.model.MovieModel
 * @generated
 */
public class MovieModelImpl extends BaseModelImpl<Movie> implements MovieModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a movie model instance should use the {@link com.lftechnology.ticketbookingsystem.admin.model.Movie} interface instead.
	 */
	public static final String TABLE_NAME = "ADMN_Movie";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "moviename", Types.VARCHAR },
			{ "directorname", Types.VARCHAR },
			{ "shift_id", Types.BIGINT },
			{ "hall_id", Types.BIGINT },
			{ "ticket_id", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table ADMN_Movie (id_ LONG not null primary key,moviename VARCHAR(75) null,directorname VARCHAR(75) null,shift_id LONG,hall_id LONG,ticket_id LONG,companyId LONG,groupId LONG)";
	public static final String TABLE_SQL_DROP = "drop table ADMN_Movie";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.lftechnology.ticketbookingsystem.admin.model.Movie"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.lftechnology.ticketbookingsystem.admin.model.Movie"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.lftechnology.ticketbookingsystem.admin.model.Movie"));

	public MovieModelImpl() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Movie.class;
	}

	public String getModelClassName() {
		return Movie.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("moviename", getMoviename());
		attributes.put("directorname", getDirectorname());
		attributes.put("shift_id", getShift_id());
		attributes.put("hall_id", getHall_id());
		attributes.put("ticket_id", getTicket_id());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String moviename = (String)attributes.get("moviename");

		if (moviename != null) {
			setMoviename(moviename);
		}

		String directorname = (String)attributes.get("directorname");

		if (directorname != null) {
			setDirectorname(directorname);
		}

		Long shift_id = (Long)attributes.get("shift_id");

		if (shift_id != null) {
			setShift_id(shift_id);
		}

		Long hall_id = (Long)attributes.get("hall_id");

		if (hall_id != null) {
			setHall_id(hall_id);
		}

		Long ticket_id = (Long)attributes.get("ticket_id");

		if (ticket_id != null) {
			setTicket_id(ticket_id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getMoviename() {
		if (_moviename == null) {
			return StringPool.BLANK;
		}
		else {
			return _moviename;
		}
	}

	public void setMoviename(String moviename) {
		_moviename = moviename;
	}

	public String getDirectorname() {
		if (_directorname == null) {
			return StringPool.BLANK;
		}
		else {
			return _directorname;
		}
	}

	public void setDirectorname(String directorname) {
		_directorname = directorname;
	}

	public long getShift_id() {
		return _shift_id;
	}

	public void setShift_id(long shift_id) {
		_shift_id = shift_id;
	}

	public long getHall_id() {
		return _hall_id;
	}

	public void setHall_id(long hall_id) {
		_hall_id = hall_id;
	}

	public long getTicket_id() {
		return _ticket_id;
	}

	public void setTicket_id(long ticket_id) {
		_ticket_id = ticket_id;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Movie.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Movie toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Movie)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		MovieImpl movieImpl = new MovieImpl();

		movieImpl.setId(getId());
		movieImpl.setMoviename(getMoviename());
		movieImpl.setDirectorname(getDirectorname());
		movieImpl.setShift_id(getShift_id());
		movieImpl.setHall_id(getHall_id());
		movieImpl.setTicket_id(getTicket_id());
		movieImpl.setCompanyId(getCompanyId());
		movieImpl.setGroupId(getGroupId());

		movieImpl.resetOriginalValues();

		return movieImpl;
	}

	public int compareTo(Movie movie) {
		long primaryKey = movie.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Movie movie = null;

		try {
			movie = (Movie)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = movie.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Movie> toCacheModel() {
		MovieCacheModel movieCacheModel = new MovieCacheModel();

		movieCacheModel.id = getId();

		movieCacheModel.moviename = getMoviename();

		String moviename = movieCacheModel.moviename;

		if ((moviename != null) && (moviename.length() == 0)) {
			movieCacheModel.moviename = null;
		}

		movieCacheModel.directorname = getDirectorname();

		String directorname = movieCacheModel.directorname;

		if ((directorname != null) && (directorname.length() == 0)) {
			movieCacheModel.directorname = null;
		}

		movieCacheModel.shift_id = getShift_id();

		movieCacheModel.hall_id = getHall_id();

		movieCacheModel.ticket_id = getTicket_id();

		movieCacheModel.companyId = getCompanyId();

		movieCacheModel.groupId = getGroupId();

		return movieCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", moviename=");
		sb.append(getMoviename());
		sb.append(", directorname=");
		sb.append(getDirectorname());
		sb.append(", shift_id=");
		sb.append(getShift_id());
		sb.append(", hall_id=");
		sb.append(getHall_id());
		sb.append(", ticket_id=");
		sb.append(getTicket_id());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.lftechnology.ticketbookingsystem.admin.model.Movie");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moviename</column-name><column-value><![CDATA[");
		sb.append(getMoviename());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>directorname</column-name><column-value><![CDATA[");
		sb.append(getDirectorname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shift_id</column-name><column-value><![CDATA[");
		sb.append(getShift_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hall_id</column-name><column-value><![CDATA[");
		sb.append(getHall_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ticket_id</column-name><column-value><![CDATA[");
		sb.append(getTicket_id());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Movie.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Movie.class
		};
	private long _id;
	private String _moviename;
	private String _directorname;
	private long _shift_id;
	private long _hall_id;
	private long _ticket_id;
	private long _companyId;
	private long _groupId;
	private Movie _escapedModelProxy;
}