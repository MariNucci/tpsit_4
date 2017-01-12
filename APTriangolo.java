/*
 Nucci Maria 4inB 12.01.2017
 TESTO: Calcolare area e perimetro di un triangolo scaleno prendendo in input i dati
 */
package aptriangolo;

import java.util.Scanner;

public class APTriangolo {

    public static void main(String[] args) {
        int lato1, lato2, base, altezza;
        int perimetro;
        float area;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println(">lunghezza lato1: ");
            lato1 = input.nextInt();
        } while (lato1 <= 0);
        do {
            System.out.println(">lunghezza lato2: ");
            lato2 = input.nextInt();
        } while (lato2 <= 0);
        do {
            System.out.println(">lunghezza base: ");
            base = input.nextInt();
        } while (base <= 0);
        do {
            System.out.println(">lunghezza altezza: ");
            altezza = input.nextInt();
        } while (altezza <= 0);
        if((lato1+lato2)>base) System.out.println("ERRORE!");
        if((lato2+base)>lato1) System.out.println("ERRORE!");
        if((lato1+base)>lato2) System.out.println("ERRORE!");
        perimetro = lato1 + lato2 + base;
        area = (base * altezza) / 2;
        System.out.println("PERIMETRO= " + perimetro);
        System.out.println("AREA= " + area);
    }

}