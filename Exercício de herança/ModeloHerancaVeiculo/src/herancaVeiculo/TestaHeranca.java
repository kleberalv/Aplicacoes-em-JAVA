package herancaVeiculo;

public class TestaHeranca {

    public static void main(String[] args) {
    
    Carro c = new Carro(4, 2018, "Vermelho", "JGL-2545", 4, "Chevrolett");
    Moto m = new Moto(2, 2015, "Preto", "KJI-5689", 1.0);
    Caminhao cc = new Caminhao(12, 2010, "Branco", "GFI-9812", 4);
    DePasseio dp = new DePasseio(4, 2016, "Azul", "HGP-8962", 4, "AUDI", 5);
    DeCarga dc = new DeCarga(4, 2018, "Vermelho", "JPG-5579", 2, "Volkswagen", 2.0);
    
        System.out.println(c);
        System.out.println(dc);
        System.out.println(dp);
        System.out.println(m);
        System.out.println(cc);
 
    }
    
}
