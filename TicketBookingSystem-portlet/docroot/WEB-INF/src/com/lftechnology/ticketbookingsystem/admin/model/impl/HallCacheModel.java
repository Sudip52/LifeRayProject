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

import com.lftechnology.ticketbookingsystem.admin.model.Hall;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Hall in entity cache.
 *
 * @author sudipshrestha
 * @see Hall
 * @generated
 */
public class HallCacheModel implements CacheModel<Hall>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", hallname=");
		sb.append(hallname);
		sb.append(", contact_no=");
		sb.append(contact_no);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	public Hall toEntityModel() {
		HallImpl hallImpl = new HallImpl();

		hallImpl.setId(id);

		if (hallname == null) {
			hallImpl.setHallname(StringPool.BLANK);
		}
		else {
			hallImpl.setHallname(hallname);
		}

		if (contact_no == null) {
			hallImpl.setContact_no(StringPool.BLANK);
		}
		else {
			hallImpl.setContact_no(contact_no);
		}

		hallImpl.setCompanyId(companyId);
		hallImpl.setGroupId(groupId);

		hallImpl.resetOriginalValues();

		return hallImpl;
	}

	public long id;
	public String hallname;
	public String contact_no;
	public long companyId;
	public long groupId;
}