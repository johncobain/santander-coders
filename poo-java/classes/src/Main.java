import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "Puppy";
        cachorro1.cor = "Marrom";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoRabo = 5;

        System.out.println(cachorro1);
        System.out.println(cachorro1.nome);
        System.out.println(cachorro1.cor);
        System.out.println(cachorro1.altura);
        System.out.println(cachorro1.peso);
        System.out.println(cachorro1.tamanhoRabo);

        cachorro1.latir();
        System.out.println("O cachorro pegou uma "+cachorro1.pegar());

        System.out.println("O cachorro esta "+cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta "+cachorro1.interagir("vai dormir"));
        System.out.println("O cachorro esta "+cachorro1.interagir("nada"));
    }
}
