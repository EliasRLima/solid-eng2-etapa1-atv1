package questao12;

public class RealizadorInvestimento {

    private InvestimentoAbstract contexto;

    public void setContexto(InvestimentoAbstract contexto){
        this.contexto = contexto;
    }

    public void investir(){
        this.contexto.investir();
    }

    public double getResultadoInvestimento(){
        return this.contexto.valorLucro();
    }
}
