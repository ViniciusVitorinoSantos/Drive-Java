/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapooaula05;

/**
 *
 * @author vxvit
 */
public class ContaBanco {

    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //METODOS
    
     public void estadoAtual() {
         System.out.println("-----------------------------");
         System.out.println("Conta: "  + this.getNumConta());
         System.out.println("Tipo: " + this.getTipo());
         System.out.println("Dono: " + this.getDono());
         System.out.println("Saldo: " + this.getSaldo());
         System.out.println("Status: " + this.getStatus());
         System.out.println("-----------------------------");
         
    }
    
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            //this.saldo = 50f; diretamente atuando no atributo;
            this.setSaldo(50f); // utilizando o metodo set para alterar o atributo;
        } else if ("CP".equals(t)) {
            //this.saldo = 150f;
            this.setSaldo(150f);
            
        }
        System.out.println("Conta aberta com sucesso ! ");
    }
    
    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada pois ainda tem saldo ! ");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem debitos ! ");
        } else {
            this.setStatus(!true);
            System.out.println("Conta fechada com sucesso ! ");
        }
    }
    
    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossivle depositar em uma conta fechada ! ");
        }
    }
    
    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono() + "no valor de " + v);
            } else {
                System.out.println("Saldo insuficiente ! ");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada !");
        }
    }
    
    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono() + " no valor de " + v);
        }else{
            System.out.println("Impossível pagar uma conta fechada ! ");
        }
    }

    //Metodos especiais↓
    //CONSTRUTOR
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(!true);
    }

    //GETTERS
    public int getNumConta() {
        return this.numConta;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public String getDono() {
        return dono;
    }
    
    public float getSaldo() {
        return saldo;
    }

    /**
     * Todo metodo que trabalha com booleano em java retorna (is) então estava
     * (isStatus) alterei para get por conta do aprendizado.
     *
     * @return
     */
    public boolean getStatus() {
        return status;
    }

    //SETTERS
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
   
    
}
