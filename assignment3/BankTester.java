package Tester;

import java.util.Scanner;
import Class.Bank;
public class BankTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("enter size for accounts ");
		Bank[] bank=new Bank[size];
		
		System.out.println("-*-*-*-*Meanu*-*-*-*-");
		System.out.println("1:Create New Account");
		System.out.println("2:Show All  Accounts");
		System.out.println("3:Deposite");
		System.out.println("4:Withdraw");
		System.out.println("5:transfer Money");
		System.out.println("6:Exit");
		int choice;
		int index=0;
		boolean b=false;
		Bank act=null;
		do
		{
			System.out.println("enter choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(index<bank.length)
				{
				System.out.println("-----enter account details----");
				System.out.println("enter balance and name::");
				act=new Bank(sc.nextDouble(),sc.next());
				b=true;
				}
				if(b==false)
				{
					System.out.println("Array is full");
				}
				break;
			case 2:
				for(int i=0;i<bank.length;i++)
				{
					bank[i].display();
				}
				break;
			case 3:
				System.out.println("Enter ActId ");
				int id = sc.nextInt();
				for (int i = 0; i < index; i++) {
					if (bank[i].getAccid() == id) {
						System.out.println("Enter amount To Deposite");
						double amt = sc.nextDouble();
						bank[i].deposite(amt);
						b= true;
						break;
					} 
				}
				if (b== false) {
					System.out.println("Act does Not exist");
				}
				
				break;
			case 4:
				System.out.println("Enter ActId :");
			     id =sc.nextInt();
			     for(int i=0;i<index;i++)
			     {
			    	 if(bank[i].getAccid()==id)
			    	 {
			    		 System.out.println("enter amount to withdraw :");
			    		double amt=sc.nextDouble();
			    		bank[i].withdraw(amt);
			    		b=true;
			    		break;
			    	 }
			    	 
			     }
			     if (b==false)
			     {
			    	 System.out.println("Act does Not exist");
			     }
				 break;
			case 5:
				
				
				break;
			case 6:
				System.out.println("thank you for visiting bank");
				break;
			}//switch end
		}while(choice!=6);
			

	}

}
