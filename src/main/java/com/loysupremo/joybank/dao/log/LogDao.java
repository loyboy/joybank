package com.loysupremo.joybank.dao.log;

import java.util.List;

import javax.sql.DataSource;

import com.loysupremo.joybank.model.DatabaseLog;

public interface LogDao {
	
	public void setDataSource(DataSource dataSource);
	
	public Boolean save(DatabaseLog log, String tablename);
	
	public List<DatabaseLog> getByUserId(int id, String tablename);

	List<DatabaseLog> getLogs(String type);
	
	
}
