/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapooaula06;

/**
 *
 * @author vxvit
 */
public class ControleRemoto implements Controlador {

    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //CONSTRUTOR
    public ControleRemoto() {
        
        volume = 50;
        ligado = true; // not true e false é a mesma coisa !
        tocando = false;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public boolean getLigado() {
        return ligado;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public boolean getTocando() {
        return tocando;
    }
    
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //METODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado ? " + this.getLigado());
        System.out.println("Está tocando ? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print(" | ");
        }
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }
    
    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Impossivle aumentar volme !");
        }
    }
    
    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Impossivel diminuir volume !");
        }
    }
    
    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    
    @Override
    public void pay() {
        if(this.getLigado() && (!this.getTocando())){
            this.setTocando(true);
        }else{
            System.out.println("Não consegui reproduzir ! ");
        }
    }
    
    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else{
            System.out.println("Não consegui pausar ! ");
        }
    }
    
}
