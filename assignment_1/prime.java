import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number for check prime or not:");
        int num=sc.nextInt();
        int b=0;
        for(int i=1;i<=num;i++)
        {
        if(num%i==0)
        	b++;
        }
        if(b==2)
         System.out.println("number is prime");
        else
        	System.out.println("number is not prime");
	}

}
