public class PintCtury {
    public static void main(String[] args) {
        for(int V=1; V<=10; V++){
            System.out.println("Odległosc przebyta w "+V+" sekund wynosi: "+fallingDistance(V));
        }
    }

    public static double fallingDistance(double te){
        double gie = 9.8;
        double de = 0.5 * gie * te;
        de = de*de;
        return (de);
    }
}
