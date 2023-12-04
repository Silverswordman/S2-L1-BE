package Es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array myArray = new Array(5);
        int[] array = myArray.getArray();

        System.out.println("Array di base " + myArray);

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Inserisci il nuovo valore per la prima posizione: ");
            int newArrayNumber = input.nextInt();
            System.out.println(newArrayNumber);
            array[0] = newArrayNumber;
        } catch (Exception e) {
            System.err.println("Si è verificato un errore durante l'input: " + e.getMessage());
        } finally {
//             input.close();
        }
    }
}
