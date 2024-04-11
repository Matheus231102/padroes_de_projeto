package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo3;

public class IphoneXFactory extends IphoneAbstractFactory{
     @Override
     Iphone criarIphone() {
          return new IphoneX();
     }
}
