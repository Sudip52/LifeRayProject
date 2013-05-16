create table ADMN_Hall (
	id_ LONG not null primary key,
	hallname VARCHAR(75) null,
	contact_no VARCHAR(75) null,
	companyId LONG,
	groupId LONG
);

create table ADMN_Movie (
	id_ LONG not null primary key,
	moviename VARCHAR(75) null,
	directorname VARCHAR(75) null,
	shift_id LONG,
	hall_id LONG,
	ticket_id LONG,
	companyId LONG,
	groupId LONG
);

create table ADMN_Shift (
	id_ LONG not null primary key,
	shiftname VARCHAR(75) null,
	time_ VARCHAR(75) null,
	companyId LONG,
	groupId LONG
);

create table ADMN_Ticket (
	id_ LONG not null primary key,
	ticketname VARCHAR(75) null,
	price LONG,
	companyId LONG,
	groupId LONG
);