
package modeloAssociacao;
public class TesteVeiculo {
    public static void main(String[] args) {
      Veiculo v = new Veiculo("ab12", "vermeho", 
              new Motor(2.0, "flex"), 
              new Roda(20,100), 
              new Porta("4"));
      
      System.out.println(v);   
    }
       
    
}
