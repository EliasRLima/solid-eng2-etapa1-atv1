package questao12.Investimentos;

import questao12.InvestimentoAbstract;

public class Conservador extends InvestimentoAbstract {

    public Conservador(double valorInvestido) {
        super(valorInvestido);
    }

    public Conservador() {
        super();
    }

    @Override
    public void investir() {
       System.out.println("Feito o procedimento de investimento conservador.");
    }

    @Override
    public double valorLucro() {
        return getValorInvestido()*0.08;
    }
}
