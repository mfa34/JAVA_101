import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi ;
        /*
        for (boolean run = true ; run;){
            System.out.println("sayi giriniz.");
            sayi=input.nextInt();
            if (sayi< 0){
                run=false;
            }
        }*/

        /*do {
            System.out.println("sayi giriniz.");
            sayi=input.nextInt();
        }
        while (sayi > 0);*/
        for ( int i=1 ; i<=10 ;i ++){
            System.out.print(i + " ");
        }
        int k=1 ;
        while (k<=10 ){
            System.out.println(k);
            k ++ ;
        }


    }
}
