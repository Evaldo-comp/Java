// Conversão automática de long para double

public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 10010110125L;
        D = L;  // aqui ocorre a conversão automática

        System.out.println("L  e D: "+ L + " " + D);

        // como double é maior que long, a conversão oposta não ocorre
    }
}
