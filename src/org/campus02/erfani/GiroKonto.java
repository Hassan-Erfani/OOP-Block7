package org.campus02.erfani;

public class GiroKonto extends Konto{
    private double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public void einzahlen(double value) {
        super.einzahlen(value);
    }

    public void auszahlen(double value) {
        super.auszahlen(value);
    }
}
