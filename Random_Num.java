import java.util.Scanner;
import java.util.Random;
//Exercise 3
class Guess{
    public int noOfGuesses=0;
    public int com;
    public int user_input;

    public Guess(){
      Random rd=new Random();
      this.com=rd.nextInt(100);
      
    }
    public void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
         user_input=sc.nextInt(); 
    }
    public boolean isCorrectNumber(){
        noOfGuesses++;
        if(user_input==com){
            System.out.format("Yes you guessed it right,it was %d\n.You guessed it in %d attempts",com,noOfGuesses);
            return true;
        }
        else if(user_input<com){
            System.out.println("No. is too small");
        }
        else if(user_input>com){
            System.out.println("No. is too great");
        }
        return false;
    }
}
public class Random_Num{
public static void main(String[] args){
    boolean b=false;
    Guess g=new Guess();
    while(!b){
    g.takeUserInput();
    b=g.isCorrectNumber();
    }
}
}
