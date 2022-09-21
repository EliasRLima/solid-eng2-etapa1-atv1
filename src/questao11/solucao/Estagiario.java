package questao11.solucao;

public class Estagiario implements FuncionarioInterface{

    private double bolsa;
    private double auxilios;

    @Override
    public void pagar() {
        System.out.println("O estagiario recebeu a transferencia de " + calcularValorPagamento());
    }

    @Override
    public double calcularValorPagamento() {
        return getBolsa() + getAuxilios();
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public double getAuxilios() {
        return auxilios;
    }

    public void setAuxilios(double auxilios) {
        this.auxilios = auxilios;
    }
}
