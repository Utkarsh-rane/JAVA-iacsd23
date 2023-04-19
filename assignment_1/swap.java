import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st number :");
	    int no1=sc.nextInt();
        System.out.print("enter 2nd number:");
        int no2=sc.nextInt();
        System.out.println("before swap no1="+no1+" no2="+no2);
       int swap;
       swap=no1;
       no1=no2;
       no2=swap;
       System.out.println("after swap no1="+no1+" no2="+no2);


	}

}
