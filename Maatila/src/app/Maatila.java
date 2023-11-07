package app;

import java.util.Scanner;
import data.Traktori;

public class Maatila {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Traktori[] taulu = new Traktori[3];

        for (int i = 0; i < taulu.length; i++){
            taulu[i] = lueTraktori();
        }
        tulosta(taulu);
    }
    public static void tulosta(Traktori[] taulu){
        for (Traktori x:taulu){
            System.out.println(x);
        }
    }

    public static Traktori lueTraktori(){
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Merkki: ");
        String me = sc.nextLine();
        System.out.print("Malli: ");
        String ma = sc.nextLine();
        System.out.print("Teho: ");
        String hepat = sc.nextLine();
        Traktori t = new Traktori(id, me, ma, hepat);
        return t;
    }
}
