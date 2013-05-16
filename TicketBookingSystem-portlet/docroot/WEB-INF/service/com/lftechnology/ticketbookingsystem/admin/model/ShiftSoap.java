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
public class ShiftSoap implements Serializable {
	public static ShiftSoap toSoapModel(Shift model) {
		ShiftSoap soapModel = new ShiftSoap();

		soapModel.setId(model.getId());
		soapModel.setShiftname(model.getShiftname());
		soapModel.setTime(model.getTime());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static ShiftSoap[] toSoapModels(Shift[] models) {
		ShiftSoap[] soapModels = new ShiftSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ShiftSoap[][] toSoapModels(Shift[][] models) {
		ShiftSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ShiftSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ShiftSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ShiftSoap[] toSoapModels(List<Shift> models) {
		List<ShiftSoap> soapModels = new ArrayList<ShiftSoap>(models.size());

		for (Shift model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ShiftSoap[soapModels.size()]);
	}

	public ShiftSoap() {
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

	public String getShiftname() {
		return _shiftname;
	}

	public void setShiftname(String shiftname) {
		_shiftname = shiftname;
	}

	public String getTime() {
		return _time;
	}

	public void setTime(String time) {
		_time = time;
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
	private String _shiftname;
	private String _time;
	private long _companyId;
	private long _groupId;
}