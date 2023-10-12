import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CturyTsynusce {
    public static void main(String[] args) throws IOException {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String nazwa = klawiatura.nextLine();

        File Plik = new File(nazwa);

        String linia;

        Scanner Pik = new Scanner(Plik);

        for(int V=0;V<5; V++){
            linia = Pik.nextLine();
            System.out.println("Linia: "+linia);
        }

        Pik.close();

    }
}
