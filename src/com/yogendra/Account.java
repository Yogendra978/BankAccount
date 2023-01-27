package com.yogendra;

public class Account {
	private String Bname;
	private int Number;
	private double Balence;
	private String Name;
	private String Email; 
	private int PhoneNumber;
	
	
	
	public Account(String bname, int number, double balence, String name, String email, int phoneNumber) {
		super();
		Bname = bname;
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
		System.out.println("Bank of Name :"+Bname);
		System.out.println("Name :"+Name);
		System.out.println("Email:"+Email);
		System.out.println("Acc No:"+Number);
		System.out.println("Mobile No."+PhoneNumber+"\n");
		
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
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
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
	public int getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	
	
	
	
	
}
