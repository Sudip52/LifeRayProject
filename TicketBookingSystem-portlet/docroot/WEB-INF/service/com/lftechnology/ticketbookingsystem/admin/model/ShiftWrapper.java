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
 * This class is a wrapper for {@link Shift}.
 * </p>
 *
 * @author    sudipshrestha
 * @see       Shift
 * @generated
 */
public class ShiftWrapper implements Shift, ModelWrapper<Shift> {
	public ShiftWrapper(Shift shift) {
		_shift = shift;
	}

	public Class<?> getModelClass() {
		return Shift.class;
	}

	public String getModelClassName() {
		return Shift.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("shiftname", getShiftname());
		attributes.put("time", getTime());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

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

	/**
	* Returns the primary key of this shift.
	*
	* @return the primary key of this shift
	*/
	public long getPrimaryKey() {
		return _shift.getPrimaryKey();
	}

	/**
	* Sets the primary key of this shift.
	*
	* @param primaryKey the primary key of this shift
	*/
	public void setPrimaryKey(long primaryKey) {
		_shift.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this shift.
	*
	* @return the ID of this shift
	*/
	public long getId() {
		return _shift.getId();
	}

	/**
	* Sets the ID of this shift.
	*
	* @param id the ID of this shift
	*/
	public void setId(long id) {
		_shift.setId(id);
	}

	/**
	* Returns the shiftname of this shift.
	*
	* @return the shiftname of this shift
	*/
	public java.lang.String getShiftname() {
		return _shift.getShiftname();
	}

	/**
	* Sets the shiftname of this shift.
	*
	* @param shiftname the shiftname of this shift
	*/
	public void setShiftname(java.lang.String shiftname) {
		_shift.setShiftname(shiftname);
	}

	/**
	* Returns the time of this shift.
	*
	* @return the time of this shift
	*/
	public java.lang.String getTime() {
		return _shift.getTime();
	}

	/**
	* Sets the time of this shift.
	*
	* @param time the time of this shift
	*/
	public void setTime(java.lang.String time) {
		_shift.setTime(time);
	}

	/**
	* Returns the company ID of this shift.
	*
	* @return the company ID of this shift
	*/
	public long getCompanyId() {
		return _shift.getCompanyId();
	}

	/**
	* Sets the company ID of this shift.
	*
	* @param companyId the company ID of this shift
	*/
	public void setCompanyId(long companyId) {
		_shift.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this shift.
	*
	* @return the group ID of this shift
	*/
	public long getGroupId() {
		return _shift.getGroupId();
	}

	/**
	* Sets the group ID of this shift.
	*
	* @param groupId the group ID of this shift
	*/
	public void setGroupId(long groupId) {
		_shift.setGroupId(groupId);
	}

	public boolean isNew() {
		return _shift.isNew();
	}

	public void setNew(boolean n) {
		_shift.setNew(n);
	}

	public boolean isCachedModel() {
		return _shift.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_shift.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _shift.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _shift.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_shift.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _shift.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_shift.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ShiftWrapper((Shift)_shift.clone());
	}

	public int compareTo(
		com.lftechnology.ticketbookingsystem.admin.model.Shift shift) {
		return _shift.compareTo(shift);
	}

	@Override
	public int hashCode() {
		return _shift.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lftechnology.ticketbookingsystem.admin.model.Shift> toCacheModel() {
		return _shift.toCacheModel();
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Shift toEscapedModel() {
		return new ShiftWrapper(_shift.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _shift.toString();
	}

	public java.lang.String toXmlString() {
		return _shift.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_shift.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Shift getWrappedShift() {
		return _shift;
	}

	public Shift getWrappedModel() {
		return _shift;
	}

	public void resetOriginalValues() {
		_shift.resetOriginalValues();
	}

	private Shift _shift;
}