package questao12;

public abstract class InvestimentoAbstract implements InvestimentoInterface{

    private double valorInvestido;

    public InvestimentoAbstract(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

}
