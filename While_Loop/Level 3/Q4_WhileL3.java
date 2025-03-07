
import java.util.Scanner;

public class Q4_WhileL3 {
    public static void main(String[] args) {
     
       int count = 0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();
    while (n>0) {
        if (n <= 5) {
             int rem = n % 10;
            System.out.println("Total digits are: " + rem);
        }
         n = n / 10;
          count++;
       
    }
     
  
     
}
}