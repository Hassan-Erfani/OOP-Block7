package org.campus02.erfani;

public class DemoApp {
    public static void main(String[] args) {

        // Konto() test
        Konto konto = new Konto("Susi");

        konto.einzahlen(0);
        konto.einzahlen(1000);

        konto.auszahlen(0);
        konto.auszahlen(9000);
    }
}
