/**
 * Escola Técnica de Brasilia
 * Alunos:
 * - Carlos Eduardo Brasil (22035-3);
 * - Isadora Rios Souza (17307-x);
 * - Kleber Alves Bezerra Junior (19558-8);
 * - Marcos Vinícius Lima (20778-0).
 * 
 * Professor: Regis Lima;
 * Turma: 2 "A";
 * Sistema para lotérica;
 * Linguagem técnica de programação I.
 */
package InterfaceOperador;
/** Imports; como precisamos das classes, importamos para poder utiliza-lás. */
import java.text.DecimalFormat;
import Servicos.ClienteCorrente;
import Servicos.ClientePoupanca;
import Servicos.Deposito;
import Servicos.Jogos;
import Servicos.Pagamentos;
import java.util.Scanner;

public class TesteLoteria {
    
    public static void main(String[] args) {
        /** Instancias; chama a classe objeto por uma variavel de referencias. */
        DecimalFormat df = new DecimalFormat("0");
        Scanner sc = new Scanner (System.in);
        AdmLoterica cc = new AdmLoterica();
        ClientePoupanca cp = new ClientePoupanca();
        ClienteCorrente ce = new ClienteCorrente();
        Deposito dp = new Deposito();
        Jogos jg = new Jogos();
        Pagamentos pg = new Pagamentos();
        
/** Atributos para as opções dos switch. */        
int escolha; //Menu principal do programa;
int dep; //Menu de escolha de depositos;
int apostas; //Menu de apostas;
int escc; //Menu de escolha de conta;
int cdb; //Menu de contas pra pagar;
int sa;  //Menu para saque.

//____________________________________________________________________________\\
        /** Menu do programa. */
        System.out.println("Lotérica MEGA-SORTE");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -"); 
        System.out.println(" Menu de opções: ");
        System.out.println(
              "\n1- Efetuar deposito; "+
              "\n2- Efetuar apostas; "+
              "\n3- Efetuar pagamentos de contas; "+
              "\n4- Verificar Saldo;"+
              "\n5- Para acesso a conta Corrente; "+
              "\n6- Para acesso a conta Poupança. ");    
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");        
       /** Um dos atributos sendo utilizados. */
       escolha= sc.nextInt();
       System.out.println();
       
       /** Começo da opção 1. */
       switch (escolha){

            case 1:
                
                System.out.println("Efetuar deposito: ");
                System.out.println("Digite a operação: "
                       +"\n1- Conta corrente de Pessoa Física - 001;"+
                        "\n2- Conta Corrente de Pessoas Jurídicas - 003;"+
                        "\n3- Depósitos de instituições Financeiras - 007;"+
                        "\n4- Poupança de Pessoa Física - 013;"+
                        "\n5- Poupança de Pessoa Júridica - 022;"+
                        "\n6- Depósitos Lotéricos - 043.");
                dep=sc.nextInt();
                /** Todas as opções tem um segundo menu de escolhas, o que leva 
                 * a utilização de um switch dentro de outro switch. 
                 */
                
                if (dep>=1 && dep <=6){
                    /** O 'if' realiza a escolha do usuario. 
                     * Neste case é feito operações de deposito.
                     * Esse case recebe a formatação a partir da variavel de referencia 'df'.
                     * Depósito para pessoa fisica em conta corrente. 
                     */ 
                    
                    if (dep==1){
                      System.out.println("Conta corrente de Pessoa Física - 001");
                      System.out.println("Informe o número da conta: ");
                      dp.setConta(sc.nextInt());
                      System.out.println("Digite o valor a ser depositado: ");
                      dp.setValor(sc.nextDouble());
                            /** Todas as opções vão gerar um comprovante/nota fiscal ao final. */
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      DEPOSITO EM DINHEIRO");  
                      System.out.println( "\nNúmero da conta: "+df.format(dp.getConta())+
                                          "\nValor depositado: "+dp.getValor()+
                                          "\nDEPOSITO REALIDADO COM SUCESSO."+
                                          "\nA PREVISÃO DO CREDITO NA CONTA"+
                                          " É DE ATÉ 30 MINUTOS."+
                                          "\nESSE RECIBO É VÁLIDO COMO"+
                                           "\nCOMPROVANTE DE DEPÓSITO.");
                     
                        }else
                        
                    /** Depósito para pessoa juridica em conta corrente. */    
                    if (dep==2){
                      System.out.println("Conta Corrente de Pessoas Jurídicas - 003");
                      System.out.println("Informe o número da conta: ");
                      dp.setConta(sc.nextInt());
                      System.out.println("Digite o valor a ser depositado: ");
                      dp.setValor(sc.nextDouble());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      DEPOSITO EM DINHEIRO");  
                      System.out.println( "\nNúmero da conta: "+df.format(dp.getConta())+
                                          "\nValor depositado: "+dp.getValor()+
                                          "\nDEPOSITO REALIDADO COM SUCESSO."+
                                          "A PREVISÃO DO CREDITO NA CONTA"+
                                          " É DE ATÉ 30 MINUTOS."+
                                          "\nESSE RECIBO É VÁLIDO COMO"+
                                           "\nCOMPROVANTE DE DEPÓSITO.");
                      
                        }else
                        
                    /** Depósito para instituição financeira . */     
                    if (dep==3){
                      System.out.println("Depósitos de instituições Financeiras - 007");
                      System.out.println("Informe o número da conta: ");
                      dp.setConta(sc.nextInt());
                      System.out.println("Digite o valor a ser depositado: ");
                      dp.setValor(sc.nextDouble());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      DEPOSITO EM DINHEIRO");  
                      System.out.println( "\nNúmero da conta: "+df.format(dp.getConta())+
                                          "\nValor depositado: "+dp.getValor()+
                                          "\nDEPOSITO REALIDADO COM SUCESSO. "+
                                          "\nA PREVISÃO DO CREDITO NA CONTA"+
                                          " É DE ATÉ 30 MINUTOS."+
                                          "\nESSE RECIBO É VÁLIDO COMO"+
                                           "\nCOMPROVANTE DE DEPÓSITO.");
                      
                        }else
                        
                    /** Depósito para pessoa fisica na conta poupança . */                 
                    if (dep==4){
                      System.out.println("Poupança de Pessoa Física - 013");
                      System.out.println("Informe o número da conta: ");
                      dp.setConta(sc.nextInt());
                      System.out.println("Digite o valor a ser depositado: ");
                      dp.setValor(sc.nextDouble());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      DEPOSITO EM DINHEIRO");  
                      System.out.println( "\nNúmero da conta: "+df.format(dp.getConta())+
                                          "\nValor depositado: "+dp.getValor()+
                                          "\nDEPOSITO REALIDADO COM SUCESSO."+ 
                                          "\nA PREVISÃO DO CREDITO NA CONTA"+
                                          " É DE ATÉ 30 MINUTOS."+
                                          "\nESSE RECIBO É VÁLIDO COMO"+
                                           "\nCOMPROVANTE DE DEPÓSITO.");
                      
                        }else
                        
                    /** Depósito para pessoa juridica em conta poupança. */                         
                    if (dep==5){
                      System.out.println("Poupança de Pessoa Júridica - 022");
                      System.out.println("Informe o número da conta: ");
                      dp.setConta(sc.nextInt());
                      System.out.println("Digite o valor a ser depositado: ");
                      dp.setValor(sc.nextDouble());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      DEPOSITO EM DINHEIRO");  
                      System.out.println( "\nNúmero da conta: "+df.format(dp.getConta())+
                                          "\nValor depositado: "+dp.getValor()+
                                          "\nDEPOSITO REALIDADO COM SUCESSO."+
                                          "\nA PREVISÃO DO CREDITO NA CONTA"+
                                          " É DE ATÉ 30 MINUTOS."+
                                          "\nESSE RECIBO É VÁLIDO COMO"+
                                           "\nCOMPROVANTE DE DEPÓSITO.");
                      
                        }else
                        
                    /** Depósito lotericos. */                             
                    if (dep==6){
                      System.out.println("Depósitos Lotéricos. - 043");
                      System.out.println("Informe o número da conta: ");
                      dp.setConta(sc.nextInt());
                      System.out.println("Digite o valor a ser depositado: ");
                      dp.setValor(sc.nextDouble());  
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      DEPOSITO EM DINHEIRO");  
                              
                      /** Utilização do DecimalFormat para formatar a exibição de numeros. */
                      System.out.println( "\nNúmero da conta: "+df.format(dp.getConta())+
                                          "\nValor depositado: "+dp.getValor()+
                                          "\nDEPOSITO REALIDADO COM SUCESSO."+
                                          "A PREVISÃO DO CREDITO NA CONTA"+
                                          " É DE ATÉ 30 MINUTOS."+
                                          "\nESSE RECIBO É VÁLIDO COMO"+
                                           "\nCOMPROVANTE DE DEPÓSITO.");                                                     
                                                        
                       }

                       }else
                    
                       /** Se o usuario por acaso digitar um numero que nao
                        * esteja no menu, uma mensagem é exibida na tela encerrando
                        * o programa.
                        */                                                
                       System.out.println("Opção inválida!");
                                                        
//____________________________________________________________________________\\                
           break;
           
            /** Case 2, para efetuar jogos. */
            case 2: 
                /** Menu de escolha dos jogos. */
                System.out.println("Escolha o jogo a ser feito: ");
                System.out.println("\n1- MEGASENA - R$3,50; "+
                                   "\n2- LOTOFÁCIL - R$2,00; "+
                                   "\n3- QUINA - R$1,50; "+
                                   "\n4- DUPLASENA - 2,00. ");
        
/** Outro atributo sendo utilizado, este para o switch dentro do case 2. */        
        apostas= sc.nextInt();
//____________________________________________________________________________\\        
        switch (apostas){
            /** A megasena recebe 6 numeros e registra o jogo feito. */
            case 1:
                System.out.println("MEGASENA");
                System.out.println("Digite os seus 6 números da sorte: ");
                System.out.println("OBS: um de cada vez!");
                jg.setN1(sc.nextInt());
                jg.setN2(sc.nextInt());
                jg.setN3(sc.nextInt());
                jg.setN4(sc.nextInt());
                jg.setN5(sc.nextInt());
                jg.setN6(sc.nextInt());
                              /** Geração do comprovante. */
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      MEGA-SENA ");  
                System.out.println(jg.toString());
                /** Retorno do toString da classe jogos. */
                System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - -");
                System.out.println("TOTAL                       R$3,50");
                System.out.println("\nJOGO EFETUADO COM SUCESSO."+
                                   "\nCONFIRA O RECIBO DA APOSTA."+
                                   "\nVALIDADE DO PRÊMIO: 90 DIAS");
                
             break;
//____________________________________________________________________________\\              
            /** A Loto Facil recebe 15 numeros e registra o jogo feito. */
            case 2:
                System.out.println("LOTO FÁCIL");
                System.out.println("Digite os seus 15 números da sorte: ");
                System.out.println("OBS: um de cada vez!");
                jg.setN1(sc.nextInt());
                jg.setN2(sc.nextInt());
                jg.setN3(sc.nextInt());
                jg.setN4(sc.nextInt());
                jg.setN5(sc.nextInt());
                jg.setN6(sc.nextInt());
                jg.setN7(sc.nextInt());
                jg.setN8(sc.nextInt());
                jg.setN9(sc.nextInt());
                jg.setN10(sc.nextInt());
                jg.setN11(sc.nextInt());
                jg.setN12(sc.nextInt());
                jg.setN13(sc.nextInt());
                jg.setN14(sc.nextInt());
                jg.setN15(sc.nextInt());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      LOTO FÁCIL ");  
                /** Retorno do metodo void usado para este case.*/
                jg.LotoFacil();
                System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - -");
                System.out.println("TOTAL                       R$2,00");
                System.out.println("\nJOGO EFETUADO COM SUCESSO."+
                                   "\nCONFIRA O RECIBO DA APOSTA."+
                                   "\nVALIDADE DO PRÊMIO: 90 DIAS");
                
             break;
//____________________________________________________________________________\\              
            /** A Quina recebe apenas 5 numeros e registra o jogo feito. */
            case 3:
                System.out.println("QUINA");
                System.out.println("Digite os seus 5 números da sorte: ");
                System.out.println("OBS: um de cada vez!");
                jg.setN1(sc.nextInt());
                jg.setN2(sc.nextInt());
                jg.setN3(sc.nextInt());
                jg.setN4(sc.nextInt());
                jg.setN5(sc.nextInt());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      QUINA "); 
                jg.Quina();
                /** Retorno do metodo void usado para este case.*/
                System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - -");
                System.out.println("TOTAL                       R$1,50");
                System.out.println("\nJOGO EFETUADO COM SUCESSO."+
                                   "\nCONFIRA O RECIBO DA APOSTA."+
                                   "\nVALIDADE DO PRÊMIO: 90 DIAS");
             break;
//____________________________________________________________________________\\             
            /** Duplasena recebe 6 numeros também e registra o jogo. */
            case 4:
                System.out.println("DUPLASENA");
                System.out.println("Digite os seus 6 números da sorte: ");
                System.out.println("OBS: um de cada vez!");
                jg.setN1(sc.nextInt());
                jg.setN2(sc.nextInt());
                jg.setN3(sc.nextInt());
                jg.setN4(sc.nextInt());
                jg.setN5(sc.nextInt());
                jg.setN6(sc.nextInt());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      DUPLA SENA "); 
                System.out.println(jg.toString());
                
                System.out.println("\n- - - - - - - - - - - - - - - - - - - - - - -");
                System.out.println("TOTAL                       R$2,00");
                System.out.println("\nJOGO EFETUADO COM SUCESSO."+
                                   "\nCONFIRA O RECIBO DA APOSTA."+
                                   "\nVALIDADE DO PRÊMIO: 90 DIAS");

             break;
            /** Aqui temos a nossa mensagem de opção invalida, caso entre 
             * com um numero que está fora do menu. 
             */ 
            default:
                System.out.println("Opção inválida! ");           
//____________________________________________________________________________\\                 
        }
           break;
            /** O case 3, é para efetuação de pagamentos de contas como 
             * agua, luz, telefone e internet.
             */
            case 3:
                
                System.out.println("Efetuar pagamentos: ");
                System.out.println("Informe a conta a ser paga: ");
                System.out.println("\n1- Conta de água; "+
                                   "\n2- Conta de telefone; "+
                                   "\n3- Conta de luz; "+
                                   "\n4- Conta de internet. ");
           cdb= sc.nextInt();
           
           /** 'If' para efetuar a operação solicitada.*/
           if (cdb==1){
                /** Aqui e inserido o codigo de barras e o valor da conta 
                 * para pagamento.
                 * Isso se aplica aos outros if's deste case 3.
                 */
                System.out.println("Pagamento de conta de água: ");
                System.out.println("Entre com o codigo de barras: ");
                 pg.setCodigodebarras(sc.nextFloat());
                 System.out.println("Qual o valor da conta? ");
                 pg.setValor(sc.nextFloat());
                               System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      PAGAMENTO EM DINHEIRO");  
                 System.out.println(  "\nCONTA DE ÁGUA"+
                                      "\nValor pago: "+pg.getValor());
                                      /** getValor é para mostrar o valor pago na conta. */
                   System.out.println("\nA CONTA FOI PAGA COM SUCESSO! O TEMPO ESTIMADO PARA"+                  
                                      "\nQUE O PAGAMENTO SEJA EFETIVADO É DE 24 HORAS.");
                      }else
               
           if (cdb==2){
               
                System.out.println("Pagamento de conta de telefone: ");
                System.out.println("Entre com o codigo de barras: ");
                 pg.setCodigodebarras(sc.nextFloat());
                 System.out.println("Qual o valor da conta? ");
                 pg.setValor(sc.nextFloat());
                               System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      PAGAMENTO EM DINHEIRO");  
                 System.out.println(  "\nCONTA DE TELEFONE"+
                                      "\nValor pago: "+pg.getValor());
                   System.out.println("\nA CONTA FOI PAGA COM SUCESSO! O TEMPO ESTIMADO PARA"+                  
                                      "\nQUE O PAGAMENTO SEJA EFETIVADO É DE 24 HORAS.");   
               }else
               
           if (cdb==3){
               
                System.out.println("Pagamento de conta de luz: ");
                System.out.println("Entre com o codigo de barras: ");
                 pg.setCodigodebarras(sc.nextFloat());
                 System.out.println("Qual o valor da conta? ");
                 pg.setValor(sc.nextFloat());

                               System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      PAGAMENTO EM DINHEIRO");  
                 System.out.println(  "\nCONTA DE LUZ"+
                                      "\nValor pago: "+pg.getValor());
                   System.out.println("\nA CONTA FOI PAGA COM SUCESSO! O TEMPO ESTIMADO PARA"+                  
                                      "\nQUE O PAGAMENTO SEJA EFETIVADO É DE 24 HORAS.");                
                    /** Sempre gerando os comprovantes. */
           }else
               
           if (cdb==4){
               
                System.out.println("Pagamento de conta de internet: ");
                System.out.println("Entre com o codigo de barras: ");
                 pg.setCodigodebarras(sc.nextFloat());
                 System.out.println("Qual o valor da conta? ");
                 pg.setValor(sc.nextFloat());

                               System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      PAGAMENTO EM DINHEIRO");  
                 System.out.println(  "\nCONTA DE INTERNET"+
                                      "\nValor pago: "+pg.getValor());
                   System.out.println("\nA CONTA FOI PAGA COM SUCESSO! O TEMPO ESTIMADO PARA"+                  
                                      "\nQUE O PAGAMENTO SEJA EFETIVADO É DE 24 HORAS.");  
                   
           }else
               
                    System.out.println("Opção inválida!");          
            break;
//____________________________________________________________________________\\ 
            /** No case 4, temos a verificação de saldo bancario da conta. */
            case 4:
                
                System.out.println("Verificar Saldo: ");
                System.out.println("Informe se é um cliente de conta Corrente ou Poupança: ");
                System.out.println("\n1- Para cliente Conta Corrente;"+
                                   "\n2- Para cliente Poupança.");
                escc= sc.nextInt();
                
                if (escc==1){
                  System.out.println("Informe o número da conta corrente: ");
                  cc.setConta(sc.next());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264");
                  System.out.println( "\n      COMPROVANTE DE SALDO CAIXA");  
                  System.out.println("\nNúmero da conta: "+cc.getConta());
                  ce.Sasaldo();
                  /** Retorna o saldo da conta corrente. */
                  System.out.println("- - - - - - - - - - - - - - - - - - - -");
                  
                }else
                    
                  if (escc==2){
                    System.out.println("Informe o número da conta poupança: ");
                    cp.setConta(sc.next());
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264");
                   System.out.println( "\n      COMPROVANTE DE SALDO CAIXA");  
                    System.out.println("\nNúmero da conta: "+cp.getConta());
                    /** O getConta e usado para mostrar o numero da conta. */
                    cp.Sasaldo();  
                    /** Retorna o saldo da conta poupança. */
                    System.out.println("- - - - - - - - - - - - - - - - - - - -");
                    
                }else
                        
                        System.out.println("Opção inválida!");
           break;
//____________________________________________________________________________\\ 
            /** Case 5, para fazer o saque ou nao na conta corrente. */
            case 5:
                
             System.out.println("\nCliente de conta Corrente!");
             System.out.println();
             System.out.println("Digite o nome do titular da conta: ");
             ce.setNome(sc.next());
             System.out.println("Digite o número da conta: ");
             ce.setConta(sc.next());
             System.out.println("Informe o saldo da conta: ");
             System.out.println("OBS: caso o cliente não se recorde, refaça a operação novamente e selecione a opção 4.");
             ce.setSaldo(sc.nextDouble()); 
             System.out.println("");
             
                System.out.println("Deseja sacar? "
                +"\n1- Para sim"+
                        "\n2- Para não");
                sa= sc.nextInt();
                
                if (sa==1){
                    System.out.println("Informe o valor a ser sacado: ");
                    ce.setSacar(sc.nextDouble());
                    
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      COMPROVANTE DE SAQUE CAIXA");   
                      System.out.println(ce.toString());
                      /** Chama o toString da classe conta corrente. */
                            System.out.println("\nESSE RECIBO É VÁLIDO COMO"+
                                    "\nCOMPROVANTE DE SAQUE.");
                /** Ao final, informa o saldo antes e depois do saque e o valor 
                 * do saque, mesmo que nao tenha sido feito nenhum saque. 
                 */
                            
                }else
                if (sa==2){
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      COMPROVANTE CAIXA");   
                  System.out.println(ce.toString());

                
                }else
                    System.out.println("Opção inválida!");
                       
   
           break;
//____________________________________________________________________________\\ 
            /** Case 6, em cliente com conta poupança, é feita as mesmas operaçoes
             * de uma conta corrente, mas com o diferencial da adição de uma 
             * taxa de juros sobre o valor do saldo.
             */
            case 6:
                
              System.out.println("Cliente de conta Poupança!");
              System.out.println();
              
              System.out.println("Digite o nome do titular da conta: ");
              cp.setNome(sc.next());
              System.out.println("Digite o número da conta: ");
              cp.setConta(sc.next());
              System.out.println("Informe o saldo da conta: ");
              System.out.println("OBS: caso o cliente não se recorde, refaça a operação novamente e selecione a opção 4.");
              cp.setSaldo(sc.nextDouble());     
              /** Aqui a area para informa a taxa de juros. */
              System.out.println("Informe a taxa de juros da poupança: ");
              cp.setTaxajuros(sc.nextInt());
                           

                System.out.println("Deseja sacar? "
                +"\n1- Para sim"+
                        "\n2- Para não");
                sa= sc.nextInt();
                
                if (sa==1){
                    System.out.println("Informe o valor a ser sacado: ");
                    cp.setSacar(sc.nextDouble());
                    
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      COMPROVANTE DE SAQUE CAIXA");   
                      System.out.println(cp.toString());
                      /** Chama o toString da classe conta poupança. */
                            System.out.println("\nESSE RECIBO É VÁLIDO COMO"+
                                    "\nCOMPROVANTE DE SAQUE.");
                    
                }else
                if (sa==2){
                              System.out.println("\nCAIXA ECONÔMICA FEDERAL "+
                                        "\n    SAC 0800 726 0101"+
                                        "\n    OUVIDORIA 0800 725 7474"+
                                        "\n    169-834874129-0 "+
                                        "\n28/JUN/2018    HORA DF 10:40:37"+
                                      "\n- - - - - - - - - - - - - - - - - - - - - - -"+
                                      "\nLOT: 04.22192-0             TERM 046668"+
                                      "\nLOCALIDADE: BRASÍLIA "+
                                      "\nAG. VINCULADA: 2399    CONTROLE: 26542264"+
                                      "\n      COMPROVANTE DE SAQUE CAIXA");  
                  System.out.println(cp.toString());
                
                }else
                    System.out.println("Opção inválida!");
                    /** Para opção errada dentro do case 6. */   
           break;
            default:
                /** Para opção errada referente ao primeiro menu. */
                System.out.println("Opção inválida!");
            break;
}
    }
}
