package Es1;

import java.util.Arrays;
import java.util.Random;


public class Array {


    //attributi
    private int[] array;


    //costruttore
    public Array(int length) {
        array = new int[length];
        generateRandomArray();
    }

    // metodi
    private void generateRandomArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
    }

    //getter
    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        return( " " + Arrays.toString(array) + " ");

    }

    // tostring


}
