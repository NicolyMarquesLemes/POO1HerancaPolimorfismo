
package heranca5;

public class Celular extends Eletronico {
    private double tela;

    public Celular(String marca) {
        super(marca);
    }
    
    public void definirTela(double tela){
        this.tela = tela;
    }
    public void definirTela(int tela){
        this.tela = tela;
    }
    
    public void exibir(){
        System.out.println("Marca: " + marca);
        System.out.println("Tela: " + tela);
    }

    @Override
    public void ligar() {
        System.out.println("O celular está ligando");
    }
}
