package solucao;

public class Funcionario implements FuncionarioInterface{

    private double salario;
    private double bonus;

    @Override
    public void pagar() {
        System.out.println("O funcionario recebeu a transferencia de " + calcularValorPagamento());
    }

    @Override
    public double calcularValorPagamento() {
        return this.getSalario() + this.getBonus();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
