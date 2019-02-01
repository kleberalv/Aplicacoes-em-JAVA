package javaun3l3;
public class Exercicio03 {

int n1,n2,conta,opcao;

  void mediaNumeros(){
   switch (opcao){ 
    case 1:
      conta= (n1+n2)/2;     
        System.out.println("Opção escolhida foi: media entre os números digitados.");
        System.out.println(+n1+" + "+n2+ " /2 = "+conta);
    break;
    case 2:
      conta= (n1*n2);   
        System.out.println("Opção escolhida foi: Produto entre os números digitados."); 
        System.out.println(+n1+" * "+n2+ " = "+conta);
    break;
    case 3:
      conta= (n1/n2);
        System.out.println("Opção escolhida foi: Divisão entre os números digitados.");
        System.out.println(+n1+" / "+n2+ " = "+conta);
    break;
    case 4:
       System.out.println("Opção escolhida foi: Divisão do maior pelo menor.");
        if (n1>n2){
            conta= (n1/n2);
            System.out.println(+n1+" / "+n2+ " = "+conta);
        }else
            if (n1<n2){
                conta= (n2/n1);
                System.out.println(+n2+" / "+n1+ " = "+conta);
        }else
                if (n1==n2){
                System.out.println("Números iguais!");
                System.out.println(+n1+" / "+n2+ " = "+conta);
                }
    default: 
        System.out.println("Opção inválida! Tente novamente...");
   }
                
}       
}
