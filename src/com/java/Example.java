package com.java;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		    BankAccount obj1 =  new BankAccount("XYZ","BA0001");
		    obj1.showMenu();
			}
		}
		class BankAccount
		{
			int balance;
			int previousTransaction;
			String customerName;
			String customerId;
			BankAccount(String cname,String cid)
			{
				customerName=cname;
				customerId=cid;
			}
			void deposit(int amount)
			{
				if(amount !=0)
				{
					balance=balance+amount;
					previousTransaction=amount;
				}
			}
			
			void withdraw(int amount)
			{
				if(amount!=0)
				{
					balance=balance-amount;
					previousTransaction=-amount;
				}
			}
			
			void getPreviousTransaction()
			{
				if(previousTransaction>0)
				{
					System.out.println("Deposited: "+previousTransaction);
				}
				else if(previousTransaction<0)
				{
					System.out.println("Withdrawn: "+Math.abs(previousTransaction));
				}
				else
				{
					System.out.println("No transaction occured");
				}
			}
			void showMenu()
			{
				char option='\0';
				Scanner scanner=new Scanner(System.in);
				
				System.out.println("Welcome "+customerName);
				System.out.println("Your ID is "+customerId);
				System.out.println("\n");
				System.out.println("A. Check Balance");
				System.out.println("B. Deposit");
				System.out.println("C. Withdraw");
				System.out.println("D. Previous transaction");
				System.out.println("E. Exit");
			
			do
			{
				System.out.println("Enter an option");
				option = scanner.next().charAt(0);
				System.out.println("\n");
				
				switch (option)
				{
				case 'A':
					System.out.println("Balance="+balance);
					System.out.println("\n");
					break;
					
				case 'B':
					System.out.println("Enter an amount to deposit:");
					int amount =scanner.nextInt();
					deposit (amount);
					System.out.println("\n");
					break;
					
				case 'C':
					System.out.println("Enter an amount to withdraw:");
					int amount2 =scanner.nextInt();
					deposit (amount2);
					System.out.println("\n");
					break;
				
				case 'D' :
					getPreviousTransaction();
					System.out.println("\n");
					break;
					
				case 'E' :
					System.out.println("*********************************");
					break;
					
				default :
					System.out.println("Invalid option!!,please enter again");
					break;
					
				}
		}
			while(option !='E');
			System.out.println("Thank You for using our sevices");
		}
		
		
	}


