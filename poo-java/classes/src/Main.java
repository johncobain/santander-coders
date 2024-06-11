import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Rico", "Preto", 35, 6.3, 5, "Feliz");
        cachorro1.setNome("Puppy");
        cachorro1.setCor("Marrom");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoRabo(5);

        System.out.println(cachorro1);
        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getCor());
        System.out.println(cachorro1.getAltura());
        System.out.println(cachorro1.getPeso());
        System.out.println(cachorro1.getTamanhoRabo());

        cachorro1.latir();
        System.out.println("O cachorro pegou uma "+cachorro1.pegar());

        System.out.println("O cachorro esta "+cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta "+cachorro1.interagir("vai dormir"));
        System.out.println("O cachorro esta "+cachorro1.interagir("pisar na patinha"));
        System.out.println("O cachorro esta "+cachorro1.interagir("nada"));

        System.out.println(cachorro2.getNome());
    }
}
