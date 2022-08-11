import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password ;
        boolean isPasswordSucces = false ;
        Scanner input = new Scanner(System.in);


        while (!isPasswordSucces){
            System.out.print("Sifrenizi Giriiniz :");
            password = input.nextInt();

            if (password==123){
                System.out.println("Parola Dogru ");
                isPasswordSucces = true;
            }else {
                System.out.println("Parola Yanlis ");
            }
        }


    }
}
