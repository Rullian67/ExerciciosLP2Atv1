/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificacaoidade;

/**
 *
 * @author rulli
 */
import java.util.Scanner;

public class VerificacaoNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira três números inteiros
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        // Determina o maior número
        int maior = Math.max(Math.max(numero1, numero2), numero3);

        // Exibe a mensagem indicando o maior número
        System.out.println("O maior número é " + maior);

        // Verifica se cada número é positivo, negativo ou igual a zero
        verificarSinal(numero1, "primeiro");
        verificarSinal(numero2, "segundo");
        verificarSinal(numero3, "terceiro");

        scanner.close();
    }

    // Método para verificar se um número é positivo, negativo ou igual a zero
    private static void verificarSinal(int numero, String ordem) {
        if (numero > 0) {
            System.out.println("O " + ordem + " número é positivo");
        } else if (numero < 0) {
            System.out.println("O " + ordem + " número é negativo");
        } else {
            System.out.println("O " + ordem + " número é igual a zero");
        }
    }
}

