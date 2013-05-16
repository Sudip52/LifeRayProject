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

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Movie}.
 * </p>
 *
 * @author    sudipshrestha
 * @see       Movie
 * @generated
 */
public class MovieWrapper implements Movie, ModelWrapper<Movie> {
	public MovieWrapper(Movie movie) {
		_movie = movie;
	}

	public Class<?> getModelClass() {
		return Movie.class;
	}

	public String getModelClassName() {
		return Movie.class.getName();
	}

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

	/**
	* Returns the primary key of this movie.
	*
	* @return the primary key of this movie
	*/
	public long getPrimaryKey() {
		return _movie.getPrimaryKey();
	}

	/**
	* Sets the primary key of this movie.
	*
	* @param primaryKey the primary key of this movie
	*/
	public void setPrimaryKey(long primaryKey) {
		_movie.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this movie.
	*
	* @return the ID of this movie
	*/
	public long getId() {
		return _movie.getId();
	}

	/**
	* Sets the ID of this movie.
	*
	* @param id the ID of this movie
	*/
	public void setId(long id) {
		_movie.setId(id);
	}

	/**
	* Returns the moviename of this movie.
	*
	* @return the moviename of this movie
	*/
	public java.lang.String getMoviename() {
		return _movie.getMoviename();
	}

	/**
	* Sets the moviename of this movie.
	*
	* @param moviename the moviename of this movie
	*/
	public void setMoviename(java.lang.String moviename) {
		_movie.setMoviename(moviename);
	}

	/**
	* Returns the directorname of this movie.
	*
	* @return the directorname of this movie
	*/
	public java.lang.String getDirectorname() {
		return _movie.getDirectorname();
	}

	/**
	* Sets the directorname of this movie.
	*
	* @param directorname the directorname of this movie
	*/
	public void setDirectorname(java.lang.String directorname) {
		_movie.setDirectorname(directorname);
	}

	/**
	* Returns the shift_id of this movie.
	*
	* @return the shift_id of this movie
	*/
	public long getShift_id() {
		return _movie.getShift_id();
	}

	/**
	* Sets the shift_id of this movie.
	*
	* @param shift_id the shift_id of this movie
	*/
	public void setShift_id(long shift_id) {
		_movie.setShift_id(shift_id);
	}

	/**
	* Returns the hall_id of this movie.
	*
	* @return the hall_id of this movie
	*/
	public long getHall_id() {
		return _movie.getHall_id();
	}

	/**
	* Sets the hall_id of this movie.
	*
	* @param hall_id the hall_id of this movie
	*/
	public void setHall_id(long hall_id) {
		_movie.setHall_id(hall_id);
	}

	/**
	* Returns the ticket_id of this movie.
	*
	* @return the ticket_id of this movie
	*/
	public long getTicket_id() {
		return _movie.getTicket_id();
	}

	/**
	* Sets the ticket_id of this movie.
	*
	* @param ticket_id the ticket_id of this movie
	*/
	public void setTicket_id(long ticket_id) {
		_movie.setTicket_id(ticket_id);
	}

	/**
	* Returns the company ID of this movie.
	*
	* @return the company ID of this movie
	*/
	public long getCompanyId() {
		return _movie.getCompanyId();
	}

	/**
	* Sets the company ID of this movie.
	*
	* @param companyId the company ID of this movie
	*/
	public void setCompanyId(long companyId) {
		_movie.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this movie.
	*
	* @return the group ID of this movie
	*/
	public long getGroupId() {
		return _movie.getGroupId();
	}

	/**
	* Sets the group ID of this movie.
	*
	* @param groupId the group ID of this movie
	*/
	public void setGroupId(long groupId) {
		_movie.setGroupId(groupId);
	}

	public boolean isNew() {
		return _movie.isNew();
	}

	public void setNew(boolean n) {
		_movie.setNew(n);
	}

	public boolean isCachedModel() {
		return _movie.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_movie.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _movie.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _movie.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_movie.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _movie.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_movie.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new MovieWrapper((Movie)_movie.clone());
	}

	public int compareTo(
		com.lftechnology.ticketbookingsystem.admin.model.Movie movie) {
		return _movie.compareTo(movie);
	}

	@Override
	public int hashCode() {
		return _movie.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lftechnology.ticketbookingsystem.admin.model.Movie> toCacheModel() {
		return _movie.toCacheModel();
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Movie toEscapedModel() {
		return new MovieWrapper(_movie.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _movie.toString();
	}

	public java.lang.String toXmlString() {
		return _movie.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_movie.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Movie getWrappedMovie() {
		return _movie;
	}

	public Movie getWrappedModel() {
		return _movie;
	}

	public void resetOriginalValues() {
		_movie.resetOriginalValues();
	}

	private Movie _movie;
}