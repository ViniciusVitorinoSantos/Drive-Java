package javapooaula04;

public class Caneta {

    //ATRIBUTOS
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    //METODO CONSTRUTOR
    Caneta(String m, String c, float p) {
        
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();

    }

   

    //GETTERS 
    public String getModelo() {
        return this.modelo;
    }

    public float getPonta() {
        return this.ponta;
    }

    public String getCor() {
        return this.cor;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    //SETTERS
    public void setModelo(String m) {
        this.modelo = m;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void setTampada(boolean t) {
        this.tampada = t;
    }

    //==================================
    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    //==================================
    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("A Cor da caneta é " + this.cor);
        System.out.println("A caneta esta tampada  " + this.tampada);

    }
}
