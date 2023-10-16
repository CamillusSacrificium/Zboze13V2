public class PintPint {
    public static void main(String[] args) {
        for(int V=0; V<=20; V++){
            System.out.println("F = "+V+" a C = "+Celsjusz(V));
        }
    }

    public static double Celsjusz(double ef){
        double ce = ef-32;
        double pincPrzusDziwinc = 1.8;
        ce=ce/pincPrzusDziwinc;
        return (ce);
    }
}
