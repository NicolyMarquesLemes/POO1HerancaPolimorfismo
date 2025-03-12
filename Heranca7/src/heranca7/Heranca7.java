
package heranca7;

public class Heranca7 {

    public static void main(String[] args) {
        Mago personagem1 = new Mago(200);
        personagem1.definirMana(30);
        personagem1.atacar();
        personagem1.exibir();
        
        Guerreiro personagem2 = new Guerreiro(300);
        personagem2.definirForca(200);
        personagem2.atacar();
        personagem2.exibir();
    }
    
}
