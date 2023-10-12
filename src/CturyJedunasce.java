public class CturyJedunasce {
    public static void main(String[] args) {
        double[][] tabela = new double[2][21];

        for(int V=0; V<21;V++){
            tabela[0][V]=V;
        }

        for(int V=0; V<21;V++){
            tabela[1][V]=1.8*V+32;
        }

        System.out.println("*******************");
        for(int V=0; V<21;V++){
            if(V<10){
                System.out.println("*  "+tabela[0][V]+"    *  "+tabela[1][V]+"  *");
            }
            else{
                System.out.println("*  "+tabela[0][V]+"  *  "+tabela[1][V]+"  *");
            }
            System.out.println("*******************");
        }

    }
}
