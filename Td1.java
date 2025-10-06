
/**
 * La classe associée au TD1 sur les affectations et tests.
 */
import java.util.Scanner;

public class Td1 {

    /**
     * Un scanner pour lire les valeurs au claver
     */
    static Scanner sc = new Scanner(System.in);

    /**
     * La méthode principale (main). Décommenter l'exercice à tester.
     *
     * @param args
     */
    public static void main(String[] args) {
        exo8();

    }

    /**
     * L'exercice 2 :
     */
    static void exo2() {
        System.out.println("Entrer 2 entiers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }

    /**
     * L'exercice 3 :
     */
    static void exo3() {
        System.out.println("Entrer 3 entiers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int e = a;
        a = b;
        b = c;
        c = e;

        System.out.println(a + " " + b + " " + c);

    }

    /**
     * L'exercice 4 :
     */
    static void exo4() {
        System.out.println("Entrer 3 entiers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int rep = 0;

        if ((a > b) && (a > c)) {
            rep = a;
        } else if ((b > a) && (b > c)) {
            rep = b;
        } else if ((c > b) && (c > a)) {
            rep = c;
        }
        System.out.println("le plus grand nombre est " + rep);

    }

    /**
     * L'exercice 5 :
     */
    static void exo5() {
        System.out.println("Entrer 3 entiers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp;

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }

        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println("Ordre décroissant : " + a + " " + b + " " + c);
    }

    /**
     * L'exercice 6 :
     */
    static void exo6() {
        System.out.println("Entrer une note sur 20 :");
        double note = sc.nextDouble();

        if (note < 10) {
            System.out.println("Mention : recalé");
        } else if (note < 12) {
            System.out.println("Mention : passable");
        } else if (note < 14) {
            System.out.println("Mention : assez bien");
        } else if (note < 16) {
            System.out.println("Mention : bien");
        } else {
            System.out.println("Mention : très bien");
        }
    }

    /**
     * L'exercice 7 :
     */
    static void exo7() {
        int a = sc.nextInt();
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        if (a >= 20) {
            b = a / 20;
            a = a % 20;
        }
        if (a >= 10) {
            c = a / 10;
            a = a % 10;
        }
        if (a >= 5) {
            d = a / 5;
            a = a % 5;
        }
        if (a >= 2) {
            e = a / 2;
            a = a % 2;
        }
        


        System.out.println("On a " + b + " fois 20 " + " on a " + c + " fois 10" + " on a " + d + "fois 5 " + "on a " + e + " fois 2 " + " on a " + a + " fois 1");
    }

    /**
     * L'exercice 8 :
     */
 static void exo8() {
    System.out.println("Entrer le ticket (6 chiffres) :");
    int a = sc.nextInt();

    int premiers = a / 1000;
    int derniers = a % 1000;

    int sommePremiers = (premiers / 100) + ((premiers / 10) % 10) + (premiers % 10);
    int sommeDerniers = (derniers / 100) + ((derniers / 10) % 10) + (derniers % 10);

    if (sommePremiers == sommeDerniers) {
        System.out.println("Ticket chanceux !");
    } else {
        System.out.println("Pas chanceux.");
    }
}


}
