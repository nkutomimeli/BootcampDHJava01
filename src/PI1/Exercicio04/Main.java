package PI1.Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Desenvolva um programa para mostrar no console os primeiros n números
        // primos entre 1 e m, sendo m um valor que o usuário irá inserir pelo console.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com n: ");
        int n = scanner.nextInt();

        System.out.print("Entre com m: ");
        int m = scanner.nextInt();

        int contador = 1;
        int numero = 1;

        while (contador <= n && numero <= m) {

            if (ehPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
        System.out.println("Fim da lista de primos.");

    }

    public static boolean ehPrimo(int num) {

        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0 && num != i) {
                    return false;
                } else if (num == i) {
                    return true;
                }
            }
        }
        return false;
    }

}
