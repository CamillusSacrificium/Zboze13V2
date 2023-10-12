import java.util.Random;
import java.util.Scanner;

public class CturyDwudzuescuDwu {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        Random losowanie = new Random();

        String[] Znaki = new String[6];
        Znaki[0] = "   Wisnia   ";
        Znaki[1] = " Pomarancza ";
        Znaki[2] = "   Sliwka   ";
        Znaki[3] = "   Dzwon    ";
        Znaki[4] = "   Melon    ";
        Znaki[5] = "    Gary    ";

        String[] Slowa = new String[5];
        Slowa[0] = "tak";
        Slowa[1] = "Tak";
        Slowa[2] = "tAK";
        Slowa[3] = "TAK";
        Slowa[4] = "Gary loves you";


        int[] Liczby = new int[3];
        int GLY;
        double kwota;
        double stracone=0;
        double wplata=0;
        String gra="tak";

        System.out.println("########################################");
        while (gra.compareTo(Slowa[0]) == 0 || gra.compareTo(Slowa[1]) == 0 || gra.compareTo(Slowa[2]) == 0 || gra.compareTo(Slowa[3]) == 0){
            System.out.print("Podaj kwote do grania: ");
            kwota=klawiatura.nextDouble();
            wplata=wplata+kwota;

            for(int V=0; V<3; V++){
                Liczby[V]= losowanie.nextInt(6);
            }

            System.out.println("****************************************");
            System.out.print("*"+Znaki[Liczby[0]]);
            System.out.print("*"+Znaki[Liczby[1]]);
            System.out.println("*"+Znaki[Liczby[2]]+"*");
            System.out.println("****************************************");

            GLY=Liczby[0]+Liczby[1]+Liczby[2];

            if(GLY==15){
                System.out.println("Gary loves you");
                System.out.println("");
                System.out.println("Any money won by you will be allocated");
                System.out.println("for funding the cult");
                System.out.println("");
                System.out.println("Remember, Gary loves you");
                System.out.println("");
                System.out.println("PS Behind you");

                gra = "Gary loves you";
            }else {
                if(Liczby[0]==Liczby[1] && Liczby[0]==Liczby[2]){
                    System.out.println("Wielka wygrana");
                    kwota=kwota*3;
                    System.out.println("Wygrales: "+kwota);
                    stracone=stracone+kwota;
                } else if (Liczby[0]==Liczby[1]) {
                    System.out.println("Wygrana");
                    kwota=kwota*2;
                    System.out.println("Wygrales: "+kwota);
                    stracone=stracone+kwota;
                } else if (Liczby[0]==Liczby[2]) {
                    System.out.println("Wygrana");
                    kwota=kwota*2;
                    System.out.println("Wygrales: "+kwota);
                    stracone=stracone+kwota;
                } else if (Liczby[1]==Liczby[2]) {
                    System.out.println("Wygrana");
                    kwota=kwota*2;
                    System.out.println("Wygrales: "+kwota);
                    stracone=stracone+kwota;
                }else {
                    System.out.println("Przegrana");
                    System.out.println("Wygrales: 0");
                }

                System.out.println("########################################");
                System.out.print("Chcesz grac dalej (wpisz 'tak') ? : ");
                gra=klawiatura.nextLine();
                gra=klawiatura.nextLine();

            }


        }

        if(gra.compareTo(Slowa[4]) == 0){
            System.out.println("");
        } else {
            System.out.println("########################################");
            System.out.println("Wplaciles: "+wplata);
            System.out.println("Zdobyles: "+stracone);
            System.out.println("########################################");
            System.out.println("Wpadnij ponownie");
        }


    }
}
