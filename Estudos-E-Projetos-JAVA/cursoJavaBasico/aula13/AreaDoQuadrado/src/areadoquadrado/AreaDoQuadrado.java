/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areadoquadrado;

import java.util.*;

/**
 *
 * @author vxvit
 */


public class AreaDoQuadrado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado = 0;

        // Loop principal para continuar pedindo entradas até o usuário decidir sair
        do {
            try {
                // Solicita a entrada do valor do lado do quadrado
                System.out.print("Digite o valor do lado do quadrado: ");
                String valorEntrada = entrada.nextLine(); // Lê a entrada como String

                // Verifica se a entrada contém ponto (.) e avisa o usuário
                if (valorEntrada.contains(".")) {
                    System.out.println("Por favor, utilize vírgula (,) ao invés de ponto (.) para valores decimais.");
                    continue; // Reinicia o loop e pede a entrada novamente
                }

                // Converte a entrada para double, trocando a vírgula por ponto para o formato correto
                lado = Double.parseDouble(valorEntrada.replace(",", "."));

                if (lado <= 0) {
                    System.out.println("Erro: O valor do lado deve ser positivo.");
                    continue; // Reinicia o loop e pede novamente a entrada
                }

                // Calcula a área e o dobro da área
                double area = Math.pow(lado, 2); // Área do quadrado
                double dobroArea = area * 2;    // Dobro da área

                // Exibe o resultado
                System.out.println("O dobro da área do quadrado indicado é " + dobroArea);

                // Pergunta se o usuário deseja continuar
                System.out.print("Deseja continuar? (s/n): ");
                String resposta = entrada.nextLine(); // Lê a resposta do usuário

                // Se a resposta for 'n' ou 'N', encerra o loop
                if (!resposta.equalsIgnoreCase("s")) {
                    break; // Sai do loop principal
                }

            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
            }

        } while (true); // O loop continuará até o usuário escolher sair

        entrada.close();
    }
}
