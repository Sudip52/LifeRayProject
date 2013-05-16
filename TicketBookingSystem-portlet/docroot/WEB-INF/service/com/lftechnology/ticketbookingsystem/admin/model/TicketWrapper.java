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
 * This class is a wrapper for {@link Ticket}.
 * </p>
 *
 * @author    sudipshrestha
 * @see       Ticket
 * @generated
 */
public class TicketWrapper implements Ticket, ModelWrapper<Ticket> {
	public TicketWrapper(Ticket ticket) {
		_ticket = ticket;
	}

	public Class<?> getModelClass() {
		return Ticket.class;
	}

	public String getModelClassName() {
		return Ticket.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ticketname", getTicketname());
		attributes.put("price", getPrice());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String ticketname = (String)attributes.get("ticketname");

		if (ticketname != null) {
			setTicketname(ticketname);
		}

		Long price = (Long)attributes.get("price");

		if (price != null) {
			setPrice(price);
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
	* Returns the primary key of this ticket.
	*
	* @return the primary key of this ticket
	*/
	public long getPrimaryKey() {
		return _ticket.getPrimaryKey();
	}

	/**
	* Sets the primary key of this ticket.
	*
	* @param primaryKey the primary key of this ticket
	*/
	public void setPrimaryKey(long primaryKey) {
		_ticket.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this ticket.
	*
	* @return the ID of this ticket
	*/
	public long getId() {
		return _ticket.getId();
	}

	/**
	* Sets the ID of this ticket.
	*
	* @param id the ID of this ticket
	*/
	public void setId(long id) {
		_ticket.setId(id);
	}

	/**
	* Returns the ticketname of this ticket.
	*
	* @return the ticketname of this ticket
	*/
	public java.lang.String getTicketname() {
		return _ticket.getTicketname();
	}

	/**
	* Sets the ticketname of this ticket.
	*
	* @param ticketname the ticketname of this ticket
	*/
	public void setTicketname(java.lang.String ticketname) {
		_ticket.setTicketname(ticketname);
	}

	/**
	* Returns the price of this ticket.
	*
	* @return the price of this ticket
	*/
	public long getPrice() {
		return _ticket.getPrice();
	}

	/**
	* Sets the price of this ticket.
	*
	* @param price the price of this ticket
	*/
	public void setPrice(long price) {
		_ticket.setPrice(price);
	}

	/**
	* Returns the company ID of this ticket.
	*
	* @return the company ID of this ticket
	*/
	public long getCompanyId() {
		return _ticket.getCompanyId();
	}

	/**
	* Sets the company ID of this ticket.
	*
	* @param companyId the company ID of this ticket
	*/
	public void setCompanyId(long companyId) {
		_ticket.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this ticket.
	*
	* @return the group ID of this ticket
	*/
	public long getGroupId() {
		return _ticket.getGroupId();
	}

	/**
	* Sets the group ID of this ticket.
	*
	* @param groupId the group ID of this ticket
	*/
	public void setGroupId(long groupId) {
		_ticket.setGroupId(groupId);
	}

	public boolean isNew() {
		return _ticket.isNew();
	}

	public void setNew(boolean n) {
		_ticket.setNew(n);
	}

	public boolean isCachedModel() {
		return _ticket.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_ticket.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _ticket.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _ticket.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_ticket.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _ticket.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_ticket.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TicketWrapper((Ticket)_ticket.clone());
	}

	public int compareTo(
		com.lftechnology.ticketbookingsystem.admin.model.Ticket ticket) {
		return _ticket.compareTo(ticket);
	}

	@Override
	public int hashCode() {
		return _ticket.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lftechnology.ticketbookingsystem.admin.model.Ticket> toCacheModel() {
		return _ticket.toCacheModel();
	}

	public com.lftechnology.ticketbookingsystem.admin.model.Ticket toEscapedModel() {
		return new TicketWrapper(_ticket.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _ticket.toString();
	}

	public java.lang.String toXmlString() {
		return _ticket.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_ticket.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Ticket getWrappedTicket() {
		return _ticket;
	}

	public Ticket getWrappedModel() {
		return _ticket;
	}

	public void resetOriginalValues() {
		_ticket.resetOriginalValues();
	}

	private Ticket _ticket;
}