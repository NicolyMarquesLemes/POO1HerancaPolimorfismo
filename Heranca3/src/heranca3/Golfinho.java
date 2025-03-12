
package heranca3;

public class Golfinho extends animalMarinho {
   private double saltos;
   
   public Golfinho(String habitat){
       super(habitat);
   }
   
   public void definirSaltos(int saltos){
       this.saltos = saltos;
   }
   public void definirSaltos(double saltos){
       this.saltos = saltos;
   }
   
   public void exibir(){
       System.out.println("Habitat: " + habitat);
       System.out.println("Saltos: " + saltos);
   }
   
   @Override
   public void fazerSom(){
       System.out.println("O golfinho está assobiando e clicando");
   }
}
