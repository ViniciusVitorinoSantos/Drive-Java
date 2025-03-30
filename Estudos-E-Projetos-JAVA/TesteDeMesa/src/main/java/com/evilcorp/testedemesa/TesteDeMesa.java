/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.evilcorp.testedemesa;

/**
 *
 * @author vxvit
 */
public class TesteDeMesa {

    public static void main(String[] args) {
        int i = 1;
        int a = 0;
        while(i < 10){
            ++a;
            i = i + 1;
            if (a > 6){
                ++i;
            }
            System.out.println("i = " + i);
            System.out.println("a = " + a);
        }
    }
}
