
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // String[] letras = new String[5];
        // letras[0] = "A";
        // letras[1] = "B";
        // letras[2] = "C";
        // letras[3] = "X";
        // letras[4] = "Y";
        // for(int i = 0; i<letras.length; i++){
        //     System.out.println(letras[i]);
        // }

        String[] letras = {"A", "B", "C", "X", "Y"};
        System.out.println(Arrays.toString(letras));

        int[] numbers = {9,10,12,25,2};
        int bigger = numbers[0];
        int small = numbers[0];
        float avg = 0;

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i]> bigger){
                bigger = numbers[i];
            }
            if(numbers[i]< small){
                small = numbers[i];
            }
            avg+= (float) numbers[i];
        }
        avg/=numbers.length;

        System.out.println("Maior: "+ bigger);
        System.out.println("Menor: "+ small);
        System.out.println("Media: "+ avg);
    }
}
