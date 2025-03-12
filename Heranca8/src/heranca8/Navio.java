
package heranca8;

public class Navio extends Transporte {
    private double tonelagem;

    public Navio(double capacidade) {
        super(capacidade);
    }

    public void definirTonelagem(double tonelagem){
        this.tonelagem = tonelagem;
    }  
    public void definirTonelagem(int tonelagem){
        this.tonelagem = tonelagem;
    }
    
    public void exibir(){
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Tonelagem: " + tonelagem);
    }

    @Override
    public void mover() {
        System.out.println("O navio está se movendo");
    }
    
}
