
package heranca3;

public class Tubarao extends animalMarinho {
    private int dentes;
    
    public Tubarao(String habitat){
        super(habitat);
    }
    
    public void definirDentes(int dentes){
        this.dentes = dentes;
    }
    
    public void exibir(){
        System.out.println("Habitat: " + habitat);
        System.out.println("Dentes: " + dentes);
    }

    @Override
    public void fazerSom() {
        System.out.println("O tubarão não faz som!");
    }
}
