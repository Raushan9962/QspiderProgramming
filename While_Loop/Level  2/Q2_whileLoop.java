// WAJP to print sum of all even numbers from 1 to 100.//
public class Q2_whileLoop {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of all even numbers from 1 to 100 is: " + sum);
    }
}