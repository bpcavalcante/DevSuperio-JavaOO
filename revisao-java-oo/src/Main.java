import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double largura,comprimento,metroQuadrado;

        System.out.println("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor do metro quadrado: ");
        metroQuadrado = sc.nextDouble();

        double areaDoTerreno = comprimento * largura;
        double precoDoTerreno = metroQuadrado * areaDoTerreno;

        System.out.println("Area do terreno = " + areaDoTerreno);
        System.out.println("Preco do terreno = " + precoDoTerreno);

    }
}