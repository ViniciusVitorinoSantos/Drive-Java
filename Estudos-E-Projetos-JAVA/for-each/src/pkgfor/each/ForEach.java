/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfor.each;

import java.util.Arrays;

/**
 *
 * @author vxvit
 */
public class ForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = {3, 5, 1, 8, 4};
        
        //=========================================
        //colocando vetor em ordem
        //Arrays.sort(num);
        //=========================================
        
        //for-each
        for(int valor : num){
            System.out.print(valor + " ");
        }
        
        System.out.println();
        
        //se ele não encotrar os indices no vetor o valor aparece negativo com binarySearch
        int pos = Arrays.binarySearch(num, 4);
        System.out.println(pos);
        
        
    }
    
}
