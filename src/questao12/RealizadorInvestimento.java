package questao12;

public class RealizadorInvestimento {

    private InvestimentoAbstract contexto;

    public void setContexto(InvestimentoAbstract contexto){
        this.contexto = contexto;
    }

    public double completarInvestimento(){
        this.contexto.investir();
        return this.contexto.valorLucro();
    }
}
