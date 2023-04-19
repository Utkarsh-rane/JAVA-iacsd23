import java.util.Scanner;
public class power {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number :");
	int m=sc.nextInt();
	System.out.print("enter power:");
	int n=sc.nextInt();
	int ans=1;
	for(int i=1;i<=n;i++)
	{
		ans=ans*m;
	}
   System.out.println("ans is:"+ans);
	}

}
