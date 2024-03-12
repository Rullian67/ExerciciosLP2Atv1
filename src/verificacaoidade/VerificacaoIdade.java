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

public class VerificacaoIdade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira sua idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Utiliza a estrutura condicional if e else para verificar a idade
        if (idade >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }

        scanner.close();
    }
}
