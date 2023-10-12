import java.util.Scanner;

public class CturyDwudziscu {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj liczbę: ");
        int liczba = klawiatura.nextInt();

        while (liczba>15){
            System.out.print("Ma być nie większa od 15: ");
            liczba=klawiatura.nextInt();
        }

        for(int V=0;V<liczba;V++){
            for(int C=0;C<(liczba-1);C++){
                System.out.print("X");
            }
            System.out.println("X");
        }

    }
}
