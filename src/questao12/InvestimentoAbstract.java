package questao12;

public abstract class InvestimentoAbstract implements InvestimentoInterface{

    private double valorInvestido;

    public InvestimentoAbstract(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public InvestimentoAbstract() {
        this.valorInvestido = 0;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    private void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public void adicionarInvestimento(double valorInvestido){
        this.valorInvestido += valorInvestido;
    }
}
