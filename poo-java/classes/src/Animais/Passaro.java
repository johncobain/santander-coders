package Animais;

public class Passaro  extends Animal{
    static int numeroPassaros;

    public Passaro(){numeroPassaros++;}
    public Passaro(String nome, String cor, int altura, double peso, String estadoDeEspirito){
        super(nome, cor, altura, peso, estadoDeEspirito);

        numeroPassaros++;
    }

     //metodos
     public int getNumeroPassaros(){
        return  numeroPassaros;
    }

    public void setNumeroPassaros(int numeroPassaros){
        Passaro.numeroPassaros = numeroPassaros;
    }

    @Override
    public String toString(){
        return "Passaro{"+
                "nome='"+nome+'\''+
                '}';
    }

    @Override
    public void soar(){
        System.out.println("BEM-TE-VI!");
    }
}
