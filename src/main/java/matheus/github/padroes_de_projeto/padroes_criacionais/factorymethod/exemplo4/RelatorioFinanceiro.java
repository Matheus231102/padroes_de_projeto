package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo4;

public class RelatorioFinanceiro extends Relatorio{
     @Override
     void gerar() {
          System.out.println("ESSE É O RELATÓRIO DO FINANCEIRO");
     }
}
