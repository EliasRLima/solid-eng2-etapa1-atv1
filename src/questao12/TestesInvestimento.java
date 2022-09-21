package questao12;

import questao12.Investimentos.Arrojado;
import questao12.Investimentos.Conservador;
import questao12.Investimentos.Moderado;

import java.util.Scanner;

public class TestesInvestimento {

    public static void main(String[] args) {

        RealizadorInvestimento realizadorInvestimento = new RealizadorInvestimento();

        System.out.println("1 - Perfil conservador\n2 - Perfil moderado\n3 - Perfil arrojado\nEscolha: ");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();

        System.out.println("Valor investido: \n");
        double valor = scanner.nextDouble();

        if(escolha==1){
            realizadorInvestimento.setContexto(new Conservador(valor));
        }else if(escolha==2){
            realizadorInvestimento.setContexto(new Moderado(valor));
        }else if(escolha==3){
            realizadorInvestimento.setContexto(new Arrojado(valor));
        }else{
            return;
        }

        double resultado = realizadorInvestimento.completarInvestimento();
        System.out.println("Resultado: "+ resultado);
    }

}
