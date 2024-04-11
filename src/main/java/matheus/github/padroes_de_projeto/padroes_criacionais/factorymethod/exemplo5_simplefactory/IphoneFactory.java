package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo5_simplefactory;

public class IphoneFactory extends AbstractIphoneFactory {

     @Override
     IphoneX orderIphoneX() {
          return new IphoneX();
     }

     @Override
     Iphone11 orderIphone11() {
          return new Iphone11();
     }
}
