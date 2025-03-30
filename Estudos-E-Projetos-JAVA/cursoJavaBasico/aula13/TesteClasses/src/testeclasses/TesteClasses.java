/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeclasses;

import java.util.*;
import testeclasses.Personagem;

/**
 *
 * @author vxvit
 */
public class TesteClasses {

    public static final Personagem HERO = new Personagem("Super-Homem", "clarck Kent");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nome do heroi: " + HERO.nome);
        System.out.println("Identidade secreta: " + HERO.identidade);
    }

}
