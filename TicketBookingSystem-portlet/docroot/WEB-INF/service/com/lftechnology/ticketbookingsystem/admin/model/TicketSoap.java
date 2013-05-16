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
public class TicketSoap implements Serializable {
	public static TicketSoap toSoapModel(Ticket model) {
		TicketSoap soapModel = new TicketSoap();

		soapModel.setId(model.getId());
		soapModel.setTicketname(model.getTicketname());
		soapModel.setPrice(model.getPrice());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setGroupId(model.getGroupId());

		return soapModel;
	}

	public static TicketSoap[] toSoapModels(Ticket[] models) {
		TicketSoap[] soapModels = new TicketSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TicketSoap[][] toSoapModels(Ticket[][] models) {
		TicketSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TicketSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TicketSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TicketSoap[] toSoapModels(List<Ticket> models) {
		List<TicketSoap> soapModels = new ArrayList<TicketSoap>(models.size());

		for (Ticket model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TicketSoap[soapModels.size()]);
	}

	public TicketSoap() {
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

	public String getTicketname() {
		return _ticketname;
	}

	public void setTicketname(String ticketname) {
		_ticketname = ticketname;
	}

	public long getPrice() {
		return _price;
	}

	public void setPrice(long price) {
		_price = price;
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
	private String _ticketname;
	private long _price;
	private long _companyId;
	private long _groupId;
}