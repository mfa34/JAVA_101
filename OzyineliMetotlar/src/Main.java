public class Main {
   static int r(int n ){
       System.out.println("n ===> " + n);
       if (n==1){
           return 1;
       }
       int result = r(n-1)+n;
       return result  ;
   }
    public static void main(String[] args) {

        System.out.println(r(3));

    }
}
