package com.loysupremo.joybank.dao.creditcard;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.loysupremo.joybank.dao.customer.CustomerAccountsDAO;
import com.loysupremo.joybank.dao.customer.CustomerDAO;
import com.loysupremo.joybank.dao.transaction.TransferDAO;

public class CustomerDAOHelper {
	
	private static ClassPathXmlApplicationContext getApplicationContext() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc/config/DaoDetails.xml");
		return ctx;
	}
	
	public static CreditCardDOA creditCardDAO () {
		CreditCardDOA doa = getApplicationContext().getBean("creditCardDOA", CreditCardDOA.class);
		return doa;
	} 
	
	public static CustomerDAO customerDAO () {
		
		return getApplicationContext().getBean("customerDAO", CustomerDAO.class);
	}
	
	public static CustomerAccountsDAO customerAccountsDAO () {
		
		return getApplicationContext().getBean("CustomerAccountsDAO", CustomerAccountsDAO.class);
	}

	public static TransferDAO transferDAO () {
		return getApplicationContext().getBean("transferDAO", TransferDAO.class);
	}

}
