public class Q11_Condition{
    public static void main(String[] args){
        int x=4;
        int y=5;
        int z=16;
        if(x+y>z && x+z>y && y+z>x){               //A triangle is valid if the sum of any two sides is greater than the third side:
                 // a + b > c 
                 // a + c > b
                 // b + c > a
            System.out.println("valid triangle");
        }
        else{
            System.out.println("invalid triangle");
        }
    
               
    }
}