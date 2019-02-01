package exercicio;

public class Exercicio {

    public static void main(String[] args) {
        
       Pessoa pp = new Pessoa();
        
        Pessoa p = new Pessoa("Kleber", "Castanhos", 1, 18, "Masculino");

        pp.setNome("Ramiro");
        pp.setIdade(70);
        pp.setSexo("Feminino");
        pp.setCorCabelos("Brancos!");
        
        System.out.println(p);  
        
        System.out.println("\n Olá "+pp.getNome()+", como vai?");
        System.out.println(" Você tem "+pp.getIdade()+", ta novo em?!");       
        System.out.println(" A cor dos seus cabelos são: "+pp.getCorCabelos());
        System.out.println(" Você é do sexo: "+pp.getSexo());
        
    }
    
}
