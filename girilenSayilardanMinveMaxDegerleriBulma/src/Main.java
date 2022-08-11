import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac Tane Sayi Gireceksiniz: ");
        int kacSayi=input.nextInt();
        int sayi;
        int buyukSayi =0 , kucukSayi=0 ;
        for (int i =1 ; i <=kacSayi ; i++){
            System.out.println("Please enter " + i + ". number: ");
            sayi = input.nextInt();
            if (i==1){
                buyukSayi=sayi;
                kucukSayi=sayi;
            }
            else {
                if (sayi > buyukSayi){
                    buyukSayi=sayi;
                }
                else if (sayi< kucukSayi){
                    kucukSayi=sayi;
                }
            }
        }
        System.out.println("The largest number is :"+buyukSayi);
        System.out.println("The smallest number is :"+kucukSayi);

    }
}
