package herancaassociacao;

public class TestaZoologico {

    public static void main(String[] args) {

      Bovino b =  new Bovino("Boi bovino", 
                    new AnimalBovino("Shorthorn", 16, 
                        new Racao ("bomguy", 7965)), 5, 15.0, 20.0, 
                            new Expositor("147896325", "Francisco", 
                                new Stand (14, "Compra pf", 
                                    new Produto ("28947654984531", "Chaveiro", 15.0))), 
                                        new Visitante ("Kleber", 
                                            new Stand(23, "Naotem", 
                                                new Produto ("23186486", "Ingresso", 10.0)), 
                                                    new Ingresso (1, 10.0)));
      
      Equino e = new Equino("Cavalos", 35, 
                    new AnimalEquino("Cavalo árabe", "Masculino", 
                        new Racao("bomguy", 3010)), 6, 20.6, 15.9, 
                            new Expositor ("1648231894", "Isadora", 
                                new Stand (49, "Compra Logo!", 
                                    new Produto ("16548456184", "Lembrancinha", 5.90))), 
                                        new Visitante("Lucas", 
                                            new Stand(22, "Temsim", 
                                                new Produto("18647845648", "Ingresso", 10.0)), 
                                                    new Ingresso (2,10.0)));
  AnimalDiverso a = new AnimalDiverso("Animais", 
                    new Gato ("Branco", "Persa", 
                        new Tratador("1411799", "Carlos", 
                            new Racao("bomguy", 369874))), 
                                new Cachorro("Manchinha", "Pastor-Alemão", 
                                    new Tratador ("1411799", "Carlos", 
                                        new Racao ("bomguy", 48941856))), 
                                            new Ovelha ("Branco", "Feminino", "Merino", 
                                                new Racao("bomguy", 154648)), 6, 15.4, 10.8, 
                                                    new Expositor("16548656", "Luan", 
                                                        new Stand(49, "Compra logo carai", 
                                                            new Produto("158645189", "Chaveiro", 5.99))), 
                                                                new Visitante("Maria", 
                                                                    new Stand(22, "Tem mesmo",
                                                                        new Produto("5648945648", "Ingresso", 10.0)),
                                                                            new Ingresso(3, 10.0)));
      
      
      
      System.out.println(b);
        System.out.println(e);
          System.out.println(a);
      
      
      
      
    }
    
}
