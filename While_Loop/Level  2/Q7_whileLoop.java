public class Q7_whileLoop{
    public static void main(String[]args){
        int sum =0;
        int i =1;
        while(i<=100){
            if(i % 2==0){
                sum= sum + i*i*i;
            }
             i++;
        }
        System.out.println("sum of cubes of all even number is: "+sum);
    }
}