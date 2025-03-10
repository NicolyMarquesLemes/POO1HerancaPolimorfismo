
package Herancapkg1;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }
    
    public void definirDetalhes(int cilindradas){
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cilindradas: " + cilindradas);
    }
}
