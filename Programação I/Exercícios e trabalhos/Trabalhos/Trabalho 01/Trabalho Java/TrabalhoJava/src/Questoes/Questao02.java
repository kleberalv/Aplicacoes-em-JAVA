package Questoes;
import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {

    String jan1;
    int n1;

    JOptionPane.showMessageDialog(null,"Impar ou par?");
    jan1= JOptionPane.showInputDialog("Informe o número: ");    
    n1= Integer.parseInt(jan1);

    if(n1%2==0){
        JOptionPane.showMessageDialog(null,"O número: "+n1+" é PAR.");
    }else{
        JOptionPane.showMessageDialog(null,"O número: "+n1+" é IMPAR");
    }

    }        
           
    }
