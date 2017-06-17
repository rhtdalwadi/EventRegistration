package com.rohit.framework;

import org.hibernate.SessionFactory;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionStatus;

public class HibernateTransactionManager extends org.springframework.orm.hibernate4.HibernateTransactionManager
{
	private static final long serialVersionUID = 1982785215965990955L;

	public HibernateTransactionManager() {
	}
	
	public HibernateTransactionManager(SessionFactory sessionFactory)
	{
		super(sessionFactory);
	}
	
	protected void doBegin(Object transaction, TransactionDefinition definition)
	{
		super.doBegin(transaction, definition);
	}
	
	protected void doCommit(DefaultTransactionStatus status)
	{
		super.doCommit(status);
	}
	
	protected void doRollback(DefaultTransactionStatus status) 
	{
		super.doRollback(status);
	}
}
