package Es2;

public class KmPerLitro {

    private KmPerLitro() {
    }

    static double calcolo(int chilometriPercorsi, int litriConsumati) {
        if (litriConsumati == 0) {
            throw new ArithmeticException("Errore: La quantità di litri non può essere zero.");

        }

        return (double) chilometriPercorsi / litriConsumati;
    }
}
