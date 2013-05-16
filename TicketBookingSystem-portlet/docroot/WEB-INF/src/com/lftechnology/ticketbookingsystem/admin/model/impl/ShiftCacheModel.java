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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Shift in entity cache.
 *
 * @author sudipshrestha
 * @see Shift
 * @generated
 */
public class ShiftCacheModel implements CacheModel<Shift>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", shiftname=");
		sb.append(shiftname);
		sb.append(", time=");
		sb.append(time);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	public Shift toEntityModel() {
		ShiftImpl shiftImpl = new ShiftImpl();

		shiftImpl.setId(id);

		if (shiftname == null) {
			shiftImpl.setShiftname(StringPool.BLANK);
		}
		else {
			shiftImpl.setShiftname(shiftname);
		}

		if (time == null) {
			shiftImpl.setTime(StringPool.BLANK);
		}
		else {
			shiftImpl.setTime(time);
		}

		shiftImpl.setCompanyId(companyId);
		shiftImpl.setGroupId(groupId);

		shiftImpl.resetOriginalValues();

		return shiftImpl;
	}

	public long id;
	public String shiftname;
	public String time;
	public long companyId;
	public long groupId;
}