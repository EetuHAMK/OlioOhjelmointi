package App;

import java.util.ArrayList;
import java.util.Scanner;
import Data.Kala;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Kala> kalat = new ArrayList<>();

        while (uusiKala()) {
            Kala k = new Kala(0, null, 0, 0);
            kysyKalanTiedot(k);
            kalat.add(k);
        }

        tulosta(kalat);
    }

    private static boolean uusiKala() {
        System.out.print("Uusi (k/e):");
        String s = sc.nextLine();
        
        if (s.length() > 0 && s.charAt(0) == 'k') {
            return true;
        }
        
        return false;
    }

    private static void kysyKalanTiedot(Kala k) {
        System.out.print("Syötä kalan laji: ");
        k.setLaji(sc.nextLine());

        System.out.print("Syötä kalan pituus (cm): ");
        int pituus = sc.nextInt();
        k.setPituus(pituus);

        System.out.print("Syötä kalan paino (kg): ");
        double paino = sc.nextDouble();
        k.setPaino(paino);

        sc.nextLine();
    }

    private static void tulosta(ArrayList<Kala> lista) {
        System.out.println("Kaikki kalat:");
        for (Kala kala : lista) {
            System.out.println("Laji: " + kala.getLaji());
            System.out.println("Pituus: " + kala.getPituus() + " cm");
            System.out.println("Paino: " + kala.getPaino() + " kg");
            System.out.println();
        }
    }
}
