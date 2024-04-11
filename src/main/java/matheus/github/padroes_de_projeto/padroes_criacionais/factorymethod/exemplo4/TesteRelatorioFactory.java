package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo4;

public class TesteRelatorioFactory {
     public static void main(String[] args) {
          RelatorioFinanceiroFactory relatorioFinanceiroFactory = new RelatorioFinanceiroFactory();
          RelatorioVendasFactory relatorioVendasFactory = new RelatorioVendasFactory();

          Relatorio relatorioVendas = relatorioVendasFactory.criarRelatorio();
          Relatorio relatorioFinanceiro = relatorioFinanceiroFactory.criarRelatorio();

          relatorioVendas.gerar();
          relatorioFinanceiro.gerar();

     }
}
