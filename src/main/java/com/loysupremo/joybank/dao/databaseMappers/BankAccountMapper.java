package com.loysupremo.joybank.dao.databaseMappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.loysupremo.joybank.model.BankAccountDB;

public class BankAccountMapper implements RowMapper<Object>{

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		BankAccountDB ba = new BankAccountDB();
		ba.setBalance(rs.getBigDecimal("balance"));
		ba.setHold(rs.getBigDecimal("hold"));
		return ba;
	}

}