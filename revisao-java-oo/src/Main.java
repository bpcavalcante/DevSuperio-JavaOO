import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf(product1 + ", which price is $ %.2f%n", price1);
        System.out.printf(product2 + ", which price is $ %.2f%n", price2);
        System.out.println();

        System.out.printf("Record: " + age + " years old, code %d and gender: %s %n",code,gender);
        System.out.println();

        System.out.printf("Measue with eight decimal places: %f %n" , measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);

    }
}