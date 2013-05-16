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

import com.lftechnology.ticketbookingsystem.admin.model.Ticket;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Ticket in entity cache.
 *
 * @author sudipshrestha
 * @see Ticket
 * @generated
 */
public class TicketCacheModel implements CacheModel<Ticket>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ticketname=");
		sb.append(ticketname);
		sb.append(", price=");
		sb.append(price);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	public Ticket toEntityModel() {
		TicketImpl ticketImpl = new TicketImpl();

		ticketImpl.setId(id);

		if (ticketname == null) {
			ticketImpl.setTicketname(StringPool.BLANK);
		}
		else {
			ticketImpl.setTicketname(ticketname);
		}

		ticketImpl.setPrice(price);
		ticketImpl.setCompanyId(companyId);
		ticketImpl.setGroupId(groupId);

		ticketImpl.resetOriginalValues();

		return ticketImpl;
	}

	public long id;
	public String ticketname;
	public long price;
	public long companyId;
	public long groupId;
}