package students;

import java.util.Scanner;

/**
 *
 * @author oicr1
 */
public class Myfirstprg {

    int a;
    char c;

    Myfirstprg() {
        a = 10;
        c = 'H';
    }

    Myfirstprg(int a, char c) {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Myfirstprg p1 = new Myfirstprg();
        p1.a = 20;
        System.out.println("a: " + p1.a);
        System.out.println("c: " + p1.c);

        Myfirstprg p2 = new Myfirstprg(20, 'Q');

        System.out.println(p2);

        String word;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a word:");
        word = in.next();

        char letters[] = new char[word.length()];

        for (int i = 0; i < letters.length; i++) {
            letters[i] = word.charAt(i);
            System.out.println(letters[i]);
        }

        System.out.println("");

        for (int k = letters.length - 1; k >= 0; k--) {
            System.out.println(letters[k]);
        }

    }

}
