import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int password ;
        boolean runProgram = true ;
        Scanner input = new Scanner(System.in);



        do {
            System.out.print("Lutfen sifrenizi giriniz:");
            password = input.nextInt();
            if (password==123){
                runProgram=false;
                System.out.println("Dogru parola");
            }else {
                System.out.println("Dogru degil");
            }
        }while (runProgram);

    }
}
