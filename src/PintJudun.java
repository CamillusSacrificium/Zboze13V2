import java.util.Scanner;

public class PintJudun {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj nazwe miasta: ");
        String cityName = klawiatura.nextLine();

        System.out.print("Podaj ktora litere wyswietlic: ");gdgdkk
        int miejsce = klawiatura.nextInt() - 1;

        showChar(cityName, miejsce);
    }

    public static void showChar(String text, int V){
        char znak = text.charAt(V);
        System.out.print("Znak "+(V+1)+" z '"+text+"' to: "+znak);
    }
}
