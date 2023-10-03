import com.sun.tools.javac.Main;

public class JudunIDwudzisciudwu {
    public static void main(String[] args) {

        double liczba_zakupioonych_akcji = 1000;
        double liczba_sprzedanych_akcji = 1000;
        double cena_zakupu = 32.87;
        double cena_sprzedazy = 33.92;
        double prowizja_brokera = 0.02;

        double kwota_zaplacona = liczba_zakupioonych_akcji*cena_zakupu;
        double kwota_zaplacona_za_zakup_brokerowi = cena_zakupu*prowizja_brokera*
                liczba_zakupioonych_akcji;

        System.out.println("Kwotę zapłaconą przez Jacka za akcje: "+kwota_zaplacona);
        System.out.println("Wartość prowizji zapłaconej przez Jacka brokerowi przy zakupie: " +
                kwota_zaplacona_za_zakup_brokerowi);

        double kwota_sprzedazy = liczba_sprzedanych_akcji*cena_sprzedazy;
        double kwota_zaplacona_za_sprzedarz_brokerowi = cena_sprzedazy*prowizja_brokera*
                liczba_sprzedanych_akcji;

        System.out.println("Kwotę otrzymaną przez Jacka ze sprzedaży akcji: " + kwota_sprzedazy);
        System.out.println("Wartość prowizji zapłaconej przez Jacka brokerowi przy sprzedaży: " +
                kwota_zaplacona_za_sprzedarz_brokerowi);

        kwota_zaplacona = kwota_zaplacona-kwota_zaplacona_za_zakup_brokerowi;
        kwota_sprzedazy = kwota_sprzedazy-kwota_zaplacona_za_sprzedarz_brokerowi;
        double zysk = kwota_sprzedazy-kwota_zaplacona;

        System.out.println("Zysk Jacka ze sprzedaży akcji po zapłaceniu obu prowizji: " + zysk);


    }
}
