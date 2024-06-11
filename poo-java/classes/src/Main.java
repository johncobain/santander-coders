import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rico", "Preto", 35, 6.3, 5, "Feliz");

        Gato gato1 = new Gato("Felix", "Preto", 15, 4.5, "Feliz");

        Passaro passaro1 = new Passaro("Frajola", "Azul", 10, 3.2, "Feliz");
        
        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        Petshop petshop = new Petshop();
        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
        
        petshop.deixarNoHotel(gato1);
        System.out.println(gato1.getEstadoDeEspirito());
        
        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());
    }
}
