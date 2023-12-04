package Es3;

public class ContoCorrente {
    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;


    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
    }

    void preleva (double x){
        if (nMovimenti <maxMovimenti)
            saldo=saldo-x;
        else saldo=saldo-x-0.50;
        nMovimenti++;
    }
    double restituisciSaldo() {return saldo;}
}
