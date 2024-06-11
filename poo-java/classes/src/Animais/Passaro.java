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
        return "Passaro{"+
                "nome='"+nome+'\''+
                '}';
    }

    @Override
    public void soar(){
        System.out.println("BEM-TE-VI!");
    }
}
