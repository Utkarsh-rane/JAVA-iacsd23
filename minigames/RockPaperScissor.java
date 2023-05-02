
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random num=new Random();

        int i=0;
        int count=0;
        System.out.println("enter 0 for scissor \nenter 1 for rock \nenter 2 for paper");
        while(i<5) {
            int cpu=num.nextInt(3);
            System.out.print("your choice is =");
            int user = sc.nextInt();

            System.out.println("cpu choice is =" + cpu);
            if (cpu == user) {
                System.out.println("it is tie");
            } else if (cpu == 0) {
                if (user == 1)
                {
                    System.out.println("win");
                    count++;
                }
                if (user == 2)
                    System.out.println("cpu wins");
            } else if (cpu == 1) {
                if (user == 2) {
                    System.out.println("win");
                    count++;
                }
                if (user == 0)
                    System.out.println("cpu wins");
            } else if (cpu == 2) {
                if (user == 1) {
                    System.out.println("win");
                    count++;
                }
                if (user == 0)
                    System.out.println("wins");
            }
            i++;
        }
        if(count>=3){
            System.out.println("\nyou are winner of game");
        }
        else
            System.out.println("cpu wins better luck next time");
    }
}
