/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vxvitevilcorp.numeroaleatorio;

/**
 *
 * @author vxvit
 */
public class NumeroAleatorio {

    public static void main(String[] args) {
        //Gera um número aleatório.
        double aleatorio = Math.random();
        System.out.println(aleatorio);
        
        // Gera um número aleatório entre 0 e 10
        int numAle = (int) ( Math.random() * (9 - 0));
        System.out.println(numAle);


    }
}
