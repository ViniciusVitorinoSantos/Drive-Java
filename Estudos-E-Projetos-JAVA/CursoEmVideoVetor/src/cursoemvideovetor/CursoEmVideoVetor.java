/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursoemvideovetor;

/**
 *
 * @author vxvit
 */
public class CursoEmVideoVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String s = "CURSOEMVIDEO";
        char r[] = new char[12];  
        for(int c=s.length()-1; c>=0; c--){
            r[c] = s.charAt(c);
        }
        for(char l : r){
        System.out.print(l + " ");
    }
    }
    
}
