import java.util.Random;
import java.util.Scanner;

class game{
   public int number;
   public int input;
    public int noofGuessses=0;

    public int getNoofGuessses() {
        return noofGuessses;
    }

    public void setNoofGuessses(int noofGuessses) {
        this.noofGuessses = noofGuessses;
    }
    //generate random number
  game(){
        Random cpu=new Random();
     this.number=cpu.nextInt(100);
 }
 //take number from user
 void user(){
     System.out.print("guess the number=");
     Scanner sc=new Scanner(System.in);
     input=sc.nextInt();
 }

 //for check given number is correct or not
 boolean isCorrectNumber(){
        noofGuessses++;
     if(input==number){
         System.out.printf("yes you guessed it correct, it was %d and you guessed in %d attempts ",number,noofGuessses);
         return true;
     }
     else if(input<number){
         System.out.println("too less..");
     }
     else if(input> number){
         System.out.println("too heigh..");
     }

     return false;
 }
}

//main function
public class GuesssNumber {
    public static void main(String[] args) {
        game g=new game();
        boolean b=false;
        while(!b) {
            g.user();
             b = g.isCorrectNumber();
           // System.out.println(b);
        }
    }
}
