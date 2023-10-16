import java.math.BigDecimal;
import java.util.Scanner;

public class PintTsy {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj liczbę pokoi do pomalowania: ");
        int pokoLicz = klawiatura.nextInt();

        double metry = 0;
        for(int V=0; V<pokoLicz; V++){
            System.out.print("Podaj powierzchnię do pomalowania w "+(V+1)+" pokoju: ");
            metry = klawiatura.nextDouble() + metry;
        }

        System.out.print("Podaj cenę za litr farby: ");
        double cenaFarb = klawiatura.nextDouble();

        System.out.println("Laczna powierzchnia do malowania: "+metry);

        double litry = liczPotrLitrFarb(metry);
        System.out.println("Litry farby: "+litry);

        double godziny = liczPotrGodzPrac(metry);
        System.out.println("Liczba potrzebnych godzin: "+godziny);

        double kosztZaFarby = koszFarb(cenaFarb, litry);
        System.out.println("Koszt za farby: "+kosztZaFarby);

        double kosztZaCzas = koszRobo(godziny);
        System.out.println("Koszt za robote: "+kosztZaCzas);

        double colyKoszt = laczKoszMalo(kosztZaFarby, kosztZaCzas);
        System.out.println("Laczny koszt wynosi: "+colyKoszt);


    }

    public static double liczPotrLitrFarb(double razem){
        double wymogFarb = 1.5;
        double naKazde = 10;
        double potrzeba = razem / naKazde;
        potrzeba = potrzeba * wymogFarb;
        return(potrzeba);
    }

    public static double liczPotrGodzPrac(double razem){
        double czasPot = 8;
        double naKazde = 10;
        double potrzeba = razem / naKazde;
        potrzeba = potrzeba*czasPot;
        return (potrzeba);
    }

    public static double koszFarb(double cena, double ilosc){
        double razem = cena*ilosc;
        return (razem);
    }

    public static double koszRobo(double ilosc){
        double cena = 18;
        double razem = ilosc*cena;
        return (razem);
    }

    public static double laczKoszMalo(double cenaI, double cenaII){
        return (cenaI+cenaII);
    }
}


