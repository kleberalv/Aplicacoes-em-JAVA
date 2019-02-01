/**
 * Escola Técnica de Brasilia
 * Aluno: Kleber Alves Bezerra Junior
 * Matricula: 195588
 * Turma: 2 "A"
 * Linguagem técnica de programação I
 */
package pcte1;
import java.util.Scanner;
//import java.text.DecimalFormat;
public class TesteVeiculo {

    public static void main(String[] args) {
  //  DecimalFormat df= new DecimalFormat("0.00");
    Scanner sc= new Scanner(System.in);
    Veiculo soma = new Veiculo();
    
        System.out.println("Digite o modelo do carro e pressione ENTER: ");
        soma.setModelo(sc.nextLine());
        
        System.out.println("Digite o número da placa do seu veículo e pressione ENTER: ");
        soma.placa=sc.nextLine();
        
        System.out.println("Digite o ano do seu veículo e pressione ENTER: ");
        soma.ano=sc.nextInt();
        
        System.out.println("Digite o valor de seu veículo e pressione ENTER: ");        
        soma.setValor(soma.sc.nextInt());
        System.out.println("");

        System.out.println("********** VEÍCULO: **********");
        System.out.println(soma.getModelo()); 
        System.out.println("A placa do seu carro é: "+soma.placa);
        System.out.println("O ano de seu veículo é: "+soma.ano);
soma.IPVA();    
  
    }
    
}
