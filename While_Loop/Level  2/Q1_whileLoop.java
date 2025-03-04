// WAJP to print sum of all natural numbers from 1 to 100.//
public class Q1_whileLoop {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of all natural numbers from 1 to 100 is: " + sum);
    }
}