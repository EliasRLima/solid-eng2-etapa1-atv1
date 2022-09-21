package questao12.Investimentos;

import questao12.InvestimentoAbstract;
import questao12.RandomService;

public class Arrojado extends InvestimentoAbstract {

    public Arrojado(double valorInvestido) {
        super(valorInvestido);
    }

    @Override
    public void investir() {
        System.out.println("Feito o procedimento de investimento arrojado.");
    }

    @Override
    public double valorLucro() {
        int chance = RandomService.getInstancia().getNumeroAleatorio();
        if( chance > 80){ //20%
            return getValorInvestido()*0.05;
        }else if(chance > 50){
            return getValorInvestido()*0.03;
        }
        return getValorInvestido()*0.006;
    }
}
