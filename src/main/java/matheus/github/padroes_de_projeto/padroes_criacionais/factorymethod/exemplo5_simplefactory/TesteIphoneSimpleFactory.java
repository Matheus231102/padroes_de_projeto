package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo5_simplefactory;

public class TesteIphoneSimpleFactory {
     public static void main(String[] args) {
          IphoneFactory iphoneFactory = new IphoneFactory();

          IphoneX iphoneX = iphoneFactory.orderIphoneX();
          Iphone11 iphone11 = iphoneFactory.orderIphone11();

          iphoneX.showInfo();
          iphone11.showInfo();


     }
}
