
package heranca3;

public class Heranca3 {

    public static void main(String[] args) {
        Golfinho animal1 = new Golfinho("Oceano");
        animal1.definirSaltos(5);
        animal1.fazerSom();
        animal1.exibir();
        
        Tubarao animal2 = new Tubarao("Oceano");
        animal2.definirDentes(150);
        animal2.fazerSom();
        animal2.exibir();
    }
    
}
