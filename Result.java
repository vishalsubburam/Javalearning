import java.util.Scanner;

public class Result {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double score = scanner.nextDouble();
       // your code goes here
       double average = 3.5;
       if(score>average){
           System.out.println("Congratulations");
       }
       else{
           System.out.println("Sorry");
       }
       
   }
}
