/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vxvitevilcorp.operadorternario;

import java.util.Scanner;

/**
 *
 * @author vxvit
 */
public class OperadorTernario {

    public static void main(String[] args) {
        Scanner entTec = new Scanner(System.in);
        System.out.println("Digite um número:");
        int n1 = entTec.nextInt();
        System.out.println("Digite outro número:");
        int n2 = entTec.nextInt();
        int maior = (n1>n2)?n1:n2;
        System.out.println("O maior número é: "+ maior);
        int menor = Math.min(n1, n2);
        System.out.println("O menor número é " + menor );
    }
}
