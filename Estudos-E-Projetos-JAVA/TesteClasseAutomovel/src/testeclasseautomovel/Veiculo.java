package testeclasseautomovel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author vxvit
 */
public class Veiculo {
//ATRIBUTOS PRIVADOS (ENCAPSULAMENTO)

    private int id;
    private String placa;
    private String cor;
    private String modelo;
    private double consumo;
    private boolean manutencao;
    private String localizacao;

    //CONSTRUTOR
    public Veiculo(int id, String placa, String cor, String modelo, double consumo, boolean manutencao, String localizacao) {
        this.id = id;
        this.placa = placa;
        this.cor = cor;
        this.modelo = modelo;
        setConsumo(consumo);// Usa o set para validação
        this.manutencao = manutencao;
        this.localizacao = localizacao;
    }

    //METODO GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public boolean getManutencao() {
        return manutencao;
    }

    public String getLocalicacao() {
        return localizacao;
    }

    //SETTER COM VALIDAÇÃO
    public void setConsumo(double consumo) {
        if (consumo > 0) {
            this.consumo = consumo;
        } else {
            System.out.println("Erro: O consumo deve ser maior que zero.");
        }
    }

    //MÉTODOO PARA CALCULAR O CONSUMO DE COMBUSTIVEL
    public double calcularConsumo(double distancia) {
        if (distancia <= 0) {
            System.out.println("Erro: A distância deve ser positiva.");
            return 0;
        }
        return distancia / this.consumo;
    }

    /*
    //METODOS PARA EXIBIR OS STATUS DO VEICULO
    public void exibirStatus() {
        System.out.println("ID" + this.id);
        System.out.println("Placa " + this.placa);
        System.out.println("Cor " + this.cor);
        System.out.println("Modelo " + this.modelo);
        System.out.println("Status " + this.status);
        System.out.println("Em manutenção " + (this.manutencao ? "SIM" : "NÃO"));
        System.out.println("Localização " + this.localizacao);
    }
     */
 /*
    //METODOS PARA EXIBIR OS STATUS DO VEICULO
    @Override
    public String toString() {
        return String.format("ID: %d | Placa: %s | Modelo: %s | Cor: %s | Consumo: %.1f km/l | Manutenção: %s | Localização: %s",
                id, placa, modelo, cor, consumo, (manutencao ? "Sim" : "Não"), localizacao);
    }
     */
 /*
    // Método toString() para exibir as informações do veículo de forma mais prática
    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", consumo=" + consumo +
                ", status='" + status + '\'' +
                ", manutencao=" + (manutencao ? "Sim" : "Não") +
                ", localizacao='" + localizacao + '\'' +
                '}';
    
     */
    //METODOS PARA EXIBIR OS STATUS DO VEICULO
    @Override
    public String toString() {
        return String.format("""
        ============================
        🚗 ID: %d  
        🔹 Placa: %s  
        🔹 Modelo: %s  
        🔹 Cor: %s  
        ⛽ Consumo: %.1f km/l  
        🛠 Manutenção: %s  
        📍 Localização: %s  
        ============================
        """, id, placa, modelo, cor, consumo, (manutencao ? "Sim" : "Não"), localizacao);
    }

}
