import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int basamakSayiDegeri;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayisini giriniz :");
        basamakSayiDegeri = input.nextInt();


        for (int i =1 ; i<=basamakSayiDegeri;i++ ){
            for (int j=1 ; j<=(basamakSayiDegeri-i) ; j++ ){
                System.out.print(" ");
                }
            for (int k = 1 ; k<=((2*i)-1);k++ ){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
