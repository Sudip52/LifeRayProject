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
 * This class is a wrapper for {@link Hall}.
 * </p>
 *
 * @author    sudipshrestha
 * @see       Hall
 * @generated
 */
public class HallWrapper implements Hall, ModelWrapper<Hall> {
	public HallWrapper(Hall hall) {
		_hall = hall;
	}

	public Class<?> getModelClass() {
		return Hall.class;
	}

	public String getModelClassName() {
		return Hall.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("hallname", getHallname());
		attributes.put("contact_no", getContact_no());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

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

	/**
	* Returns the primary key of this hall.
	*
	* @return the primary key of this hall
	*/
	public long getPrimaryKey() {
		return _hall.getPrimaryKey();
	}

	/**
	* Sets the primary key of this hall.
	*
	* @param primaryKey the primary key of this hall
	*/
	public void setPrimaryKey(long primaryKey) {
		_hall.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this hall.
	*
	* @return the ID of this hall
	*/
	public long getId() {
		return _hall.getId();
	}

	/**
	* Sets the ID of this hall.
	*
	* @param id the ID of this hall
	*/
	public void setId(long id) {
		_hall.setId(id);
	}

	/**
	* Returns the hallname of this hall.
	*
	* @return the hallname of this hall
	*/
	public java.lang.String getHallname() {
		return _hall.getHallname();
	}

	/**
	* Sets the hallname of this hall.
	*
	* @param hallname the hallname of this hall
	*/
	public void setHallname(java.lang.String hallname) {
		_hall.setHallname(hallname);
	}

	/**
	* Returns the contact_no of this hall.
	*
	* @return the contact_no of this hall
	*/
	public java.lang.String getContact_no() {
		return _hall.getContact_no();
	}

	/**
	* Sets the contact_no of this hall.
	*
	* @param contact_no the contact_no of this hall
	*/
	public void setContact_no(java.lang.String contact_no) {
		_hall.setContact_no(contact_no);
	}

	/**
	* Returns the company ID of this hall.
	*
	* @return the company ID of this hall
	*/
	public long getCompanyId() {
		return _hall.getCompanyId();
	}

	/**
	* Sets the company ID of this hall.
	*
	* @param companyId the company ID of this hall
	*/
	public void setCompanyId(long companyId) {
		_hall.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this hall.
	*
	* @return the group ID of this hall
	*/
	public long getGroupId() {
		return _hall.getGroupId();
	}

	/**
	* Sets the group ID of this hall.
	*
	* @param groupId the group ID of this hall
	*/
	public void setGroupId(long groupId) {
		_hall.setGroupId(groupId);
	}

	public boolean isNew() {
		return _hall.isNew();
	}

	public void setNew(boolean n) {
		_hall.setNew(n);
	}

	public boolean isCachedModel() {
		return _hall.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_hall.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _hall.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _hall.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_hall.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _hall.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_hall.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new HallWrapper((Hall)_hall.clone());
	}

	public int compareTo(
		com.lftechnology.ticketbookingsystem.admin.model.Hall hall) {
		return _hall.compareTo(hall);
	}

	@Override
	public int hashCode() {
		return _hall.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lftechnology.ticketbookingsystem.admin.model.Hall> toCacheModel() {
		return _hall.toCacheModel();
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Hall toEscapedModel() {
		return new HallWrapper(_hall.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _hall.toString();
	}

	public java.lang.String toXmlString() {
		return _hall.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_hall.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Hall getWrappedHall() {
		return _hall;
	}

	public Hall getWrappedModel() {
		return _hall;
	}

	public void resetOriginalValues() {
		_hall.resetOriginalValues();
	}

	private Hall _hall;
}