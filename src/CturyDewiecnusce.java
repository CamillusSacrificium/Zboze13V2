import java.util.Random;
import java.util.Scanner;

public class CturyDewiecnusce {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        Random losowanie = new Random();

        int liczba;
        String[] Kolory = new String [5];
        Kolory[0]="Czerwony";
        Kolory[1]="Zielony";
        Kolory[2]="Niebieski";
        Kolory[3]="Pomarańczowy";
        Kolory[4]="Żółty";

        int punk=0;
        String odpow;

        for(int V=0; V<10; V++){
            liczba=losowanie.nextInt(5);
            System.out.print("Odgadnij "+(V+1)+" kolor: ");
            odpow=klawiatura.nextLine();
            if(odpow.compareTo(Kolory[liczba])==0){
                punk=punk+1;
            }
            //System.out.println("Kolor "+(V+1)+" to: "+Kolory[liczba]);
        }

        System.out.print("Liczba poprawnych odpowiedzi: "+punk);

    }
}
