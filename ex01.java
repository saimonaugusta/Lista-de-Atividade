package ex01;
import java.util.Scanner;

import javax.xml.transform.Source;

public class ex01{
    public static void main(String[] args)

        Scanner ler = new Scanner(System.in);{

        float h, b, B, area;

        System.out.println("Digite a altura do trapézio: ");
        h = ler.nextFloat();
        System.out.println("Digite o comprimento da base menor do trapézio: ");
        b = ler.nextFloat();
        System.out.println("Digite o comprimento da base maior do trapézio: ");
        B = ler.nextFloat();

        area = (h * (b + B)) / 2;

        System.out.println("A área deste trapézio é de: " + area + " CM");
    }
}