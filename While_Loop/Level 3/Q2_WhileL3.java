import java.util.Scanner;

public class Q2_WhileL3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
             int rem = n % 10;
            if(n % 2==0){
              System.out.println("Total digits are: " + rem);  
            }
            count++;

            n = n / 10;
        }
    }
}