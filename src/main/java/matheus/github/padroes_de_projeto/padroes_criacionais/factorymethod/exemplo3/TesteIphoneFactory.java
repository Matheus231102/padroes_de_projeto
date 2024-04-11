package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo3;

public class TesteIphoneFactory {

     public static void main(String[] args) {
          IphoneXFactory iphoneXFactory = new IphoneXFactory();

          Iphone iphoneX = iphoneXFactory.criarIphone();
          iphoneX.mostrarModelo();
          iphoneX.mostrarInfo();

          Iphone iphoneX2 = iphoneXFactory.criarIphone();
          iphoneX2.mostrarModelo();
          iphoneX2.mostrarInfo();

     }
}
