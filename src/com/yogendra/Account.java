package com.yogendra;

public class Account {
	private String Number;
	private double Balence;
	private String Name;
	private String Email; 
	private String PhoneNumber;
	
	
	
	public Account(String number, double balence, String name, String email, String phoneNumber) {
		super();
		Number = number;
		Balence = balence;
		Name = name;
		Email = email;
		PhoneNumber = phoneNumber;
	}
	
	public  void checkBalence() {
		System.out.println(Balence);
	}
	
	public void userInformation() {
		System.out.println("Name :"+Name);
		System.out.println("Email:"+Email);
		System.out.println("Acc No:"+Number);
		
	}
	
	public void DepositMoney(double DepositMoney) {
		this.Balence+=DepositMoney;
		System.out.println("Deposite money successfull");
		System.out.println("your balence is "+this.Balence);
	}
	
	public void WithdralMoney(double WithdralMoney) {
		if(this.Balence-WithdralMoney <0) {
			System.out.println("Withdraw Unsuccessful only "+this.Balence +" is left ");
		}else {
			this.Balence-=WithdralMoney;
			System.out.println("Withrow successfull , Current Balence is "+this.Balence);
		}
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
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
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	
	
	
}
