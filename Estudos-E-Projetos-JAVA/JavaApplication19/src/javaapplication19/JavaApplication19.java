/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author vxvit
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print(" Digite um número para verificar se é par ou impar  ");
        int valor = tec.nextInt();
        int res = (valor%2);
        String parImpar = (res == 0 )?"par":"impar";
        System.out.println(parImpar);
    }
    
}
