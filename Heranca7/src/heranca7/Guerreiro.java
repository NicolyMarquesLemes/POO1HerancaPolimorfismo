
package heranca7;

public class Guerreiro extends Personagem{
    private int forca;

    public Guerreiro(double energia) {
        super(energia);
    }
    
    public void definirForca(int forca){
        this.forca = forca;
    }
    
    public void exibir(){
        System.out.println("Energia: " + energia);
        System.out.println("Força: " + forca);
    }

    @Override
    public void atacar() {
        if(energia >= 50){
        System.out.println("O guerreiro está atacando");
        energia -= 50;
    }else{
            System.out.println("O guerreiro não tem mais energia");
        }
}
    
}
