package Animais;

public class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    protected  Animal(){}
    protected  Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public void comer(){}

    public void dormir(){}
    public void soar(){
        System.out.println("cri cri");
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
}
