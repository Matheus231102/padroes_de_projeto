package matheus.github.padroes_de_projeto.padroes_criacionais.factorymethod.exemplo2;


import java.util.Random;

abstract class FabricaMonstroAbs {

     Monstro fabricarMonstro() {
          Random random = new Random();
          int bound = 3;
          int randomNumber = random.nextInt(bound);

          return switch (randomNumber) {
               case 0 -> new Monstro1();
               case 1 -> new Monstro2();
               case 2 -> new Monstro3();
               default -> null;
          };
     }

}
