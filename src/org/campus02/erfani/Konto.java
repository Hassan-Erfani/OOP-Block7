package org.campus02.erfani;

public class Konto {
    private String inhaber;
    private double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0;
    }

    public void einzahlen(double value) {
        if (value == 0) {
            System.out.println("Bitte geben Sie einen Betrag größer als 0 ein");
            System.out.println("Kontostand: " + (int)this.kontostand + "€");
            return;
        }

        this.kontostand += value;
        System.out.println("Der Betrag " + (int) value + "€ wurde erfolgreich eingezahlt");
        System.out.println("Kontostand: " + (int) this.kontostand + "€");
    }

    public void auszahlen(double value) {
        if (value == 0) {
            System.out.println("Bitte geben Sie einen Betrag größer als 0 ein");
            return;
        }

        this.kontostand -= value;
        System.out.println("Der Betrag " + (int) value + "€ wurde erfolgreich ausgezahlt");
        System.out.println("Kontostand: " + (int) getKontostand() + "€");
    }

    public double getKontostand() {
        return this.kontostand;
    }
}
