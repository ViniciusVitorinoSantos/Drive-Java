/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastropet;

import java.util.*;

/**
 *
 * @author vxvit
 */
public class CadastroPet {

    private static ArrayList<Animal> fazenda = new ArrayList<>();
    private static int idAtual = 1;
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
      
        //CRIANDO O MENU INICIAL DO PROGRAMA
        int opt;
        do {
            
            //EXIBE AS OPÇÕES INICIAS DO PROGRAMA
            System.out.println("\n========MENU========");
            System.out.println(" 1 - Cadastrar novo animal ");
            System.out.println(" 2 - ver animais cadastrados ");
            System.out.println(" 3 - Sair");
            System.out.print(" Escolha uma opção: ");
            
            //RECEBE A ENTRADA E JOGA NA VARIÁVEL OPt
            opt = entrada.nextInt();
            entrada.nextLine();//LIMPA O BUFFER

            //DETERMINA A ESCOLHA DO USUÁRIO
            switch (opt) {
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
                    break;
                    
            }

        } while (opt != 3);
    }

    //MÉTODO PARA CADASTRAR ANIMAIS
    private static void cadastrarAnimal() {
        System.out.print("Digite o tipo do animal :");
        String tipo = entrada.nextLine();
        System.out.print("Digite a cor do animal :");
        String cor = entrada.nextLine();
        System.out.print("Digite o sexo do animal (M/F):");
        String entradaSexo = entrada.nextLine().trim().toUpperCase();//→ Remove espaços extras e coloca tudo em maiúsculas.
        String sexo = entradaSexo.equals("M")? "Macho" : entradaSexo.equals("F") ? "Fêmea" : "indefinido";
        System.out.print("Digite o som do animal :");
        String som = entrada.nextLine();

        Animal novoAnimal = new Animal(idAtual++, tipo, cor, sexo, som);
        fazenda.add(novoAnimal);
        System.out.println("✅ Animal  cadastrado com sucesso!");
    }

    private static void listarAnimais() {
        if (fazenda.isEmpty()) {
            System.out.println("⚠ Nenhum animal cadastrado.");
            return;
        }
        System.out.print("\n===== ANIMAIS CADASTRADOS =====");
        for (Animal a : fazenda) {
            System.out.println(a);
        }
    }

    private static void toUppercase() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
