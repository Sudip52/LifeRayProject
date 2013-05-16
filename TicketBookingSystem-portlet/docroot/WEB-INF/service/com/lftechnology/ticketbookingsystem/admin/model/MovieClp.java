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

package com.lftechnology.ticketbookingsystem.admin.model;

import com.lftechnology.ticketbookingsystem.admin.service.MovieLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sudipshrestha
 */
public class MovieClp extends BaseModelImpl<Movie> implements Movie {
	public MovieClp() {
	}

	public Class<?> getModelClass() {
		return Movie.class;
	}

	public String getModelClassName() {
		return Movie.class.getName();
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
		return _moviename;
	}

	public void setMoviename(String moviename) {
		_moviename = moviename;
	}

	public String getDirectorname() {
		return _directorname;
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

	public BaseModel<?> getMovieRemoteModel() {
		return _movieRemoteModel;
	}

	public void setMovieRemoteModel(BaseModel<?> movieRemoteModel) {
		_movieRemoteModel = movieRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			MovieLocalServiceUtil.addMovie(this);
		}
		else {
			MovieLocalServiceUtil.updateMovie(this);
		}
	}

	@Override
	public Movie toEscapedModel() {
		return (Movie)Proxy.newProxyInstance(Movie.class.getClassLoader(),
			new Class[] { Movie.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		MovieClp clone = new MovieClp();

		clone.setId(getId());
		clone.setMoviename(getMoviename());
		clone.setDirectorname(getDirectorname());
		clone.setShift_id(getShift_id());
		clone.setHall_id(getHall_id());
		clone.setTicket_id(getTicket_id());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());

		return clone;
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

		MovieClp movie = null;

		try {
			movie = (MovieClp)obj;
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

	private long _id;
	private String _moviename;
	private String _directorname;
	private long _shift_id;
	private long _hall_id;
	private long _ticket_id;
	private long _companyId;
	private long _groupId;
	private BaseModel<?> _movieRemoteModel;
}