import java.util.Scanner;

public class sumOfEvenOdd {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("enter nth number:");
		int n=sc.nextInt();
		int a=0;
		int b=0;
		for(int i=1;i<=n;i++) 
		{
		if(i%2==0)
		{
			a=a+i;
		}
		else
		{
			b=b+i;
		}
		}
        System.out.println("sum of even is:"+a);
        System.out.println("sum of odd is :"+b);
	}

}
