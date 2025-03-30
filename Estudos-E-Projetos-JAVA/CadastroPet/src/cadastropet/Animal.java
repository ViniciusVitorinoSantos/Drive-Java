/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastropet;

/**
 *
 * @author vxvit
 */
public class Animal {

    //ATRIBUTOS PRIVADOS DOS ANIMAIS
    private int id;
    private String tipo;
    private String cor;
    private String sexo;
    private String som;

    //CONSTRUTOR
    public Animal(int id, String tipo, String cor, String sexo, String som) {
        this.id = id;
        this.tipo = tipo;
        this.cor = cor;
        this.sexo = sexo;
        this.som = som;
    }

//METODOS GETTER E SETTER
    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getSexo() {
        return sexo;
    }

    public String getSom() {
        return som;
    }

    //METODOS PARA EXIBIR OS STATUS DO VEICULO
    @Override
    public String toString() {
        return String.format("""
        ============================
        🖥 ID:   %d  
        🐘 tipo: %s  
        🎨 cor:  %s  
        👩‍ sexo: %s  
        🔊 som:  %s   
        ============================
        """, id, tipo, cor, sexo, som);
    }

}
