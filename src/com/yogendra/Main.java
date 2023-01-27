package com.yogendra;

import java.util.Scanner;

public class Main {
	//name,account,email,phone,balence
		//withdraw , deposite
	public static void main(String[] args) {
		Scanner scner = new Scanner(System.in);
		System.out.println("Enter Your Information Given Banking Deatils.");
		System.out.println("Enter Bank of Name");
		String bname = scner.next();
		System.out.println("Enter Your Account No.");
	    int Account = scner.nextInt();
	    System.out.println("Enter Your Full Name");
	    String full_name = scner.next();
	    System.out.println("Enter Your Email");
	    String email = scner.next();
	    System.out.println("Enter Your Mobile");
	    int mobile = scner.nextInt();
	    System.out.print("\n");
	   
		
		
		Account yogendraAccount = new Account( bname,Account, 0.0, full_name, email,  mobile);//bname(bankOfName), number,  balence,  name,  email,  phoneNumber

	
		
		Scanner scc = new Scanner(System.in);
		boolean go = true;
		while(go) {
			System.out.println("Choose Select options");
			System.out.println("press 1: Deposite Money");
			System.out.println("press 2: Withdraw Money");
			System.out.println("press 3: Check Balence");
			System.out.println("press 4: Check User Information");
			System.out.println("press Any key: exit");
			
			
			
			
				try {
					int input = scc.nextInt();
						switch (input) {
				case 1:System.out.println("Deposite Money");
						double add = scc.nextDouble();	
						yogendraAccount.DepositMoney(add);
					break;
				case 2:System.out.println("Withdrow Money");
						double lose = scc.nextDouble();
						yogendraAccount.WithdralMoney(lose);
					break;
					
				case 3 : System.out.print("Your is Balence ");
					
						yogendraAccount.checkBalence();
					break;
				case 4 :
					System.out.println("User Information");
					yogendraAccount.userInformation();
					break;
				default:System.out.println("exit , Close info");
					
					break;
				}
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("You Are Exit,Please Right Input Now");
				go = false;
				scc.close();
			}
		
		}
	}
}
