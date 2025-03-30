/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exmetodosaula15;

/**
 *
 * @author vxvit
 */
public class ExMetodosAula15 {

    static int f1(int n) {
        return n%2; 
    }
    static int f2(int n){
        return n*2;
    }
    static int f3(int a, int b){
        return a+b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(f3(f1(3),f2(5)));
    }
    
}
