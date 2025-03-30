/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcasebreak;

import java.util.Scanner;

/**
 *
 * @author vxvit
 */
public class SwitchCaseBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner(System.in);
        System.out.print(" Quantas pernas? : ");
        int pernas = tec.nextInt();
        String tipo;
        System.out.print("Isso é um(a) " );
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        
        System.out.println(tipo);
    }

}
