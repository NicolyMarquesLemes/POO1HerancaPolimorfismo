
package heranca5;

public class Notebook extends Eletronico {
    private double ram;

    public Notebook(String marca) {
        super(marca);
    }
    
    public void definirRam(int ram){
        this.ram = ram;
    }
    
    public void exibir(){
        System.out.println("Marca: " + marca);
        System.out.println("Ram: " + ram);
    }

    @Override
    public void ligar() {
        System.out.println("O notebook está ligando");
    }
}
