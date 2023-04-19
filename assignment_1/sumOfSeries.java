import java.util.Scanner;
public class sumOfSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number to find sum:");
		int n=sc.nextInt();
		int ans=0;
		for(int i=0;i<=n;i++) {
		ans=ans+i;
		}
System.out.println("sum is:"+ans);
	}

}
