package Aula04;

import javax.swing.JOptionPane;

public class JOptionSoma {

    public static void main(String[] args) {

    String jan1, jan2;
    int n1, n2, soma,i = 0;

    JOptionPane.showMessageDialog(null,"Calculadora");
    jan1= JOptionPane.showInputDialog("Digite o primeiro valor a ser somado: ");
    jan2= JOptionPane.showInputDialog("Digite o segundo valor a ser somado: ");
    
    n1= Integer.parseInt(jan1);
    n2= Integer.parseInt(jan2);

    soma= n1+n2;

    JOptionPane.showMessageDialog(null,+n1+" + "+n2+" = "+soma);

    if(soma%2==0){
        JOptionPane.showMessageDialog(null,"O resultado: "+soma+" é PAR.");
    }else{
        JOptionPane.showMessageDialog(null,"O resultado: "+soma+" é IMPAR");
    }

    }

}
