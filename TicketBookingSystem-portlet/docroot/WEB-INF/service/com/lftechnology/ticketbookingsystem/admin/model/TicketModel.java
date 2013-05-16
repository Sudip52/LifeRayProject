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
 * The base model interface for the Ticket service. Represents a row in the &quot;ADMN_Ticket&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lftechnology.ticketbookingsystem.admin.model.impl.TicketModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lftechnology.ticketbookingsystem.admin.model.impl.TicketImpl}.
 * </p>
 *
 * @author sudipshrestha
 * @see Ticket
 * @see com.lftechnology.ticketbookingsystem.admin.model.impl.TicketImpl
 * @see com.lftechnology.ticketbookingsystem.admin.model.impl.TicketModelImpl
 * @generated
 */
public interface TicketModel extends BaseModel<Ticket> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ticket model instance should use the {@link Ticket} interface instead.
	 */

	/**
	 * Returns the primary key of this ticket.
	 *
	 * @return the primary key of this ticket
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ticket.
	 *
	 * @param primaryKey the primary key of this ticket
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this ticket.
	 *
	 * @return the ID of this ticket
	 */
	public long getId();

	/**
	 * Sets the ID of this ticket.
	 *
	 * @param id the ID of this ticket
	 */
	public void setId(long id);

	/**
	 * Returns the ticketname of this ticket.
	 *
	 * @return the ticketname of this ticket
	 */
	@AutoEscape
	public String getTicketname();

	/**
	 * Sets the ticketname of this ticket.
	 *
	 * @param ticketname the ticketname of this ticket
	 */
	public void setTicketname(String ticketname);

	/**
	 * Returns the price of this ticket.
	 *
	 * @return the price of this ticket
	 */
	public long getPrice();

	/**
	 * Sets the price of this ticket.
	 *
	 * @param price the price of this ticket
	 */
	public void setPrice(long price);

	/**
	 * Returns the company ID of this ticket.
	 *
	 * @return the company ID of this ticket
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this ticket.
	 *
	 * @param companyId the company ID of this ticket
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this ticket.
	 *
	 * @return the group ID of this ticket
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this ticket.
	 *
	 * @param groupId the group ID of this ticket
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

	public int compareTo(Ticket ticket);

	public int hashCode();

	public CacheModel<Ticket> toCacheModel();

	public Ticket toEscapedModel();

	public String toString();

	public String toXmlString();
}