public class Main {
    public static void main(String[] args) {
        greet("John");
        greet("Mike");
        int res = sum(2,3);
        System.out.println(res);
    }

    public static void greet(String name){
        System.out.println("Hello, "+name);
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
