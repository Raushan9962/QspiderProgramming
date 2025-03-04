//wajp to print sum of squares of all natural numbers from 1 to 100//

public class Q4_whileLoop{
public static void main(String[] args) {
    int sum =0;
    int i =1;
    while(i<=100){
        sum = sum+i*i;
        i++;
    }

   System.out.println("sum of squares of all natural numbers: " + sum);
}
}