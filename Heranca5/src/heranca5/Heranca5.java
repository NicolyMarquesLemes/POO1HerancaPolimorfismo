
package heranca5;

public class Heranca5 {

    public static void main(String[] args) {
        Celular eletronico1 = new Celular("Xiomi");
        eletronico1.definirTela(6.67);
        eletronico1.ligar();
        eletronico1.exibir();
        
        Notebook eletronico2 = new Notebook("Apple");
        eletronico2.definirRam(8);
        eletronico2.ligar();
        eletronico2.exibir();
    }
    
}
