
package bancoestacio;

import java.util.Scanner;


public class Principal {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Instanciando o objeto.
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        
        //Definindo os atributos do objeto.
        System.out.println("Digite o numero da conta: ");
        conta1.setNumero(sc.nextInt());
        System.out.println("Digite o titular da conta: ");
        conta1.setTitular(sc.next());
        System.out.println("Digite o CPF: ");
        conta1.setCpf(sc.next());
        System.out.println("Digite o saldo: ");
        conta1.setSaldo(sc.nextDouble());
        System.out.println("Digite o limite");
        conta1.setLimite(sc.nextDouble());
       
        //Operações da conta.
        System.out.println("Digite o valor que deseja sacar: ");
        conta1.saca(sc.nextDouble());
        System.out.println("Digite o valor que deseja depositar: ");
        conta1.deposita(sc.nextDouble());
        System.out.println("Digite o valor que deseja transferir: ");
        conta1.transfere(sc.nextDouble(), conta2);
        System.out.println("Digite o valor que deseja acrescentar ao limite: ");
        conta1.aumentaLimite(sc.nextDouble());
          
       //Informações da conta.
        System.out.println("Deseja ver as informações da conta? (Sim ou Não) ");
        String resposta = sc.next();
        if(resposta.toUpperCase().startsWith("S") ){
            conta1.toString();
        }else{
            System.out.println("Fim do programa");
        }
        System.out.println(conta1.toString());
    }
    
}
