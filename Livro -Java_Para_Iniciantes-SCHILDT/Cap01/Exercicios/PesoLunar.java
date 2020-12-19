// Exercicio 9.0 Calcule o seu peso na lua, sabendo que a gravidade na lua é cerca de 17% a da terra

public class PesoLunar {
    public static void main(String[] args){
        double PesoTerrestre = 90.0;
        double pesoLunar = (PesoTerrestre/9.81) * 1.622;

        System.out.printf("Seu Peso Lunar é %.2f Quilos\n", pesoLunar);
    }
    
}
