import java.util.Scanner;

public class CturyOsim {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        System.out.println("Podaj poczatkowa liczbe organizmow: ");
        double poczatek=klawiatura.nextInt();

        while(poczatek < 2){
            System.out.println("Ma wynosic przynajmniej 2.");
            System.out.println("Podaj poczatkowa liczbe organizmow: ");
            poczatek = klawiatura.nextInt();
        }

        System.out.println("Podaj sredni przyrost populacji w %: ");
        double przyrost=klawiatura.nextInt() * 0.01;

        while(przyrost <= 0){
            System.out.println("Ma być dodatni.");
            System.out.println("Podaj sredni przyrost populacji w %: ");
            przyrost = klawiatura.nextInt();
        }

        System.out.println("Podaj czas rozmnarzania: ");
        int czas=klawiatura.nextInt();

        while(czas < 1){
            System.out.println("Ma być dodatni.");
            System.out.println("Podaj czas rozmnarzania: ");
            czas = klawiatura.nextInt();
        }

        double pomoc;

        for(int V=0;V<=czas;V++){
            System.out.println("Dzien "+V+": "+poczatek);
            pomoc=poczatek;
            pomoc=pomoc*przyrost;
            poczatek=poczatek+pomoc;
        }
    }
}
