public class Q11_whileLoop{
    public static void main(String[] args) {
        int sum=0;
        int i = 1;
        while(i<=100){
            sum = i+((i+1)*(i*1));
            i++;
        }
        System.out.println("print the number or square: " +sum);
    }
}