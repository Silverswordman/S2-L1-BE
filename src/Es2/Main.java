package Es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci i chilometri percorsi: ");
        int kmPercorsi = input.nextInt();

        System.out.print("Inserisci i litri di carburante consumati: ");
        int litriCons = input.nextInt();

        input.close();

        try {
            double kmPerLitro = KmPerLitro.calcolo(kmPercorsi, litriCons);
            System.out.println("Il consumo medio è di " + kmPerLitro + " km/l");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
