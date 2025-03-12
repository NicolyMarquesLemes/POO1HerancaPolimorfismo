
package heranca8;

public class Aviao extends Transporte {
    private int altitudeMaxima;

    public Aviao(double capacidade) {
        super(capacidade);
    }
    
    public void definirAltitude(int altitude){
        this.altitudeMaxima = altitude;
    }
    
    public void exibir(){
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Altitude Maxíma: " + altitudeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("O avião está no ar");
}
}
