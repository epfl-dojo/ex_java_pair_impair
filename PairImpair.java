/*
 * Dans ce programme il faut inviter l'utilisateur à entrer un nombre.
 * Ensuite il faut lui dire si ce nombre est pair ou impair et positif ou négatif.
 */
package pairimpair;

import java.util.*;

/**
 *
 * @author Dojo 26.08.2016
 */
public class PairImpair {

    public static void main(String[] args) {
        // Déclaration des variables
        int entrée = 0;

        // Demander un nombre
        System.out.println("Veuillez entrer un nombre entier");

        // Récupérer le nombre
        Scanner scan = new Scanner(System.in);
        entrée = scan.nextInt();
        System.out.println(parite(entrée) + ", " + positifOuNegatif(entrée) + " et " + couleurNombre(entrée));

    }

    private static String couleurNombre(int nombre) {
        Integer[] black = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35};
        Integer[] red = {1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36};

        if (Arrays.asList(black).indexOf(nombre) > -1) {
            return "black";
        } else if (Arrays.asList(red).indexOf(nombre) > -1) {
            return "red";
        } else {
            return "green";
        }
    }

    private static String parite(int nombre) {
        return (nombre % 2) == 0 ? "pair" : "impair";
    }

    private static String positifOuNegatif(int nombre) {
        return (nombre < 0) ? "négatif" : "positif";
    }
}
