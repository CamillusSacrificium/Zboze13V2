import java.util.Scanner;

public class CturySysnusce {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj miesięczny budzet: ");
        double budzet = klawiatura.nextDouble();

        double wydatki=0;
        double V=1;

        while(V != 0){
            System.out.print("Podaj rachunki (aby przerwać wpisz 0): -");
            V = klawiatura.nextDouble();
            wydatki=wydatki+V;
            System.out.println("");
        }

        budzet=budzet-wydatki;

        System.out.print("Roznica: "+budzet);

    }
}
