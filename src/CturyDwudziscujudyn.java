import java.util.Random;
import java.util.Scanner;

public class CturyDwudziscujudyn {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);
        Random losowanie = new Random();

        int rzutUzyt;
        int rzutKomp;
        String opdow;
        int punkUzyt = 0;
        int punkKomp = 0;

        System.out.println("######################################");
        for(int V=0;V<10; V++){
            System.out.println("Runda "+(V+1));
            rzutKomp=losowanie.nextInt(6)+1;
            System.out.println("Przeciwnik rzucil. Wynik: "+ rzutKomp);
            rzutUzyt=losowanie.nextInt(6)+1;
            System.out.print("Nacisnij Enter aby rzucic...");
            opdow = klawiatura.nextLine();
            System.out.println("Rzuciles. Wynik: "+ rzutUzyt);
            if(rzutUzyt>rzutKomp){
                System.out.println("Zdobywasz punkt.");
                punkUzyt=punkUzyt+1;
                System.out.print("Nacisnij Enter aby kontynuować...");
                opdow = klawiatura.nextLine();
            } else if (rzutUzyt<rzutKomp) {
                System.out.println("Przeciwnik zdobywa punkt.");
                punkKomp=punkKomp+1;
                System.out.print("Nacisnij Enter aby kontynuować...");
                opdow = klawiatura.nextLine();
            }else {
                System.out.println("Brak rostrzygnięcia.");
                System.out.print("Nacisnij Enter aby kontynuować...");
                opdow = klawiatura.nextLine();
            }
            System.out.println("######################################");

        }

        if(punkUzyt>punkKomp){
            System.out.println("Wygrałeś");
        } else if (punkUzyt<punkKomp) {
            System.out.println("Przeciwnik wygrał");
        } else {
            System.out.println("Remis");
        }

        System.out.println("");
        System.out.println("Punktacja:");
        System.out.println("Przeciwnik: "+punkKomp);
        System.out.println("Ty: "+punkUzyt);
        System.out.println("######################################");

    }
}
