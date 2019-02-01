package modeloInterface;
public class TestaGeometria {

    public static void main(String[] args) {

        Matematica m =  new Matematica(46.0, "Geometria", 
                            new AplicacaoPratica("Aula prática", 
                                new Circulo(3.0, "Circulo"), 
                                    new Retangulo(2.5, 3.0, "Retângulo"), 
                                        new Quadrado(7.0,"Quadrado")));
        
        System.out.println(m);
        
        
        
    }
    
}
