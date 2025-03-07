
import java.util.Scanner;

public class Q5_WhileLoop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the  number:");
          int x = sc.nextInt();
          int i=1;
          int count =0;
           while(i<x){
                if(x % 7==0){
                    
                    System.out.println(" it is divided by 7");
                }
                else{
                    System.out.println("it isnot divided by 7");
                }
                
                i++;
                count ++;
                System.out.println( count);
           }
         
        
    }
}