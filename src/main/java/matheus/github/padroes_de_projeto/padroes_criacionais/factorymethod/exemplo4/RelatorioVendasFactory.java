package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo4;

public class RelatorioVendasFactory extends RelatorioFactory {
     @Override
     Relatorio criarRelatorio() {
          return new RelatorioVendas();
     }
}
