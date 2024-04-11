package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo1;

public class FabricaProdutoA extends FabricaProduto {
     @Override
     Produto criarProduto() {
          return new ProdutoA();
     }
}
