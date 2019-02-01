package testaBanco;
import bancoJava.ContaCorrente;
import java.util.Scanner;

public class TestaBanco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaCorrente c1 = new ContaCorrente(147258, "Pedro", "147.258.361-98", 900.0, 400.0);
        ContaCorrente c2 = new ContaCorrente(147, "Marcos", "157.257.461-98", 700.0, 350.0);

        
        int e,ee;
        Double ValorSaque, ValorDeposito, ValorTransf, ValorLimite;
//______________________________________________________________________________________________
//Programa para banco com duas contas fictícias.
        
        
        System.out.println("NUBANK");
        
        System.out.println("Escolha a opção desejada: "
                + "\n 1- Sacar"
                + "\n 2- Depositar"
                + "\n 3- Transferir"
                + "\n 4- Aumentar o limite");
        e=sc.nextInt();       
        
        if (e>=1 && e<=4){
            switch(e){
//______________________________________________________________________________
//Opção de saque:                
                case 1:
                    System.out.println("Efetuar saque.");
                    System.out.println("Escolha a conta desejada para efetuar o saque: "
                        + "\n 1- Para sacar da conta 1: "
                        + "\n 2- Para sacar da conta 2: ");
                        ee=sc.nextInt();
                    
                        if (ee==1){
                            System.out.println("\nSacar da conta 1");
                            System.out.println("Informe o valor a ser sacado: ");
                            c1.setValorSaque(sc.nextDouble());
                            System.out.println("\n ----Dados Bancarios ----"+
                                "\n Nome: "+c1.getNomeDonoDaConta()+
                                "\n Número da conta: "+c1.getNumeroDaConta()+
                                "\n CPF: "+c1.getCpfDoCliente()+
                                "\n Valor sacado: "+c1.Sacar());
                        }else
                        
                        if (ee==2){
                            System.out.println("\n Sacar da conta 2");
                            System.out.println("Informe o valor a ser sacado: ");
                            c2.setValorSaque(sc.nextDouble());  
                            System.out.println("\n ----Dados Bancarios ----"+
                                "\n Nome: "+c2.getNomeDonoDaConta()+
                                "\n Número da conta: "+c2.getNumeroDaConta()+
                                "\n CPF: "+c2.getCpfDoCliente()+
                                "\n Valor sacado: "+c2.Sacar());                         
                        }else
                            System.out.println("Opção inválida!");
                        
                break;
//_____________________________________________________________________________________________                    
//Opção de deposito:                 
                case 2:
                    System.out.println("Efeturar depostio.");
                    System.out.println("Escolha a conta desejada: "
                        + "\n 1- Para a conta 1: "
                        + "\n 2- Para a conta 2: ");
                        ee=sc.nextInt();
                    
                        if (ee==1){
                            System.out.println("Informe o valor a ser depositado: ");
                            c1.setValorDeposito(sc.nextDouble());
                            System.out.println("\n ----Dados Bancarios ----"+
                                "\n Nome: "+c1.getNomeDonoDaConta()+
                                "\n Número da conta: "+c1.getNumeroDaConta()+
                                "\n CPF: "+c1.getCpfDoCliente()+
                                "\n Valor Depositado: "+c1.Depositar()+
                                "\n Saldo em conta: "+c1.NovoSaldo());
                        }else{
                        
                        if (ee==2){
                            System.out.println("Informe o valor a ser Depositado: ");
                            c2.setValorDeposito(sc.nextDouble());  
                            System.out.println("\n ----Dados Bancarios ----"+
                                "\n Nome: "+c2.getNomeDonoDaConta()+
                                "\n Número da conta: "+c2.getNumeroDaConta()+
                                "\n CPF: "+c2.getCpfDoCliente()+
                                "\n Valor Depositado: "+c2.Depositar()+
                                "\n Saldo em conta: "+c2.NovoSaldo());                          
                        }else
                            System.out.println("Opção inválida!");
                        }
                break;
//______________________________________________________________________________
//Opção de transferência    
                case 3:
                    System.out.println("Transferência entre as duas contas: ");                    
                    System.out.println("Escolha a conta desejada: "
                        + "\n 1- Para transferência entre a conta 1 e 2: "
                        + "\n 2- Para a transferência entre a conta 2 e 1: ");
                        ee=sc.nextInt();
                    
                        if (ee==1){
                            System.out.println("");
                            System.out.println("Informe o valor a ser transferido: ");
                            c1.setValorTransf(sc.nextDouble());
                            double r,rr;
                                r=(c1.getValorTransf()+c2.getSaldo());
                                rr=(c1.getSaldo()-c1.getValorTransf());
                                System.out.println("\n ----Dados Bancarios ----"+
                                "\n Nome: "+c1.getNomeDonoDaConta()+
                                "\n Número da conta: "+c1.getNumeroDaConta()+
                                "\n CPF: "+c1.getCpfDoCliente()+
                                "\n Valor Transferido: "+c1.getValorTransf()+
                                "\n Saldo em conta: "+rr+
                                //______________________________________________
                                "\n "+
                                "\n ----Dados Bancarios----"+
                                "\n Nome: "+c2.getNomeDonoDaConta()+
                                "\n Número da conta: "+c2.getNumeroDaConta()+
                                "\n CPF: "+c2.getCpfDoCliente()+
                                "\n Saldo em conta: "+r);                               
                                        
                        }else{
                        
                        if (ee==2){
                            System.out.println("");
                            System.out.println("Informe o valor a ser transferido: ");
                            c2.setValorTransf(sc.nextDouble());
                            double r,rr;
                                r=(c2.getValorTransf()+c1.getSaldo());
                                rr=(c2.getSaldo()-c2.getValorTransf());
                                System.out.println("\n ----Dados Bancarios ----"+
                                "\n Nome: "+c2.getNomeDonoDaConta()+
                                "\n Número da conta: "+c2.getNumeroDaConta()+
                                "\n CPF: "+c2.getCpfDoCliente()+
                                "\n Valor Transferido: "+c2.getValorTransf()+
                                "\n Saldo em conta: "+rr+
                                //______________________________________________
                                "\n "+
                                "\n ----Dados Bancarios----"+
                                "\n Nome: "+c1.getNomeDonoDaConta()+
                                "\n Número da conta: "+c1.getNumeroDaConta()+
                                "\n CPF: "+c1.getCpfDoCliente()+
                                "\n Saldo em conta: "+r);      
                        }else{
                            System.out.println("Opção inválida!");
                        }
                    }
                break;
//______________________________________________________________________________
//Aumentar o limite:
                case 4:
                    System.out.println("Informe a conta a ser transferida: ");                    
                    System.out.println("Escolha a conta desejada: "
                        + "\n 1- Para aumentar o limite da conta 1: "
                        + "\n 2- Para aumentar o limite da conta 2: ");
                        ee=sc.nextInt();
                        if (ee==1){
                            System.out.println("Aumentar o limite da conta 1");
                            System.out.println("\nInforme o novo limíte: ");
                            c1.setValorLimite(sc.nextDouble());
                                System.out.println("\n ----Dados Bancarios ----"+
                                "\n Nome: "+c1.getNomeDonoDaConta()+
                                "\n Número da conta: "+c1.getNumeroDaConta()+
                                "\n CPF: "+c1.getCpfDoCliente()+
                                "\n Limite do cliente: "+c1.getValorLimite()+
                                "\n Saldo em conta: "+c1.getSaldo());
                                //______________________________________________
                            
                        }else{
                            if (ee==2){
                            System.out.println("Aumentar o limite da conta 1");
                            System.out.println("\nInforme o novo limíte: ");
                            c2.setValorLimite(sc.nextDouble());
                                System.out.println("\n ----Dados Bancarios ----"+
                                "\n Nome: "+c2.getNomeDonoDaConta()+
                                "\n Número da conta: "+c2.getNumeroDaConta()+
                                "\n CPF: "+c2.getCpfDoCliente()+
                                "\n Limite do cliente: "+c2.getValorLimite()+
                                "\n Saldo em conta: "+c2.getSaldo());                                
                            }else{
                                System.out.println("Opção Inválida!");
                            }
                        }
                break;
                
                default:
                    System.out.println("Opção inválida!");
                    
            }      
                              
        }else
            System.out.println("Opção inválida!");
        

        
    }
    
}
