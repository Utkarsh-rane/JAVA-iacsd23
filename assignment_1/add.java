import java.util.Scanner;
public class add {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter 1st number :");
    int no1=sc.nextInt();
    System.out.print("enter 2nd number:");
    int no2=sc.nextInt();
    int ans=no1+no2;
    System.out.println(no1+"+"+no2+"="+ans);
	
}
}
