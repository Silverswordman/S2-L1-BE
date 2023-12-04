package Es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array myArray = new Array(5);
        int[] array = myArray.getArray();

        System.out.println("Array di base " + myArray);

        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.print("Inserisci il nuovo valore che vuoi inserire  ");
                int newArrayNumber = input.nextInt();

                if (newArrayNumber < 1 || newArrayNumber > 10) {
                    throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 10.");
                }

                System.out.print("Inserisci la posizione che vuoi modificare  ");
                int newArrayPosition = input.nextInt() - 1;

                if (newArrayPosition < 0 || newArrayPosition > 4) {
                    throw new ArrayIndexOutOfBoundsException("La posizione deve essere compresa tra 1 e 5.");
                }

                array[newArrayPosition] = newArrayNumber;

                System.out.println("Nuovo valore inserito: " + newArrayNumber + " nella " + (newArrayPosition + 1) + " posizione ");
                System.out.println("Nuovo array: " + myArray);

            } catch (Exception e) {
                System.err.println("Si è verificato un errore durante l'input: " + e.getMessage());
                input.nextLine();
                continue;
            }

            break;

        } while (true);

        input.close();
    }
}