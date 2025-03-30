/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vxvitevilcorp.classmath;

import java.util.Scanner;

/**
 *
 * @author vxvit
 */
public class ClassMath {

    public static void main(String[] args) {
        System.out.println("vamos calcular a raiz quadrada");
        Scanner entradaTeclado  = new Scanner(System.in);
        System.out.println("Digite o radicando: ");
        float radicando = entradaTeclado.nextFloat();
        float resultado = (float) Math.sqrt(radicando);
        System.out.println("O resultado é " + resultado);
        double pi = Math.PI;
        System.out.println(pi);
        System.out.println("A raiz quadrada de pi é: ");
        double resPI = (double) Math.sqrt(pi);
        System.out.println(resPI);
    }
}
