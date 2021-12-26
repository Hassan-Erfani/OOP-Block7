package org.campus02.erfani;

public class JugendGiroKonto extends GiroKonto{
    private double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    public void einzahlen(double value) {
        super.einzahlen(value);
    }

    public void auszahlen(double value) {

        if (value <= this.buchungslimit) {
            super.auszahlen(value);
            return;
        }

        System.out.println("Buchungslimit überschritten");
        System.out.println("Kontostand: " + (int) getKontostand() + "€");
    }
}
