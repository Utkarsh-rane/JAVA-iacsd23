import java.util.Scanner;
public class primenum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter nth number for prime numbers");
		int n=sc.nextInt();
		int b;
		for(int i=1;i<=n;i++)
		{
			b=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					b++;
					break;
				}
			}
			 if(b==0 && i!= 1) {
			     System.out.print(i+" ");
			 }
			
		}

	}

}

   
       

