package PI1.Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Desenvolver um programa para exibição por console os n primeiros números naturais que
        // têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai informar pelo
        // console.
        // Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
        // números naturais que tenham pelo menos 2 dígitos terminados em 3 no console. Neste
        // caso, a saída será: 33, 133 , 233, 303, 313.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com n: ");
        int n = scanner.nextInt();

        System.out.print("Entre com m: ");
        int m = scanner.nextInt();

        int d = 10;
        while (d < 0 || d > 9) {
            System.out.print("Entre com d [0-9]: ");
            d = scanner.nextInt();
        }

        System.out.println(
                "Imprimindo os " + n +
                " primeiros números com " + m +
                " dígitos " + d);

        int contador = 1;
        int numero = 0;

        char charD = Integer.toString(d).charAt(0);

        while (contador <= n) {
            String strNum = Integer.toString(numero);

            long countDigitos = strNum.chars().filter(ch -> ch == charD).count();

            if (countDigitos == m) {
                System.out.println(numero);
                contador++;
            }
            numero++;

        }

    }
}
