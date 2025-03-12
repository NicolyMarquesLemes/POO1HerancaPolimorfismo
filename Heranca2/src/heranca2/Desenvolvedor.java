
package heranca2;

public class Desenvolvedor extends Funcionario {
    private int horasTrabalhadas;

    public Desenvolvedor(String nome) {
        super(nome);
    }
    
    public void definirHorasTrabalhadas(int horas){
        this.horasTrabalhadas = horas;
    }

    @Override
    public void calcularSalario() {
        System.out.println("Nome: " + nome);
        salario = horasTrabalhadas * 100;
        System.out.println("Salario: " + salario);
    }
}

