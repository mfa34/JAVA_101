import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Sinir Sayinizi Giriniz : ");
        int sinirSayi=input.nextInt();
        int total=1;
        //faktoriyel hesaplama

        for (int i = 1; i <=sinirSayi ; i ++ ){
            total*=i;

        }
        System.out.println( sinirSayi +"  faktoriyel = "+total);



    }
}
