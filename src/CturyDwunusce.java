import java.util.Scanner;

public class CturyDwunusce {
    public static void main(String[] args) {

        Scanner klawiatura = new Scanner(System.in);

        double[] zysk = new double[5];

        for(int V=0;V<5;V++){
            System.out.println("Podaj sprzedaz "+(V+1)+" sklepu: ");
            zysk[V]=klawiatura.nextDouble();
        }

        for(int V=0;V<5;V++){
            zysk[V]=zysk[V]/100;
            System.out.print("Sklep "+(V+1)+": ");
            for(int C=0;C<zysk[V];C++){
                System.out.print("*");
            }
            System.out.println("");
        }



    }
}
