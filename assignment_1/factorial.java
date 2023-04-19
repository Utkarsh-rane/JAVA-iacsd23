import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number to find factoriaal :");
		int a=sc.nextInt();
		int ans=1;
		for( int i=1;i<=a;i++)
		{
		  ans=ans*i;
		}
		System.out.println("factoria is: "+ans);

	}

}
