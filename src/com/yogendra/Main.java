package com.yogendra;

import java.util.Scanner;

public class Main {
	//name,account,email,phone,balence
		//withdraw , deposite
	public static void main(String[] args) {
		Account yogendraAccount = new Account( "12345", 0.0, "yogendra", "yogendrasaini@gmailcom",  "8963060978");// number,  balence,  name,  email,  phoneNumber

	
		
		Scanner scc = new Scanner(System.in);
		boolean go = true;
		while(go) {
			System.out.println("press 1: Deposite money");
			System.out.println("press 2: withdraw money");
			System.out.println("press 3: check balence");
			System.out.println("press 4: check information");
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
