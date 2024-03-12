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

public class MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número de alunos
        System.out.print("Digite o número de alunos: ");
        int numeroAlunos = scanner.nextInt();

        // Cria um vetor (array) para armazenar as notas dos alunos
        double[] notas = new double[numeroAlunos];

        // Utiliza um loop for para solicitar as notas de cada aluno e armazená-las no vetor
        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcula a média das notas
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        double media = somaNotas / numeroAlunos;

        // Exibe a média das notas na tela
        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}

