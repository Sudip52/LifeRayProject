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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Hall service. Represents a row in the &quot;AD_Hall&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lftechnology.ticketbookingsystem.admin.model.impl.HallModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lftechnology.ticketbookingsystem.admin.model.impl.HallImpl}.
 * </p>
 *
 * @author sudipshrestha
 * @see Hall
 * @see com.lftechnology.ticketbookingsystem.admin.model.impl.HallImpl
 * @see com.lftechnology.ticketbookingsystem.admin.model.impl.HallModelImpl
 * @generated
 */
public interface HallModel extends BaseModel<Hall> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a hall model instance should use the {@link Hall} interface instead.
	 */

	/**
	 * Returns the primary key of this hall.
	 *
	 * @return the primary key of this hall
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this hall.
	 *
	 * @param primaryKey the primary key of this hall
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this hall.
	 *
	 * @return the ID of this hall
	 */
	public long getId();

	/**
	 * Sets the ID of this hall.
	 *
	 * @param id the ID of this hall
	 */
	public void setId(long id);

	/**
	 * Returns the hallname of this hall.
	 *
	 * @return the hallname of this hall
	 */
	@AutoEscape
	public String getHallname();

	/**
	 * Sets the hallname of this hall.
	 *
	 * @param hallname the hallname of this hall
	 */
	public void setHallname(String hallname);

	/**
	 * Returns the contact_no of this hall.
	 *
	 * @return the contact_no of this hall
	 */
	@AutoEscape
	public String getContact_no();

	/**
	 * Sets the contact_no of this hall.
	 *
	 * @param contact_no the contact_no of this hall
	 */
	public void setContact_no(String contact_no);

	/**
	 * Returns the company ID of this hall.
	 *
	 * @return the company ID of this hall
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this hall.
	 *
	 * @param companyId the company ID of this hall
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this hall.
	 *
	 * @return the group ID of this hall
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this hall.
	 *
	 * @param groupId the group ID of this hall
	 */
	public void setGroupId(long groupId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Hall hall);

	public int hashCode();

	public CacheModel<Hall> toCacheModel();

	public Hall toEscapedModel();

	public String toString();

	public String toXmlString();
}