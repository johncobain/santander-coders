package Animais;

public class Cachorro {
    //atributos
    static int numeroCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoRabo;
    private String estadoDeEspirito;

    //construtores
    public Cachorro(){numeroCachorros++;}
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoRabo = tamanhoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

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


    public void comer(){

    }
    public void latir(){
        System.out.println("AU!");
    }
    public String pegar(){
        return "Bolinha";
    }
    public String interagir(String acao){
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir":
                this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;
        }

        return estadoDeEspirito;
    }

    @Override
    public String toString(){
        return "Cachorro{"+
                "nome='"+nome+'\''+
                '}';
    }

}
