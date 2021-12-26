package org.campus02.erfani;

public class SparKonto extends Konto{

    public SparKonto(String inhaber) {
        super(inhaber);
    }

    public void einzahlen(double value) {
        super.einzahlen(value);
    }

    public void auszahlen(double value) {
        if (value > getKontostand()) {
            System.out.println("Das Konto kann nicht überzogen werden!");
            System.out.println("Kontostand: " + (int) getKontostand() + "€");
            return;
        }

        super.auszahlen(value);
    }
}
