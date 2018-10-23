package com.loysupremo.joybank.dao.pendingregistration;

import java.util.List;

import javax.sql.DataSource;

import com.loysupremo.joybank.model.PendingRegistration;

public interface PendingRegistrationDao {
	
	public void setDataSource(DataSource dataSource);
	
	public Boolean save(PendingRegistration user, String type);
	
	public PendingRegistration getById(int id, String table);
	
	public boolean update(PendingRegistration user, String type);
	
	public boolean deleteById(int id);
		
	public List<PendingRegistration> getAllPending();
	
}