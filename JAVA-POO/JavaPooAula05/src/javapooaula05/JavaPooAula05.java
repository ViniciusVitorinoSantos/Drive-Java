/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapooaula05;

/**
 *
 * @author vxvit
 */
public class JavaPooAula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
       
        p1.abrirConta("CC");
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.setSaldo(300);
        p1.setTipo("CC");
        p1.setStatus(true);
        p1.pagarMensal();
        
        p1.estadoAtual();
        
        System.out.println("------------------------------");
        
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumConta(2222);
        p2.setDono("Jubileia");
        p2.setSaldo(500);
        p2.setTipo("CP");
        p2.setStatus(true);
        p2.pagarMensal();
        
        p2.estadoAtual();
    }
    
}
