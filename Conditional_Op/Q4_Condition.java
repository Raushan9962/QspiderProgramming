public  class Q4_Condition{
    public static void main(String[] args) {
       int a=5;
       int b=10;
       int c=(a>b)? b++:(a<b ? --b:b);//If a < b: c = --b (decrement b first, then assign)
       System.out.println(c); 
    }
}