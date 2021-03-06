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

import com.lftechnology.ticketbookingsystem.admin.model.Shift;
import com.lftechnology.ticketbookingsystem.admin.model.ShiftModel;

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
 * The base model implementation for the Shift service. Represents a row in the &quot;AD_Shift&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.lftechnology.ticketbookingsystem.admin.model.ShiftModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ShiftImpl}.
 * </p>
 *
 * @author sudipshrestha
 * @see ShiftImpl
 * @see com.lftechnology.ticketbookingsystem.admin.model.Shift
 * @see com.lftechnology.ticketbookingsystem.admin.model.ShiftModel
 * @generated
 */
public class ShiftModelImpl extends BaseModelImpl<Shift> implements ShiftModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a shift model instance should use the {@link com.lftechnology.ticketbookingsystem.admin.model.Shift} interface instead.
	 */
	public static final String TABLE_NAME = "AD_Shift";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id_", Types.BIGINT },
			{ "shiftname", Types.VARCHAR },
			{ "time_", Types.VARCHAR },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table AD_Shift (id_ LONG not null primary key,shiftname VARCHAR(75) null,time_ VARCHAR(75) null,companyId LONG,groupId LONG)";
	public static final String TABLE_SQL_DROP = "drop table AD_Shift";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.lftechnology.ticketbookingsystem.admin.model.Shift"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.lftechnology.ticketbookingsystem.admin.model.Shift"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.lftechnology.ticketbookingsystem.admin.model.Shift"));

	public ShiftModelImpl() {
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
		return Shift.class;
	}

	public String getModelClassName() {
		return Shift.class.getName();
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
		if (_shiftname == null) {
			return StringPool.BLANK;
		}
		else {
			return _shiftname;
		}
	}

	public void setShiftname(String shiftname) {
		_shiftname = shiftname;
	}

	public String getTime() {
		if (_time == null) {
			return StringPool.BLANK;
		}
		else {
			return _time;
		}
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Shift.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Shift toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Shift)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		ShiftImpl shiftImpl = new ShiftImpl();

		shiftImpl.setId(getId());
		shiftImpl.setShiftname(getShiftname());
		shiftImpl.setTime(getTime());
		shiftImpl.setCompanyId(getCompanyId());
		shiftImpl.setGroupId(getGroupId());

		shiftImpl.resetOriginalValues();

		return shiftImpl;
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

		Shift shift = null;

		try {
			shift = (Shift)obj;
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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Shift> toCacheModel() {
		ShiftCacheModel shiftCacheModel = new ShiftCacheModel();

		shiftCacheModel.id = getId();

		shiftCacheModel.shiftname = getShiftname();

		String shiftname = shiftCacheModel.shiftname;

		if ((shiftname != null) && (shiftname.length() == 0)) {
			shiftCacheModel.shiftname = null;
		}

		shiftCacheModel.time = getTime();

		String time = shiftCacheModel.time;

		if ((time != null) && (time.length() == 0)) {
			shiftCacheModel.time = null;
		}

		shiftCacheModel.companyId = getCompanyId();

		shiftCacheModel.groupId = getGroupId();

		return shiftCacheModel;
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

	private static ClassLoader _classLoader = Shift.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Shift.class
		};
	private long _id;
	private String _shiftname;
	private String _time;
	private long _companyId;
	private long _groupId;
	private Shift _escapedModelProxy;
}