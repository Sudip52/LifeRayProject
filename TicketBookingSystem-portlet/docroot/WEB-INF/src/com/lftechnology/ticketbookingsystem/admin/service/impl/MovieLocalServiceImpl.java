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

package com.lftechnology.ticketbookingsystem.admin.service.impl;




import java.util.List;

import com.lftechnology.ticketbookingsystem.admin.NoSuchMovieException;
import com.lftechnology.ticketbookingsystem.admin.model.Hall;
import com.lftechnology.ticketbookingsystem.admin.model.Movie;
import com.lftechnology.ticketbookingsystem.admin.model.Shift;
import com.lftechnology.ticketbookingsystem.admin.model.Ticket;
import com.lftechnology.ticketbookingsystem.admin.service.MovieLocalServiceUtil;
import com.lftechnology.ticketbookingsystem.admin.service.base.MovieLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the movie local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.ticketbookingsystem.admin.service.MovieLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author sudipshrestha
 * @see com.lftechnology.ticketbookingsystem.admin.service.base.MovieLocalServiceBaseImpl
 * @see com.lftechnology.ticketbookingsystem.admin.service.MovieLocalServiceUtil
 */

public class MovieLocalServiceImpl extends MovieLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lftechnology.ticketbookingsystem.admin.service.MovieLocalServiceUtil} to access the movie local service.
	 */
		public Movie addMovie(Movie movie) throws SystemException
		{
			Movie newMovie = null;
			
			newMovie = moviePersistence.create(counterLocalService.increment(Movie.class.getName()));
			
			newMovie.setMoviename(movie.getMoviename());
			newMovie.setDirectorname(movie.getDirectorname());
			newMovie.setShift_id(movie.getShift_id());
			newMovie.setHall_id(movie.getHall_id());
			newMovie.setTicket_id(movie.getTicket_id());
			
			newMovie.setCompanyId(movie.getCompanyId());
			newMovie.setGroupId(movie.getCompanyId());
			
			//commit changes to the DB
			newMovie = moviePersistence.update(newMovie, false);
			
			return newMovie;
		}
		
		@SuppressWarnings("null")
		public Movie update(Movie movie) throws PortalException
		{
			Movie newMovie = null;
			
			newMovie.setMoviename(movie.getMoviename());
			newMovie.setDirectorname(movie.getDirectorname());
			newMovie.setShift_id(movie.getShift_id());
			newMovie.setHall_id(movie.getHall_id());
			newMovie.setTicket_id(movie.getTicket_id());
			
			newMovie.setCompanyId(movie.getCompanyId());
			newMovie.setGroupId(movie.getCompanyId());
		
			try {
				moviePersistence.update(newMovie, true);
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return newMovie;
		}
		
		
		public Movie get(long id) throws SystemException
		{
			Movie movie = moviePersistence.fetchByPrimaryKey(id);
			return movie;
		}
		
		
		public List<Movie> fecthAll() throws SystemException
		{
			return  moviePersistence.findAll();
			
			
		}
		
		public Movie delete(long id) throws SystemException, PortalException
		{
			Movie movie = null;
			try {
				movie = moviePersistence.remove(id);
			} catch (NoSuchMovieException | SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return movie;			
		}
		
		

	
}