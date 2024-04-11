package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo1;

public class TesteFabricaProduto {

     public static void main(String[] args) {
          FabricaProdutoA fabricaA = new FabricaProdutoA();
          Produto produtoA = fabricaA.criarProduto();
          System.out.println(produtoA.informacaoProduto());
     }
}
