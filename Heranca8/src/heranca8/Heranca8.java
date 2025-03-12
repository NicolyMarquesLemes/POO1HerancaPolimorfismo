
package heranca8;

public class Heranca8 {

    public static void main(String[] args) {
        Navio transporte1 = new Navio(250);
        transporte1.definirTonelagem(500);
        transporte1.mover();
        transporte1.exibir();
        
        Aviao transporte2 = new Aviao(100);
        transporte2.definirAltitude(90);
        transporte2.mover();
        transporte2.exibir();
    }
    
}
