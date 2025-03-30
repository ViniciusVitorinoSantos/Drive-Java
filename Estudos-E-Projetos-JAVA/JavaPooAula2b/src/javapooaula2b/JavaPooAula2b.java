package javapooaula2b;

public class JavaPooAula2b {
    
    public static void main(String[] args) {
        
       Caneta c1 = new Caneta();
       c1.modelo = "Bic";
       c1.cor = "Azul";
       c1.ponta = 0.5f;
       c1.carga = 50;
       c1.destampar();
       c1.status();
       c1.rabiscar();
       
        System.out.println("");
        
       Caneta c2 = new Caneta();
       c2.modelo = "Bic";
       c2.cor = "Vermelha";
       c2.ponta = 0.5f;
       c2.carga = 90;
       c2.tampar();
       c2.status();
       c2.rabiscar();
    }
    
}
