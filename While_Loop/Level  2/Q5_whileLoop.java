public class Q5_whileLoop{
    public static void main(String[] args) {
         int sum =0;
         int i=0;
         while(i<=100){
            sum =sum + i*i*i;
            i++;
         }
         System.out.println("sum of cubes of all natural numbers:" + sum);
    }
}