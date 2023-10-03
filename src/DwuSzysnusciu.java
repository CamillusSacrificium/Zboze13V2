import java.util.Scanner;

public class DwuSzysnusciu {
    public static void main(String[] args) {

        int suma = 0;
        int ilosc_ksiazek;

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj ilosc miesiecy: ");
        int ilosc_miesiecy=klawiatura.nextInt();

        for (int i=1; i <= ilosc_miesiecy; i++){
            System.out.println("Podaj ilosc zakupionych ksiazek w " + i + "miesiacu");
            ilosc_ksiazek=klawiatura.nextInt();

            if(ilosc_ksiazek==1){
                suma=suma+5;
            } else if (ilosc_ksiazek==2) {
                suma=suma+15;
            } else if (ilosc_ksiazek==3) {
                suma=suma+30;
            }
        }

    }
}
