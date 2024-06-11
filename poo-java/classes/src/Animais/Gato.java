package Animais;

public class Gato extends Animal{
    static int numeroGatos;
  
    public Gato(){numeroGatos++;}
    public Gato(String nome, String cor, int altura, double peso, String estadoDeEspirito){
        super(nome, cor, altura, peso, estadoDeEspirito);
        numeroGatos++;
    }

     //metodos
     public int getNumeroGatos(){
        return  numeroGatos;
    }

    public void setNumeroGatos(int numeroGatos){
        Gato.numeroGatos = numeroGatos;
    }

    @Override
    public String toString(){
        return "Gato{"+
                "nome='"+nome+'\''+
                '}';
    }

    @Override
    public void soar(){
        System.out.println("MIAU!");
    }
}
