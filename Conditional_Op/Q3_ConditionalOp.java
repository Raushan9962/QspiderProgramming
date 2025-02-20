class Q3_ConditionalOp{
    public static void main(String[] args){
        int x = 10;
        int y = 5;
        int z=15;
        // int result= (x < y) ?(y < z ? z:y):x;
        // System.out.println(" "+ result);
        int result= (x > y) ?(y < z ? z:y):x;
        System.out.println(" "+ result);
    }
}