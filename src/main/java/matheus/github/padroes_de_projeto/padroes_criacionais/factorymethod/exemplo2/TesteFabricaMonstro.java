package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo2;

public class TesteFabricaMonstro {

     public static void main(String[] args) {
          FabricaMonstro fabricaMonstro = new FabricaMonstro();
          Monstro monstro = fabricaMonstro.fabricarMonstro();
          monstro.atacar();


     }
}
