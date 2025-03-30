/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.vxvitevilcorp.testeboolean;

/**
 *
 * @author vxvit
 */
public class TesteBoolean {

    public static void main(String[] args) {
        boolean val1 = (4 >= 5), val2 = (4 < 4), val3 = (val1 == val2);
        boolean val4 = val1 ^ val3;
        boolean val5 = !val2 && val4;
        System.out.println(val4 + " " + val5);
    }
}
