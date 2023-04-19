
//15:Create Menu driven program for array operations.
//1:Read Array 2:Print Array 3:Search element in array 4:Reverse Array 5:Even number from array6:sum of array element
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int choice = 0;
		int[] arr;
		System.out.println(
				"1:Read Array 2:Print Array 3:Search element in array 4:Reverse Array 5:Even number from array 6:sum of array element 7:exit");
		System.out.print("enter size of arr :");
		int size = sc.nextInt();
		arr = new int[size];
		System.out.println("array created of storing is :" + arr.length);
		do {
			index = 0;
			System.out.print("enter choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter array elements :");
				for(int i=0;i<arr.length;i++)
				{
				arr[i]=sc.nextInt();
				}
				break;
			case 2:
				System.out.print("array is :");
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i]+" ");
				}
				break;
			case 3:
				System.out.println("enter number to find in array :");
				int n=sc.nextInt();
				boolean b=false;
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]==n)
					{
						b=true;
						break;
					}
					else
					{
						b=false;
					}
				}
				if(b==true)
				{
					System.out.println("number is present");
					break;
				}
				else
				{
					System.out.println("number is not present");
					break;
				}
				
				
			case 4:
				System.out.println("reverse array is:");
				for(int i=arr.length-1;i>=0;--i)
				{
					System.out.print(arr[i]+" ");
				}
				break;
				
			case 5:
				System.out.println("even number in array is:");
				for(int i=0;i<arr.length;i++)
				{
					if(arr[i]%2==0)
					{
						System.out.println(arr[i]+" ");
					}
				}
				break;
			case 6:
				System.out.println("sum of array elements is :");
				int ans=0;
				for(int i=0;i<arr.length;i++)
				{
					ans+=arr[i];
				}
				System.out.println(ans);
				break;
			case 7:
				System.out.println("thanks");
				break;
			}	
			
		} while (choice != 7);

	}

}
