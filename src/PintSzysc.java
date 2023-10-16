import java.util.Scanner;

public class PintSzysc {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double[] Tablica = new double[5];

        for(int V = 0; V<5; V++){
            System.out.print("Podaj wynik "+(V+1)+" testu: ");
            Tablica[V]= klawiatura.nextDouble();
        }

        for (int V=0; V<5; V++){
            System.out.println("Ocena z test "+(V+1)+": "+determineGarde(Tablica[V]));
        }

        System.out.println("Srednia: "+calcAverage(Tablica));

    }

    public static double calcAverage(double[] Tab){
        double sred = 0;
        for(int V = 0; V<Tab.length;V++){
            sred=sred+Tab[V];
        }
        sred=sred/Tab.length;
        return (sred);
    }

    public static double determineGarde(double wyn){
        if(wyn>=90){
            return (5);
        } else if (wyn>=80) {
            return (4);
        } else if (wyn>=70) {
            return (3);
        } else if (wyn>=60) {
            return (2);
        } else {
            return (1);
        }
    }

}
