 public class Q18_Condition{
    public static void main(String[] args) {
        int a=4;
        int b=4;
        int c=4;
        int d=4;
        if(a>b && a>c && a>d){
            System.out.println("A is bigger");
        }
         else if(b>a && b>c && b>d){
            System.out.println("B is bigger");
        }
        else if(c>a && c>c && c>d){
            System.out.println("B is bigger");
        }
        else {
            System.out.println("D is bigger");
        }
       

    }
 }