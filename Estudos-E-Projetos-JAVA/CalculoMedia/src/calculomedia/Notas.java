/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculomedia;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1 = -1;
        int num2 = -1;

        while ((num1 < 0 || num1 > 10) || (num2 < 0 || num2 > 10)) {
            System.out.print("Digite a primeira nota: ");
            num1 = teclado.nextInt();
            if (num1 < 0 || num1 > 10) {
                System.out.println("Digite uma nota entre 0 e 10");
                continue;  // Continue para pedir a nota novamente
            }

            System.out.print("Digite a segunda nota: ");
            num2 = teclado.nextInt();
            if (num2 < 0 || num2 > 10) {
                System.out.println("Digite uma nota entre 0 e 10");
                continue;  // Continue para pedir a nota novamente
            }
        }

        int res = (num1 + num2) / 2;

        System.out.println("A média é: " + res);
    }
}



