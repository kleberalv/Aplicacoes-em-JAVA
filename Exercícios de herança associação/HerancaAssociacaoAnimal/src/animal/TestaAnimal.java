package animal;
public class TestaAnimal {

    public static void main(String[] args) {
      Cachorro c = new Cachorro(7 ,"Zeus", 
                   new Fisica("Kleber", 
                   new Telefone(61, "99125-2701"),"070.329.641.84", 
                   new Profissao("Coordenador de informática", 1000.10)));
      
      Baleia b = new Baleia(14, "Azul");
      
      Juridica j = new Juridica("GDF", "154656168", 
                   new Telefone(61, "3356-8962"));  
        
        System.out.println(c);   
        System.out.println(b);
        System.out.println(j);
        
    }
    
}
