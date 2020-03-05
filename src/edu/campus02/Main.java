package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int ersteGanzzahl;
        int zweiteGanzzahl;
        boolean bedingung;

        ersteGanzzahl = 1;
        zweiteGanzzahl = 2;

        bedingung = ersteGanzzahl < zweiteGanzzahl;

        if (bedingung) {
            System.out.println("Die Bedingung ist wahr!");
        } else {
            System.out.println("Die Bedingung ist falsch!");
        }

        int preis = 200;
        double steuersatz = 0.05;
        double maxSteuersatz = 0.04;
        boolean ergebnis = steuersatz > maxSteuersatz;

        if (ergebnis) {
            System.out.println("Warnung! Der tatsächliche Steuersatz überschreitet den Maximalwert!");
        } else {
            System.out.println("OK");
        }

        //Beispiel 2
        int ersteZahl, zweiteZahl, dritteZahl, vierteZahl;
        ersteZahl = 1;
        zweiteZahl = 2;
        dritteZahl = 3;
        vierteZahl = 4;

        if (ersteZahl ==2) {
            System.out.println("Erste!");
        } else if (zweiteZahl == 2) {
            System.out.println("Zweite!");
        } else if (dritteZahl == 2) {
            System.out.println("Dritte!");
        } else if (vierteZahl == 2) {
            System.out.println("Vierte!");
        } else {
            System.out.println("Keine!");
        }

        //bruttopreis Berechnungs-Methode erstellen
        int netto;
        double steuer;

        double brPreis;
        brPreis = bruttoPreis(18, 0.04);
        System.out.println("Ergebnis: " + brPreis);

        double brPreis1;
        brPreis1 = bruttoPreis(200, 0.08);
        System.out.println("Bruttopreis: " + brPreis1);

        double brPreis3 = bruttoPreis(390, 016);
        System.out.println("Bruttopreis:" + brPreis3);



    }

    public static double bruttoPreis (int netto, double steuer) {
        double ergebnis;
        ergebnis = netto + netto*steuer;
        return ergebnis;


    }
}
