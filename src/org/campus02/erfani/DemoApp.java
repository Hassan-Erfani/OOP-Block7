package org.campus02.erfani;

public class DemoApp {
    public static void main(String[] args) {

        // Konto() test
       /* Konto konto = new Konto("Susi");

        konto.einzahlen(0);
        konto.einzahlen(1000);

        konto.auszahlen(0);
        konto.auszahlen(9000);*/

        // GiroKonto() test
      /*  GiroKonto giroKonto = new GiroKonto("Max", 500);

        giroKonto.einzahlen(600);

        giroKonto.auszahlen(100);
        giroKonto.auszahlen(200);
        giroKonto.auszahlen(400);*/

        // JugendGiroKonto() test
        JugendGiroKonto jugendGiroKonto = new JugendGiroKonto("John", 1000, 100);

        jugendGiroKonto.einzahlen(400);

        jugendGiroKonto.auszahlen(100);
        jugendGiroKonto.auszahlen(1);
        jugendGiroKonto.auszahlen(101);
    }
}
