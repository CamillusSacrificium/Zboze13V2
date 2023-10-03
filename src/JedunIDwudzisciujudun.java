import java.util.Scanner;

public class JedunIDwudzisciujudun {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj kowte poczatkowa: ");
        double kwota_poczatkowa = klawiatura.nextDouble();
        System.out.println("Podaj roczne oprocentowanie: ");
        double oprocentowanie = klawiatura.nextDouble()*0.01;
        System.out.println("Podaj ile razy w roku odsetki są kapitalizowane: ");
        double ile_razy = klawiatura.nextDouble();
        System.out.println("Podaj liczbe lat: ");
        double lata = klawiatura.nextDouble();

        double kwota_po_x_lat;
        kwota_po_x_lat = (1+oprocentowanie/ile_razy);
        kwota_po_x_lat = Math.pow(kwota_po_x_lat,(ile_razy*lata));
        kwota_po_x_lat = kwota_poczatkowa * kwota_po_x_lat;

        System.out.println("Po "+ lata + ", będziemy mieć z "+kwota_poczatkowa+ " az "+kwota_po_x_lat);

    }
}
