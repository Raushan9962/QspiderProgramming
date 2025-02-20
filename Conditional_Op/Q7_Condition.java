public class Q7_Condition{
    public static void main(String[] args) {
        int x=7;
        int y=6;
        int z=4;
        int result =(x<y)?(y<z?x:y):(x>z?x:z);
        System.out.println(result);
    }
}