/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorautocomplete;

import java.util.Arrays;

/**
 *
 * @author vxvit
 */
public class VetorAutoComplete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int v[] = new int[20];
        //preenche todas as posições com o valor 0 
        Arrays.fill(v, 0);
        
        for (int valor : v){
            System.out.print(valor + " ");
        }
    }
    
}
