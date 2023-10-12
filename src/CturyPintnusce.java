import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CturyPintnusce {
    public static void main(String[] args) throws IOException {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytu: ");
        String nazwa = klawiatura.nextLine();

        File Plik = new File(nazwa);
        Scanner Pik = new Scanner(Plik);

        System.out.println("Podaj nazwę pliku do zapisu: ");
        nazwa = klawiatura.nextLine();

        FileWriter Plik2 = new FileWriter(nazwa,true);
        PrintWriter Cos = new PrintWriter(Plik2);

        String text;

        while (Pik.hasNext()){
            text = Pik.nextLine();
            text=text.toUpperCase();
            Cos.println(text);
        }

        Pik.close();
        Cos.close();

    }
}
