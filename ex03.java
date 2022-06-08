package ex03;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Integer a, b, c, d;

        a = (3 - 2 - 1 + 2 + 1 + 3);
        b = (2 * 3 - 4 * 5);
        c = (2 + 6 - 3 / 7 * 9);
        d = (3 % 4 - 8);

        System.out.println("************************");

        System.out.println("(3 - 2 - 1 + 2 + 1 + 3);");

        System.out.println("O Resultado de A: " + a);

        System.out.println("************************");

        System.out.println("2 * 3 - 4 * 5");

        System.out.println("O Resultado de A: " + b);

        System.out.println("************************");

        System.out.println("2 + 6 - 3 / 7 * 9");

        System.out.println("Resultado de A: " + c);

        System.out.println("************************");

        System.out.println("3 % 4 - 8 ");

        System.out.println("O Resultado de A: " + d);

        System.out.println("************************");

    }
}