import java.util.Scanner;

public class passcle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		for (int i=0; i<n; i++)
		{
			int sum=1;
			for(int k=n; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print(sum+" ");
				sum=sum*(i-j)/(j+1);
			}
			System.out.println("");
		}

	}

}
