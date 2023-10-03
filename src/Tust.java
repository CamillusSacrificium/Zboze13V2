import java.util.Scanner;

public class Tust {
    public static void main(String[] args) {
        System.out.println("Hell is coming...");

        int liczbaI=10;
        System.out.println("Moja liczba: " + liczbaI);

        double liczbaII=20.008;
        System.out.println("Moja liczba: " + liczbaII);

        byte liczbaIII=7;
        System.out.println("Moja liczba: " + liczbaIII);

        int hours = 8;
        int minuts = 60;
        int secunds = 90;
        int czas = hours + minuts + secunds;
        System.out.println("Wynik: "+czas);

        char znak = '#';

        boolean moon = false;

        String napis = " Dzisiaj nie ma deszczu. \n Szkoda";

        System.out.println(napis);

        int dlugosc = napis.length();
        char p_znuk = napis.charAt(5);

        String male, duze;
        male = napis.toLowerCase();
        duze = napis.toUpperCase();

        System.out.println(napis+" "+male+" "+duze);

        System.out.println("Podaj numer buta:");
        Scanner klawiatura = new Scanner(System.in);
        int numer_but;
        numer_but = klawiatura.nextInt();
        System.out.println("Twoj numer buta " + numer_but);

        System.out.println("Podaj imie: ");
        klawiatura.nextLine();
        String name = klawiatura.nextLine();
        System.out.println("Nazwa: " + name);

    }
}
