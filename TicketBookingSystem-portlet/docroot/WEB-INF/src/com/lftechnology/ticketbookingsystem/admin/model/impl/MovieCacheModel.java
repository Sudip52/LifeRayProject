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

import com.lftechnology.ticketbookingsystem.admin.model.Movie;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Movie in entity cache.
 *
 * @author sudipshrestha
 * @see Movie
 * @generated
 */
public class MovieCacheModel implements CacheModel<Movie>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", moviename=");
		sb.append(moviename);
		sb.append(", directorname=");
		sb.append(directorname);
		sb.append(", shift_id=");
		sb.append(shift_id);
		sb.append(", hall_id=");
		sb.append(hall_id);
		sb.append(", ticket_id=");
		sb.append(ticket_id);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append("}");

		return sb.toString();
	}

	public Movie toEntityModel() {
		MovieImpl movieImpl = new MovieImpl();

		movieImpl.setId(id);

		if (moviename == null) {
			movieImpl.setMoviename(StringPool.BLANK);
		}
		else {
			movieImpl.setMoviename(moviename);
		}

		if (directorname == null) {
			movieImpl.setDirectorname(StringPool.BLANK);
		}
		else {
			movieImpl.setDirectorname(directorname);
		}

		movieImpl.setShift_id(shift_id);
		movieImpl.setHall_id(hall_id);
		movieImpl.setTicket_id(ticket_id);
		movieImpl.setCompanyId(companyId);
		movieImpl.setGroupId(groupId);

		movieImpl.resetOriginalValues();

		return movieImpl;
	}

	public long id;
	public String moviename;
	public String directorname;
	public long shift_id;
	public long hall_id;
	public long ticket_id;
	public long companyId;
	public long groupId;
}