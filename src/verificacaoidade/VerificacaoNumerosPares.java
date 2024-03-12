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
public class VerificacaoNumerosPares {

    public static void main(String[] args) {
        // Utiliza a estrutura de repetição for para iterar sobre os números no intervalo de 1 a 100
        for (int numero = 1; numero <= 100; numero++) {
            // Verifica se cada número é par
            if (numero % 2 == 0) {
                // Se o número for par, exibe-o na tela
                System.out.println(numero);
            }
        }
    }
}

