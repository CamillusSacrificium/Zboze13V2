import java.util.Scanner;

public class PintDwu {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj cene hurtowa produktu: ");
        double cenaHurt = klawiatura.nextDouble();

        System.out.print("Podaj marze w procentach: ");
        double marz = klawiatura.nextDouble() * 0.01;

        double cenaDeta = claculateRetail(cenaHurt, marz);

        System.out.print("Cena detaliczna wynosi: "+cenaDeta);
    }

    public static double claculateRetail(double cena, double proc){
        double pomoc = cena*proc;
        double wynik = cena+pomoc;

        return (wynik);
    }
}
