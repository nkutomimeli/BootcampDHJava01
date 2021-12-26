package PI1.Exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Desenvolva um programa para informar se um um número n é
        // primo ou não, sendo n um valor que o usuário irá inserir pelo console.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro, e diremos se é primo: ");
        int n = scanner.nextInt();

        if (n == 0 || n == 1) {
            System.out.println("O número " + n + " não é primo.");
        } else {
            for (int i = 2; i <= n ; i++) {
                if (n % i == 0 && n != i) {
                    System.out.println("O número " + n + " não é primo.");
                    break;
                } else if (n == i) {
                    System.out.println("O número " + n + " é primo.");
                }
            }
        }


    }
}
