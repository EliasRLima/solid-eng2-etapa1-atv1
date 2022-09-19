package solucao;

public class Chefe implements FuncionarioInterface{
    private double salarioBase;
    private double bonificacoes;

    @Override
    public void pagar() {
        System.out.println("O chefe recebeu a transferencia de " + calcularValorPagamento());
    }

    @Override
    public double calcularValorPagamento() {
        return getSalarioBase() + getBonificacoes();
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonificacoes() {
        return bonificacoes;
    }

    public void setBonificacoes(double bonificacoes) {
        this.bonificacoes = bonificacoes;
    }


}
