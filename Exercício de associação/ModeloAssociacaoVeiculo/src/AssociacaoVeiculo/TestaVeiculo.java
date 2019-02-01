package AssociacaoVeiculo;

public class TestaVeiculo {

    public static void main(String[] args) {
        Veiculo v = new Veiculo
        ( "JGL-2545","Vermelho",
                new Porta("2"), 
        new Motor(2.0, "Gasolina"), 
        new Roda(20, 16));
        
        System.out.println(v);       
        
    }
    
}
