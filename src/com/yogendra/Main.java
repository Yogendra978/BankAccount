package com.yogendra;

import java.util.Scanner;

public class Main {
	//name,account,email,phone,balence
		//withdraw , deposite
	public static void main(String[] args) {
		Scanner scner = new Scanner(System.in);
		System.out.println("enter your information Banking information");
		System.out.println("enter bank of name");
		String bname = scner.next();
		System.out.println("enter your account No.");
	    int Account = scner.nextInt();
	    System.out.println("enter your full name");
	    String full_name = scner.next();
	    System.out.println("enter your email");
	    String email = scner.next();
	    System.out.println("enter your mobile");
	    int mobile = scner.nextInt();
	   
		
		
		Account yogendraAccount = new Account( bname,Account, 0.0, full_name, email,  mobile);//bname(bankOfName), number,  balence,  name,  email,  phoneNumber

	
		
		Scanner scc = new Scanner(System.in);
		boolean go = true;
		while(go) {
			System.out.println("Choose Select options");
			System.out.println("press 1: Deposite money");
			System.out.println("press 2: withdraw money");
			System.out.println("press 3: check balence");
			System.out.println("press 4: check user information");
			System.out.println("press Any key: exit");
			
				try {
					int input = scc.nextInt();
						switch (input) {
				case 1:System.out.println("Deposite money");
						double add = scc.nextDouble();	
						yogendraAccount.DepositMoney(add);
					break;
				case 2:System.out.println("Withdrow money");
						double lose = scc.nextDouble();
						yogendraAccount.WithdralMoney(lose);
					break;
					
				case 3 : System.out.print("your is Balence ");
					
						yogendraAccount.checkBalence();
					break;
				case 4 :
					System.out.println("user information");
					yogendraAccount.userInformation();
					break;
				default:System.out.println("exit , close info");
					
					break;
				}
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("you are exit,please right input now");
				go = false;
				scc.close();
			}
		
		}
	}
}
