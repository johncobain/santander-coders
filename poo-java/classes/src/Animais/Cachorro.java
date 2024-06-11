package Animais;

public class Cachorro extends Animal{
    //atributos
    static int numeroCachorros;

    private int tamanhoRabo;


    //construtores
    public Cachorro(){numeroCachorros++;}
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoDeEspirito){
        super(nome, cor, altura, peso, estadoDeEspirito);

        numeroCachorros++;
    }

    //metodos
    public int getNumeroCachorros(){
        return  numeroCachorros;
    }

    public void setNumeroCachorros(int numeroCachorros){
        Cachorro.numeroCachorros = numeroCachorros;
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
    public int getTamanhoRabo(){
        return this.tamanhoRabo;
    }

    public void setTamanhoRabo(int tamanhoRabo){
        this.tamanhoRabo = tamanhoRabo;
    }

    @Override
    public String toString(){
        return "Cachorro{"+
                "nome='"+nome+'\''+
                '}';
    }

    @Override
    public void soar(){
        System.out.println("AU AU!");
    }

}
