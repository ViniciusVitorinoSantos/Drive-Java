package classeanimal;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classeanimal;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author vxvit
 */

public class CadastroAnimal {

    private static ArrayList<Animal> fazenda = new ArrayList<>();
    private static int idAtual = 1;
    private Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CRIANDO O MENU INICIAL DO PROGRAMA
        int op = 0;
        do {
            //EXIBE AS OPÇÕES INICIAS DO PROGRAMA
            System.out.println("\n========MENU========");
            System.out.println(" 1 - Cadastrar novo animal ");
            System.out.println(" 2 - ver animais cadastrados ");
            System.out.println(" 3 - Sair");
            System.out.println(" Escolha uma opção ");

            switch (op) {
                case 1:
                    cadastrarAnimal();
                    break;
                case 2:
                    listarAnimais();
                    break;
                case 3:
                    System.out.println("Saindo . . .");
                    break;
                default:
                    System.out.println("Opção invalida !");

            }

        } while (op != 3);
    }

    //MÉTODO PARA CADASTRAR ANIMAIS
    private static void cadastrarAnimal() {
        System.out.println("Digite o tipo do animal : ");
        String tipoAnimal = entrada.nextLine();
        System.out.println("Digite a cor do animal : ");
        String cor = entrada.nextLine();
        System.out.println("Digite o sexo do animal : ");
        String sexo = entrada.nextLine();
        System.out.println("Qual som o animal faz : ");
        String som = entrada.nextLine();
        
        Animal novoAnimal = new Animal (idAtual++, tipo, cor, sexo, som);
       zoo.add(novoAnimal);
       System.out.println("✅ Animal cadastrado com sucesso!");
            
       
    }
    
     //MÉTODO PARA LISTAR ANIMAIS CADASTRADOS
    private static void listarVeiculos() {
        if (zoo.isEmpty()) {
            System.out.println("⚠ Nenhum animal cadastrado.");
            return;
        }
        System.out.print("\n===== ANIMAIS CADASTRADOS =====");
        Iterable<Animal> zoo = null;
        for (Animal a : zoo) {
            System.out.println(a);
        }
    }

}
