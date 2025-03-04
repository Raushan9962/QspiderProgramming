public class Q12_whileLoop {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        while(i<=100){
            sum=(i*i)*(i+1);
            i++;
        }
        System.out.println("print of sum:"+sum);
    }
        }