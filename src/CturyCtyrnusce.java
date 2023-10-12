import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CturyCtyrnusce {
    public static void main(String[] args) throws IOException {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String nazwa = klawiatura.nextLine();

        File Plik = new File(nazwa);

        String linia;

        Scanner Pik = new Scanner(Plik);

        int V=1;

        while (Pik.hasNext()){
            linia = Pik.nextLine();
            System.out.println(V+" |"+linia);
            V=V+1;
        }

        Pik.close();

    }
}
