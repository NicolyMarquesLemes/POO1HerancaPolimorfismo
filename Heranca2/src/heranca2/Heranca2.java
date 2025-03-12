
package heranca2;

public class Heranca2 {

    public static void main(String[] args) {
        Gerente funcionario1 = new Gerente("Ricardo", 700);
        funcionario1.definirBonus(200);
        funcionario1.calcularSalario();
        Desenvolvedor funcionario2 = new Desenvolvedor("David");
        funcionario2.definirHorasTrabalhadas(70);
        funcionario2.calcularSalario();
    }
    
}

