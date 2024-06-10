public class Main {
    public static void main(String[] args) {
        int score = 80;
        String grade;

        if(score>=80){
            grade =  "A";
        }else if(score<80 && score>=70){
            grade =  "B";
        }else if(score<70 && score>=60){
            grade =  "C";
        }else if(score<60 && score>=0){
            grade =  "D";
        }else{
            grade = " ";
        }
        switch(grade){
            case "A", "B" -> System.out.println("Aluno Aprovado");
            case "C", "D" -> System.out.println("Aluno Reprovado");
            default -> System.out.println("Graduacao invalida");
        }
    }
}
