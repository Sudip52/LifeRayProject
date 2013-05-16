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

import com.lftechnology.ticketbookingsystem.admin.service.HallLocalServiceUtil;

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
public class HallClp extends BaseModelImpl<Hall> implements Hall {
	public HallClp() {
	}

	public Class<?> getModelClass() {
		return Hall.class;
	}

	public String getModelClassName() {
		return Hall.class.getName();
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
		attributes.put("hallname", getHallname());
		attributes.put("contact_no", getContact_no());
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

		String hallname = (String)attributes.get("hallname");

		if (hallname != null) {
			setHallname(hallname);
		}

		String contact_no = (String)attributes.get("contact_no");

		if (contact_no != null) {
			setContact_no(contact_no);
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

	public BaseModel<?> getHallRemoteModel() {
		return _hallRemoteModel;
	}

	public void setHallRemoteModel(BaseModel<?> hallRemoteModel) {
		_hallRemoteModel = hallRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			HallLocalServiceUtil.addHall(this);
		}
		else {
			HallLocalServiceUtil.updateHall(this);
		}
	}

	@Override
	public Hall toEscapedModel() {
		return (Hall)Proxy.newProxyInstance(Hall.class.getClassLoader(),
			new Class[] { Hall.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		HallClp clone = new HallClp();

		clone.setId(getId());
		clone.setHallname(getHallname());
		clone.setContact_no(getContact_no());
		clone.setCompanyId(getCompanyId());
		clone.setGroupId(getGroupId());

		return clone;
	}

	public int compareTo(Hall hall) {
		long primaryKey = hall.getPrimaryKey();

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

		HallClp hall = null;

		try {
			hall = (HallClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hall.getPrimaryKey();

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
		sb.append(", hallname=");
		sb.append(getHallname());
		sb.append(", contact_no=");
		sb.append(getContact_no());
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
		sb.append("com.lftechnology.ticketbookingsystem.admin.model.Hall");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hallname</column-name><column-value><![CDATA[");
		sb.append(getHallname());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contact_no</column-name><column-value><![CDATA[");
		sb.append(getContact_no());
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
	private String _hallname;
	private String _contact_no;
	private long _companyId;
	private long _groupId;
	private BaseModel<?> _hallRemoteModel;
}