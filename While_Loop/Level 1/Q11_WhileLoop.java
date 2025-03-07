
import java.util.Scanner;

public class Q11_WhileLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number:" );
        int n = sc.nextInt();
        int i=1;
        int count = 0;
        while(i<=n/2){
            if(n%i==0){
                System.out.println(i);
                count++;
            }
            i++;
        }
        if(count==1)
        {
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is  not a prime number");
        }
    }
}