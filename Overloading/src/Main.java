public class Main {
    static void  print (){
        System.out.println("Parametresiz metot");

    }
    static int print (int a){
        System.out.println("Parametreler "+a);
        return a;
    }
    static int print(int a , int b ){
        return a+b;
    }
    static int print (int a , int b , int c ){
        return a+b+c;
    }
    public static void main(String[] args) {
        print();
        print(5);
        System.out.println(print(2,3));
        System.out.println(print(3,2,4));

    }
}
