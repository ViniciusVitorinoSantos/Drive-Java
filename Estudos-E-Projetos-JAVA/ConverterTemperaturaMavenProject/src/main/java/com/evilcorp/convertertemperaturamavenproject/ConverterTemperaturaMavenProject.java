/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.evilcorp.convertertemperaturamavenproject;
//Importamos InputMismatchException e Scanner que são classes da biblioteca Java. Scanner é usado para ler entradas do usuário, enquanto InputMismatchException lida com entradas inválidas.
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lê a entrada do usuário até obter um valor numérico válido.
 * Converte esse valor de Fahrenheit para Celsius.
 * Mostra o resultado.
 *  Pergunta ao usuário se ele quer continuar.
 *
 * @author vxvit
 * @version 0.1
 */
public class ConverterTemperaturaMavenProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;//do { ... } while (continuar);: Um loop do-while que continua até o usuário decidir parar.
        double fah = 0;//Variável para armazenar a temperatura em Fahrenheit.
        do {
            boolean validarEntrada = false;//do { ... } while (!validarEntrada);: Um loop do-while que pede a entrada do usuário até que uma entrada válida seja fornecida.
            do {
                System.out.print("Digite o valor em fahrenheit ºF :");//Solicita que o usuário insira um valor em Fahrenheit.
                
                //try { ... } catch (NumberFormatException e) {...}: Um bloco try-catch para tentar converter a entrada do usuário para um número. Se a entrada não for um número válido, uma exceção é lançada.
                try {
                    String entrada = sc.next().replace(",", ".");//String entrada = sc.next().replace(",", ".");: Lê a entrada do usuário como uma string e substitui vírgulas por pontos.
                    fah = Double.parseDouble(entrada);//fah = Double.parseDouble(entrada);: Converte a string para um número double.
                    validarEntrada = true;//validarEntrada = true;: Define que a entrada é válida, o que faz o loop terminar.
                } catch (NumberFormatException e) {//catch (NumberFormatException e) { ... }: Se a entrada não for válida, uma mensagem de erro é mostrada e o scanner é limpo.
                    System.out.println("Digite somente valores numéricos ");
                    sc.next();//LIMPA ENTRADA INVALIDA
                }
            } while (!validarEntrada);
            double cel = (fah - 32) / 1.8;//double cel = (fah - 32) / 1.8;: Converte a temperatura de Fahrenheit para Celsius.
            System.out.println("A temperatura em graus Celcius ºC é " + cel);//System.out.println("A temperatura em graus Celsius ºC é " + cel);: Exibe o resultado da conversão.

            System.out.println("Deseja continuar (s/n");//System.out.println("Deseja continuar (s/n):");: Pergunta se o usuário deseja continuar.
            String resposta = sc.next();//String resposta = sc.next();: Lê a resposta do usuário.
            continuar = resposta.equalsIgnoreCase("s");//continuar = resposta.equalsIgnoreCase("s");: Define a variável continuar como true se a resposta for "s".
        } while (continuar);

    }
}
