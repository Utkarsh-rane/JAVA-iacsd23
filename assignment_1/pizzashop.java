//14:Create menu driven program for Pizza Shop.And display total amount,

import java.util.Scanner;
public class pizzashop {

	public static void main(String[] args) {
		System.out.println("1 : mozzarella pizza   100Rs   2: veg pizza  150Rs   3:chicken pizza  250Rs  4:special pizza 1000rs 5:Total Bill 6 :Exit "); 
		
		Scanner sc = new Scanner(System.in);
		int total=0;
		int choice, qty;
		do {
			System.out.print("enter your choice :");	
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("enter quantity mozzarella pizza :");
				qty=sc.nextInt();
				total +=100*qty;
				System.out.println("total ammount is "+total);
				break;
			case 2:
				System.out.print("enter quantity veg pizza :");
				qty=sc.nextInt();
				total +=150*qty;
				System.out.println("total ammount is "+total);
				break;
			case 3:
				System.out.print("enter quantity chicken pizza :");
				qty=sc.nextInt();
				total +=250*qty;
				System.out.println("total ammount is "+total);
				break;
			case 4:
				System.out.print("enter quantity special pizza :");
				qty=sc.nextInt();
				total +=1000*qty;
				System.out.println("total ammount is "+total);
				break;
			case 5:
				System.out.println("total bill is :"+total);
				
				break;
			case 6:
				System.out.println("thanks for shopping");
				break;
			default:
				System.out.println("invalid choice");
				break;
				
			}//switch
		}while(choice!=6);
		
		
	}

}
