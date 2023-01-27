package com.yogendra;

public class Account {
	private String Bname;
	private int AccountNumber;
	private double Balence;
	private String Name;
	private String Email; 
	private int PhoneNumber;
	
	
	
	public Account(String bname, int number, double balence, String name, String email, int phoneNumber) {
		super();
		Bname = bname;
		AccountNumber = number;
		Balence = balence;
		Name = name;
		Email = email;
		PhoneNumber = phoneNumber;
	}
	
	
	
	public  void checkBalence() {
		System.out.println(Balence);
	}
	
	public void userInformation() {
		System.out.println("Bank of Name :"+Bname);
		System.out.println("Name :"+Name);
		System.out.println("Email:"+Email);
		System.out.println("Account No:"+AccountNumber);
		System.out.println("Mobile No."+PhoneNumber+"\n");
		
	}
	
	public void DepositMoney(double DepositMoney) {
		this.Balence+=DepositMoney;
		System.out.println("Deposite Money Successfull");
		System.out.println("Your Balence is "+this.Balence);
	}
	
	public void WithdralMoney(double WithdralMoney) {
		if(this.Balence-WithdralMoney <0) {
			System.out.println("Withdraw Unsuccessful Only "+this.Balence +" is left ");
		}else {
			this.Balence-=WithdralMoney;
			System.out.println("Withrow Successfull , Current Balence is "+this.Balence);
		}
	}
	
	
	public String getBname() {
		return Bname;
	}



	public void setBname(String bname) {
		Bname = bname;
	}



	public int getAccountNumber() {
		return AccountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
	}



	public int getNumber() {
		return AccountNumber;
	}
	public void setNumber(int number) {
		AccountNumber = number;
	}
	public double getBalence() {
		return Balence;
	}
	public void setBalence(double balence) {
		Balence = balence;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	
	
	
}
