package javaun3l3;
public class Exercicio04 {

int salario, novosal,conta,diferenca;

void novoSalario(){
  switch(conta){
      case 101:
          novosal= (int) (salario+(salario*0.10));
          diferenca= (salario-novosal)*-1;
          System.out.println("Cargo digitado é: Gerente.");   
          System.out.println("Seu salario: "+salario+" Teve um percentual de aumento de: 10%");
          System.out.println("O valor acrescentado foi "+diferenca);
          System.out.println("Seu novo salário totalizou: "+novosal);
          break;
      case 102:
          novosal= (int) (salario+(salario*0.20));
          diferenca= (salario-novosal)*-1;
          System.out.println("Cargo digitado é: Engenheiro.");   
          System.out.println("Seu salario: "+salario+" Teve um percentual de aumento de: 20%");
          System.out.println("O valor acrescentado foi "+diferenca);
          System.out.println("Seu novo salário totalizou: "+novosal);
          break;
      case 103:
           novosal= (int) (salario+(salario*0.30));
          diferenca= (salario-novosal)*-1;
          System.out.println("Cargo digitado é: Técnico.");   
          System.out.println("Seu salario: "+salario+" Teve um percentual de aumento de: 30%");
          System.out.println("O valor acrescentado foi "+diferenca);
          System.out.println("Seu novo salário totalizou: "+novosal);
          break;
      default:
          novosal= (int) (salario+(salario*0.40));
          diferenca= (salario-novosal)*-1;
          System.out.println("Cargo digitado é: Outros.");   
          System.out.println("Seu salario: "+salario+" Teve um percentual de aumento de: 40%");
          System.out.println("O valor acrescentado foi "+diferenca);
          System.out.println("Seu novo salário totalizou: "+novosal);

}         
}
}
