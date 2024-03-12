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

public class TabuadaInterativa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Inicializa a variável de controle
        int i = 1;

        // Utiliza a estrutura de repetição while para calcular e exibir a tabuada
        while (i <= 10) {
            int resultado = numero * i;

            // Exibe cada multiplicação na forma "número * i = resultado"
            System.out.println(numero + " * " + i + " = " + resultado);

            // Incrementa a variável de controle
            i++;
        }

        scanner.close();
    }
}

