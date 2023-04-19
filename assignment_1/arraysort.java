import java.util.Scanner;

public class arraysort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array ::");
		int[] arr=new int[sc.nextInt()];
		System.out.println("enter array element");
		int t=0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					 t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		
		System.out.println("sorted array is :: ");
		for(int k=0; k<arr.length; k++)
		{
			System.out.print(arr[k] + " ");
		}
		

	}

}
