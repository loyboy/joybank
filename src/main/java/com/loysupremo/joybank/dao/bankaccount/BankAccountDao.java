package com.loysupremo.joybank.dao.bankaccount;

import java.util.List;

import javax.sql.DataSource;

import com.loysupremo.joybank.model.BankAccountDB;
import com.loysupremo.joybank.model.CreditAccountDB;

public interface BankAccountDao {
	
	public void setDataSource(DataSource dataSource);
	
	public Boolean save(BankAccountDB bankDetails);
	
	public List<BankAccountDB> getAccountDetailsById(int userId);
}
