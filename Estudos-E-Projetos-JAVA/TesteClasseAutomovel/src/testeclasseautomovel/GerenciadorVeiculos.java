/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testeclasseautomovel;

import java.util.*;

/**
 * @author Vinicius Vitorino
 * @since 2025
 * @version 0.0.1
 */
public class GerenciadorVeiculos {

    private static ArrayList<Veiculo> frota = new ArrayList<>();
    private static int idAtual = 1;
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //CRIANDO O MENU INICIAL DO PROGRAMA
        int opcao;
        do {
            //EXIBE AS OPÇÕES INICIAIS DO PROGRAMA
            System.out.println("\n====MENU====");
            System.out.println("1 - Cadastrar veículo ");
            System.out.println("2 - Exibir veículos cadastrados ");
            System.out.println("3 - Calcular consumo de combustível ");
            System.out.println("4 - Sair ");
            System.out.print("Escolha uma opção: ");
            //RECEBE A ENTRADA E JOGA NA VARIÁVEL OPCAO
            opcao = entrada.nextInt();
            entrada.nextLine();//LIMPA O BUFFER
            /** DETERMINA A ESCOLHA DO USUÁRIO*/
            //DETERMINA A ESCOLHA DO USUÁRIO
            switch (opcao) {

                case 1:
                    cadastrarVeiculo();
                    break;
                case 2:
                    listarVeiculos();
                    break;
                case 3:
                    calcularConsumo();
                    break;
                case 4:
                    System.out.println("Saindo . . . ");
                    break;
                default:
                    System.out.println("Opção invalida. Tente novamente!");
                    break;

            }

        } while (opcao != 4);

    }

    //METODO PARA CADASTRAR VEICULO
    private static void cadastrarVeiculo() {
        System.out.print("Digite a placa do veículo : ");
        String placa = entrada.nextLine();
        System.out.print("Digite a cor do veículo : ");
        String cor = entrada.nextLine();
        System.out.print("Digite o modelo do veiculo : ");// O ideal seria um outro menu com os modelos cadastrados
        String modelo = entrada.nextLine();
        System.out.print("Digite o consumo do veículo (Km/l): ");
        double consumo = entrada.nextDouble();
        entrada.nextLine(); //LIMPA O BUFFER
        System.out.println("O veículo está em manutenção (s/n)");
        boolean manutencao = entrada.nextLine().equalsIgnoreCase("s");
        System.out.print("digite a localização do veículo : ");
        String localizacao = entrada.nextLine();

        Veiculo novoVeiculo = new Veiculo(idAtual++, placa, cor, modelo, consumo, manutencao, localizacao);
        frota.add(novoVeiculo);
        System.out.println("✅ Veículo cadastrado com sucesso!");

    }

    //MÉTODO PARA LISTAR VEICULOS CADASTRADOS
    private static void listarVeiculos() {
        if (frota.isEmpty()) {
            System.out.println("⚠ Nenhum veículo cadastrado.");
            return;
        }
        System.out.print("\n===== VEÍCULOS CADASTRADOS =====");
        for (Veiculo v : frota) {
            System.out.println(v);
        }
    }
    
    //MÉTODO PARA CALCULAR O CONSUMO DE COMBUSTIVEL
    private static void calcularConsumo(){
        if(frota.isEmpty()){
            System.out.println("⚠️ Nenhum veículo cadastrado ! ");
            return;
        }
        System.out.print("Digite o ID do veículo escolhido : ");
        int id = entrada.nextInt();
        entrada.nextLine();
        
        Veiculo veiculoEscolhido = null;
        for(Veiculo v : frota){
            if(v.getId() == id){
                veiculoEscolhido = v;
                break;
            }
        }
        if(veiculoEscolhido == null){
            System.out.println("⚠ Veículo não encontrado !️");
            return;
        }
        
        System.out.println("Digite a distância percorrida (Km) : ");
        double distancia = entrada.nextDouble();
        
        double combustivelGasto = veiculoEscolhido.calcularConsumo(distancia);
        System.out.printf("🚗 O veículo %s gastará aproximadamente %.2f Litros \n ",veiculoEscolhido.getModelo(),combustivelGasto);
    }
    
}
