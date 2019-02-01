
package ClasseAbstrata;
public class TesteVeiculo {
    public static void main(String[] args) {
      DePasseio p = new DePasseio("Chevrolet", "Alto", 
              new Montadora("25314", "Montadora 1", 
                      new Endereco("Rua dos Valadares", "25")),"adb123", 2017, "Branco", 36000.00, 
              new Proprietario("678942", "Carlos",
                      new Endereco("Rua das Rosas", "02")));
      Onibus o = new Onibus (56, 
              new Montadora("321469", "Montadora 2", 
                      new Endereco("Rua das Montadoras", "89")),"abc523", 2018, "Vermelho", 50000.00, 
              new Proprietario("87423659", "Kleber", 
                      new Endereco("Rua das Palmeiras", "56")));
      Moto m = new Moto(600,"abc321" , 2018, "Azul", 20000.00, 
              new Proprietario("6325418", "Marcos", 
                      new Endereco("Rua Treze", "03")));
        System.out.println(p);
        System.out.println(o);
        System.out.println(m);
    }
    
}
