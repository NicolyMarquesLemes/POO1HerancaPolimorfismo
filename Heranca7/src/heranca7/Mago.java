
package heranca7;

public class Mago extends Personagem{
  private double mana;

    public Mago(double energia) {
        super(energia);
    }

    public void definirMana(double mana){
        this.mana = mana;
    }  
    public void definirMana(int mana){
        this.mana = mana;
    }
    
    public void exibir(){
        System.out.println("Energia: " + energia);
        System.out.println("Mana: " + mana);
    }



    @Override
    public void atacar() {
        if(mana >= 20){
            System.out.println("O mago está atacando");
            mana -= 20;
        }else{
            System.out.println("Mana insuficiente ");
        }
    }
}
