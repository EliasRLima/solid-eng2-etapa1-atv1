package solucao;

public class Teste {
    public static void main(String[] args) {
        Chefe chefe = new Chefe();
        chefe.setBonificacoes(1000);
        chefe.setSalarioBase(5000);

        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2200);
        funcionario.setBonus(300);

        Estagiario estagiario = new Estagiario();
        estagiario.setBolsa(700);
        estagiario.setAuxilios(300);

        PagadorDeFuncionario pagadorDeFuncionario = new PagadorDeFuncionario();
        pagadorDeFuncionario.pagar(chefe);
        pagadorDeFuncionario.pagar(funcionario);
        pagadorDeFuncionario.pagar(estagiario);
    }
}
