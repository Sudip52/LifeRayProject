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

import com.lftechnology.ticketbookingsystem.admin.service.ShiftLocalServiceUtil;

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
public class ShiftClp extends BaseModelImpl<Shift> implements Shift {
	public ShiftClp() {
	}

	public Class<?> getModelClass() {
		return Shift.class;
	}

	public String getModelClassName() {
		return Shift.class.getName();
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
		attributes.put("shiftname", getShiftname());
		attributes.put("time", getTime());
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

		String shiftname = (String)attributes.get("shiftname");

		if (shiftname != null) {
			setShiftname(shiftname);
		}

		String time = (String)attributes.get("time");

		if (time != null) {
			setTime(time);
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

	public BaseModel<?> getShiftRemoteModel() {
		return _shiftRemoteModel;
	}

	public void setShiftRemoteModel(BaseModel<?> shiftRemoteModel) {
		_shiftRemoteModel = shiftRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ShiftLocalServiceUtil.addShift(this);
		}
		else {
			ShiftLocalServiceUtil.updateShift(this);
		}
	}

	@Override
	public Shift toEscapedModel() {
		return (Shift)Proxy.newProxyInstance(Shift.class.getClassLoader(),
			new Class[] { Shift.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ShiftClp clone = new ShiftClp();

		clone.setId(getId());
		clone.setShiftname(getShiftname());
		clone.setTime(getTime());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());

		return clone;
	}

	public int compareTo(Shift shift) {
		long primaryKey = shift.getPrimaryKey();

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

		ShiftClp shift = null;

		try {
			shift = (ShiftClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = shift.getPrimaryKey();

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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", shiftname=");
		sb.append(getShiftname());
		sb.append(", time=");
		sb.append(getTime());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.lftechnology.ticketbookingsystem.admin.model.Shift");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>shiftname</column-name><column-value><![CDATA[");
		sb.append(getShiftname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>time</column-name><column-value><![CDATA[");
		sb.append(getTime());
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
	private String _shiftname;
	private String _time;
	private long _companyId;
	private long _groupId;
	private BaseModel<?> _shiftRemoteModel;
}