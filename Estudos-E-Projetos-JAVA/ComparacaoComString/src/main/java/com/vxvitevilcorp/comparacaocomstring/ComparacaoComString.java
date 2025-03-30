/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.vxvitevilcorp.comparacaocomstring;

/**
 *
 * @author vxvit
 */
public class ComparacaoComString {

    public static void main(String[] args) {
        String nome1 = "Vinicius";
        String nome2 = "Vinicius";
        String nome3 = new String("Vinicius");
        String res;
        res = (nome1 == nome3)?"igual":"diferente";
        System.out.println(res);
    }
}
