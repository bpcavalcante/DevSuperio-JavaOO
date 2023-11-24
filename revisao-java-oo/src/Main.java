import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double baseDoRetangulo, alturaDoRetangulo, area, perimetro, diagonal;

        System.out.println("Digite o valor da base do Retangulo: ");
        baseDoRetangulo = sc.nextDouble();
        System.out.println("Digite o valor da altura do Retangulo: ");
        alturaDoRetangulo = sc.nextDouble();

        area = baseDoRetangulo * alturaDoRetangulo;
        perimetro = (baseDoRetangulo * 2) + (alturaDoRetangulo *2 );
        diagonal = Math.sqrt((Math.pow(alturaDoRetangulo,2) + (Math.pow(baseDoRetangulo, 2))));

        System.out.printf("AREA = %.4f%n" , area );
        System.out.printf("PERIMETRO = %.4f%n" , perimetro);
        System.out.printf("DIAGONAL = %.4f%n" , diagonal);


    }
}