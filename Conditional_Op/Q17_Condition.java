import java.util.Scanner;
public class Q17_Condition{
    public static void main(String[] args) {
       int a=4; 
        int b=7; 
         int c=8; 
         if(a>b && a>c){
            System.out.println("A is bigger ");
         }
          else if(b>a && b>c){
                  System.out.println("B is bigger");
          }
          else{
            System.out.println("C is bigger");
          }

    }
}