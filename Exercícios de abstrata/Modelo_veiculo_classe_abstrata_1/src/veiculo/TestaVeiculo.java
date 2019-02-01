package veiculo;
public class TestaVeiculo {

    public static void main(String[] args) {
        
    Moto m =    new Moto(600, "JGL-2545", 2017, "Azul", 2400.00,
                    new Proprietario("070.329.641-84", "Kleber Alves", 
                        new Endereco("Areal", "13")));
    
    DePasseio d =   new DePasseio("VolksWagen", "Golf", 
                        new Montadora("14563475272", "Montadora Relampago", 
                            new Endereco("Samambaia", "199")), "KJI-0482", 2015, "Vermelho", 30000.00,
                                    new Proprietario("066.495.201-10", "João Guilherme", 
                                    new Endereco("Ceilândia", "45")));
                            
    
    Onibus o =  new Onibus(42, 
                    new Montadora("14563475273", "Montadora Trovão", 
                        new Endereco("Ceilandia", "147")), "IJH-0262", 2014, "Amarelo", 120000.00,
                            new Proprietario("066.495.201-10", "Isadora Rios", 
                                new Endereco("QNL", "20")));
        
  
        System.out.println(m); 
        System.out.println("__________________________________________");
        System.out.println(d);
        System.out.println("__________________________________________");
        System.out.println(o);
    
    }
    
}
