import java.util.Random;
import java.util.Scanner;

public class CturySidymnuscie {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double los1;
        double los2;

        Random losowanie = new Random();

        los1 = losowanie.nextInt(100000);
        los2 = losowanie.nextInt(10000);
        los2 = los2 * 0.0001;

        double wylos = los1+los2;
        double odpow;
        int licznik = 1;

        System.out.print("Sprobuj podac wylosowana liczbe: ");
        odpow = klawiatura.nextDouble();
        while (odpow != wylos){
            if (odpow<wylos){
                System.out.print("Zle. Za mala. Sprobuj ponownie.");
            }
            else {
                System.out.print("Zle. Za duza. Sprobuj ponownie.");
            }
            odpow = klawiatura.nextDouble();
            licznik=licznik+1;
        }

        System.out.print("Brawo. Liczba prob: "+licznik);


    }
}
