import java.util.Scanner;

public class CturyDewiec {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        int duza;
        int mala;
        int liczba;
        int warunek = -99;

        System.out.println("Podaj dowolna liczbe (aby zakończyć=-99): ");
        liczba = klawiatura.nextInt();
        duza=liczba;
        mala=liczba;

        while (liczba != warunek){
            System.out.println("Podaj dowolna liczbe (aby zakończyć=-99): ");
            liczba = klawiatura.nextInt();
            if(liczba>duza){
                duza=liczba;
            }
            if(liczba<mala){
                mala=liczba;
            }
        }

        System.out.println("Największa podana: "+duza);
        System.out.println("Najmniejsza podana7: "+mala);

    }
}
