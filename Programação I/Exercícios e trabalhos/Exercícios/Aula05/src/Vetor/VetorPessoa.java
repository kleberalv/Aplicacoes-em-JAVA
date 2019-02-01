package Vetor;

import java.util.Scanner;

public class VetorPessoa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int [] idade = new int[6];
        String [] nome = new String[6];
        
        for (int i=0; i<idade.length; i++){
            System.out.println("informe a idade do entrevistado número "+i);
            idade[i]=sc.nextInt();   
            System.out.println("Informe o nome do entrevistado número: "+i);
            nome[i]=sc.next();            
        }
 
        System.out.println("\n ---- Entrevistados ----");
        for(int i=0; i<nome.length;i++){
            System.out.println("\n Entrevistado "+i+":");
            System.out.println("\nIdade do entrevistado: "+idade[i]);
            System.out.println("\nNome do entrevistado: "+nome[i]);
            System.out.println("___________________________________");
        }
        
        
        
        
    }
    
}
