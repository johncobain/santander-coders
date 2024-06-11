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

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(nome.equals("lily")){
            this.nome = null;
        }
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public int getAltura(){
        return this.altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }
    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
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
