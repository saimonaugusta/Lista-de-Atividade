import java.util.Scanner;

public class ex05_pg33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salario, horas;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = input.nextFloat();

        salario = (horas * 10.25);

        System.out.println("Seu salário a receber é de: R$" + salario);
        if (salario < 50) {
            System.out.println("Atenção, dirija-se à direção do hotel!");
        }
    }
}
