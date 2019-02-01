package Questoes;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
       
            Scanner sc = new Scanner(System.in);

    int n1,n2,n3;

        System.out.println("Digite o primeiro número: ");
        n1=sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2=sc.nextInt();
        System.out.println("Digite o terceiro número: ");
        n3=sc.nextInt();
        
        //Qual número é maior?
        
        if(n1==n2 || n1==n3 || n2==n3){
				
            System.out.println("Possui números iguais!");
				
	}else

	if(n1>n2 && n1>n3){
          System.out.println(" O número "+n1+" é maior que "+n2+" e "+n3);
	
	}else 
	
	if (n2>n1 && n2>n3){
          System.out.println(" O número "+n2+" é maior que "+n1+" e "+n3);
		
	}else
	
	if(n3>n2 || n3>n1){
			
          System.out.println(" O número "+n3+" é maior que "+n2+" e "+n1);
			
	} 
    }
    
}
