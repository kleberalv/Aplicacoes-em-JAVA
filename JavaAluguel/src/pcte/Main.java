/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pcte;

/**
 *
 * @author tregis
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Veiculo vei = new Veiculo();

       System.out.println("Entre com o nome do Proprietário:");
       vei.cli.setNome(sc.next());
       System.out.println("Entre com a idade do Proprietário:");
       vei.cli.setIdade(sc.nextInt());
       System.out.println("Entre com o sexo do Proprietário:");
       vei.cli.sexo(sc.nextInt());
       System.out.println("Entre com o modelo do Veiculo:");
       vei.setModelo(sc.next());
       System.out.println("Entre com a Placa do Veiculo:");
       vei.setPlaca(sc.next());
       System.out.println("Entre com a diaria do Veiculo:");
       vei.setDiaria(sc.nextDouble());
       String dias=JOptionPane.showInputDialog("Entre com os dias Alugado:");
       vei.setDiasAlug(Integer.parseInt(dias));
       vei.calAluguel();
       System.out.println(vei);



    }

}
