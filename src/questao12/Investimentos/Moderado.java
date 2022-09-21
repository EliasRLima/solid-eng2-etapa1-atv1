package questao12.Investimentos;

import questao12.InvestimentoAbstract;
import questao12.RandomService;

public class Moderado extends InvestimentoAbstract {

    public Moderado(double valorInvestido) {
        super(valorInvestido);
    }

    public Moderado() {
        super();
    }

    @Override
    public void investir() {
        System.out.println("Feito o procedimento de investimento moderado.");
    }

    @Override
    public double valorLucro() {
        if(RandomService.getInstancia().getNumeroAleatorio() > 50)
            return getValorInvestido()*0.025;
        return getValorInvestido()*0.007;
    }
}
