public class App {
    public static void main(String[] args) throws Exception {
        boolean weekend = true;
        boolean sunny =  true;
        boolean goToTeBeach = weekend && sunny;
        System.out.println(goToTeBeach);

        String msg = weekend? "Eh fim de semana": "Não eh fim de semana";
        System.out.println(msg);
    }
}
