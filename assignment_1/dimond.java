import java.util.Scanner;

public class dimond {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number::");
		int n= sc.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int k=n; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=1; j<i*2; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=n; i>=0; i--) 
		{
			for (int k=n-1; k>=i; k--)
			{
				System.out.print(" ");
			}
			for (int j=0; j<=i*2; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
