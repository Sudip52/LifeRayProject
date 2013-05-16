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
public class HallSoap implements Serializable {
	public static HallSoap toSoapModel(Hall model) {
		HallSoap soapModel = new HallSoap();

		soapModel.setId(model.getId());
		soapModel.setHallname(model.getHallname());
		soapModel.setContact_no(model.getContact_no());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static HallSoap[] toSoapModels(Hall[] models) {
		HallSoap[] soapModels = new HallSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HallSoap[][] toSoapModels(Hall[][] models) {
		HallSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HallSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HallSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HallSoap[] toSoapModels(List<Hall> models) {
		List<HallSoap> soapModels = new ArrayList<HallSoap>(models.size());

		for (Hall model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HallSoap[soapModels.size()]);
	}

	public HallSoap() {
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

	public String getHallname() {
		return _hallname;
	}

	public void setHallname(String hallname) {
		_hallname = hallname;
	}

	public String getContact_no() {
		return _contact_no;
	}

	public void setContact_no(String contact_no) {
		_contact_no = contact_no;
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
	private String _hallname;
	private String _contact_no;
	private long _companyId;
	private long _groupId;
}