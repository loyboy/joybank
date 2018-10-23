package com.loysupremo.joybank.dao.transaction;


import java.util.List;

import javax.sql.DataSource;

import com.loysupremo.joybank.model.Transaction;

public interface TransactionDao {
    
	public void setDataSource(DataSource dataSource);
	
	public Boolean save(Transaction transaction, String type);
	
	public List<Transaction> getById(int id,String table);
	
	public void update(Transaction employer);
	
	public boolean deleteById(int id,String type);

}
