package org.campus02.erfani;

public class GiroKonto extends Konto{
    private double limit;
    private  double tmp = 0;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public void einzahlen(double value) {
        super.einzahlen(value);
    }

    public void auszahlen(double value) {

        // check if limit is reached
        if (tmp + value <= this.limit) {
            super.auszahlen(value);
            tmp +=value;
            return;
        }

        System.out.println("Auszahlung nicht möglich, Limit überschritten");
        System.out.println("Kontostand: " + (int) getKontostand() + "€");
    }
}
