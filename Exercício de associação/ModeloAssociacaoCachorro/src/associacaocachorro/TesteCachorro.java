
package associacaocachorro;
public class TesteCachorro {
    public static void main(String[] args) {
      Cachorro C = new Cachorro("112", "Roberto", "Poodle", 
              new Proprietario("Marcos", "Aguas Claras",
              new Filiacao("Joao", "Paula")),
              new Filiacao("José", "Maria"));
              
        System.out.println(C);
    }
                  
    
}
