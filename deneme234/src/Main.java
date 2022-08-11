import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int sayac = 0;

        System.out.println("Enter the number:");
        int number = input.nextInt();
        int gecici = number;
        int result=0;
        while(gecici!=0){
            gecici/=10 ;
            sayac ++ ;
        }
        number= gecici;

        for (int j = 1 ; j<=sayac ; j ++){
             int a =gecici%10;
            result += a;
        }
        System.out.println(result);

    }
}
