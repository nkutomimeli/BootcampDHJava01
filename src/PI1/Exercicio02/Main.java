package PI1.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Desenvolva um programa para mostrar os primeiros n números múltiplos
        // de m, sendo n e m valores que o usuário irá inserir via console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com n: ");
        int n = scanner.nextInt();

        System.out.println("Entre com m: ");
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i*m);

        }

    }
}


