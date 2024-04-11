package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo4;

public class RelatorioFinanceiroFactory extends RelatorioFactory {
     @Override
     Relatorio criarRelatorio() {
          return new RelatorioFinanceiro();
     }
}
