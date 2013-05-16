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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    sudipshrestha
 * @generated
 */
public class MovieSoap implements Serializable {
	public static MovieSoap toSoapModel(Movie model) {
		MovieSoap soapModel = new MovieSoap();

		soapModel.setId(model.getId());
		soapModel.setMoviename(model.getMoviename());
		soapModel.setDirectorname(model.getDirectorname());
		soapModel.setShift_id(model.getShift_id());
		soapModel.setHall_id(model.getHall_id());
		soapModel.setTicket_id(model.getTicket_id());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static MovieSoap[] toSoapModels(Movie[] models) {
		MovieSoap[] soapModels = new MovieSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MovieSoap[][] toSoapModels(Movie[][] models) {
		MovieSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MovieSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MovieSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MovieSoap[] toSoapModels(List<Movie> models) {
		List<MovieSoap> soapModels = new ArrayList<MovieSoap>(models.size());

		for (Movie model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MovieSoap[soapModels.size()]);
	}

	public MovieSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
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

	private long _id;
	private String _moviename;
	private String _directorname;
	private long _shift_id;
	private long _hall_id;
	private long _ticket_id;
	private long _companyId;
	private long _groupId;
}