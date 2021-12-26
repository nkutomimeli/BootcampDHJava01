package PI1.Exercicio01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Desenvolva um programa para mostrar os primeiros n números
        // pares, sendo n um valor que o usuário irá inserir pelo console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");

        int n = scanner.nextInt();

        for (int i=0; i<2*n; i+=2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
