package com.nt.main;

import java.util.Scanner;

public class ATM_PinValidationClass {

	public static void main(String[] args) {
		
		Scanner inputFromConsole = new Scanner(System.in);
		System.out.println("Enter your PIN number here :");
		int exactPinNumber = 4567;
		int tryAgain=0;
		
		int usersPinNumber =0;
		
//		int usersValidPinNumber =  inputFromConsole.nextInt();
//		while(usersValidPinNumber>4  ||  usersValidPinNumber<3)
//		{
//			System.out.println("enter valid pin number");
//			usersValidPinNumber =  inputFromConsole.nextInt();
//		}
//		if(usersValidPinNumber==4)
//		{
//		usersPinNumber =  usersValidPinNumber;
//		}
		
		
		
		while(usersPinNumber!=exactPinNumber && tryAgain<3)
		{
			System.out.println("You have entered wrong password, please enter Correct password");
			if(tryAgain==1)
			{
				System.out.println("2 attempt left");
			}
			if(tryAgain==2)
			{
				System.out.println("1 attempt left");
			}
			inputFromConsole.nextInt();
			
			tryAgain++;
		}
		if(usersPinNumber==exactPinNumber)
		{
			System.out.println("WelCome to Canara Bank ATM");
		}
		else if(tryAgain>=3)
		{
			System.out.println("sorry, you have tried more than 3 times");
			System.out.println("your account is blocked ");
		}
		
	}

}
