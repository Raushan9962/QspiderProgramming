 public class Q3_whileLoop{
    public static void main(String[] args){
         int sum=0;
         int i =0;
         while(i<=100){
            if(i % 2 !=0){
                sum = sum+i;
            }
            i++;
         }
           System.out.println("Sum of all odd numbers from 1 to 100 is: " + sum);
    }
 }