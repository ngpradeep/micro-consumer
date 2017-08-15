package com.my.study.microconsumer;


public class Customer {

	//private Long accountNumber;
	private String accountName;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public Customer(String accountName) {
		super();
		this.accountName = accountName;
	}
	
	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [accountName=" + accountName + "]";
	}
	
	
	//private Long balance;

	/*public Customer(Long accountNumber, String accountName, Long balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	public Customer() {
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public Long getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Accountdetail [accountNumber=" + accountNumber + ", accountName=" + accountName + ", Balance=" + balance
				+ "]";
	}*/

}
