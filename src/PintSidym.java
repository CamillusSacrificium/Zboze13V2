import java.util.Scanner;

public class PintSidym {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        System.out.print("Podaj metry: ");
        double meters = klawiatura.nextDouble();

        while (meters<0){
            System.out.print("Ma byc wartosc dodatnia: ");
            meters = klawiatura.nextDouble();
        }

        int warunek;

        do{
            warunek = main();
            if(warunek==1){
                konwNaKilo(meters);
            } else if (warunek==2) {
                konwNaCale(meters);
            } else if (warunek==3) {
                konwNaStop(meters);
            } else if (warunek!=4) {
                System.out.print("Bladk");
            }


        }while (warunek!=4);

        System.out.println("Bywaj");

    }

}
