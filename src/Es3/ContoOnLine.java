package Es3;

public class ContoOnLine extends ContoCorrente{
    double maxPrelievo;
    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }
    void stampaSaldo() {
        System.out.println("Titolare " + titolare + " -Saldo " + saldo + "-Num movimenti:" + nMovimenti + " -Massimo Movimenti" + maxMovimenti + " - Massimo prelievo disponibile" + maxPrelievo);

    }
    void preleva(double x) {
        if (x <= maxPrelievo) {
            super.preleva(x);
        }
    }
}
