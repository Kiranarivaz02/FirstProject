package com.AbsInter;

abstract class Account
{

	protected int accountNumber;
	protected Customer customerObj;
	protected double balance;
	public   Account(int accountNumber,Customer customerObj,double balance)
	{
	    this.accountNumber=accountNumber;
	    this.customerObj=customerObj;
	    this.balance=balance;
	}
	    
	    
	    public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public Customer getCustomerObj() {
			return customerObj;
		}

		public void setCustomerObj(Customer customerObj) {
			this.customerObj = customerObj;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
	abstract boolean withdraw(double amount);
	
	
}


class SavingsAccount extends Account
{
	private double minimumBalance;
	
	public SavingsAccount(int accountNumber,Customer customerobj,double balance, double MinimumBalance)
	{
		 super(accountNumber,customerobj,balance);
		
		
		
	minimumBalance = MinimumBalance;
	}


	@Override
	boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		
		 if((balance-amount)>minimumBalance)
	       {
	           balance=(balance-amount);
	           return true;
	       }
	       else
	       return false;
}

}// end of savings accout class



class Customer
{
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	int customerId;
	String customerName;
	String emailId;
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", emailId=" + emailId + "]";
	}
	
	
}

 	
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer=new Customer();
		customer.setCustomerId(10001);
		customer.setCustomerName("Saranya");
		customer.setEmailId("saranya@gmail.com");
		
		
		Account ac=new SavingsAccount(9001, customer, 1000, 500);
		
		boolean result=ac.withdraw(2000);
		if(result==false)
		{
			System.out.println("failed");
		}
		else if(result==true)
		{
			System.out.println("Withdraw Success");
		}

	}

}