/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.vxvitevilcorp.exercicio2aula08;

/**
 *
 * @author vxvit
 */
public class Exercicio2Aula08 {

    public static void main(String[] args) {
        String parte1 = "Curso";
        String parte2 = "Video";
        String parte3 = parte1 + parte2;
        String parte4 = "CursoVideo";
        System.out.println(parte3 == parte4);
        System.out.println(parte3.equals(parte4));// .equals testa se o conteúdo dos objetos sring são inguais
    }
}
