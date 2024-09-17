//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        b = 5;
        System.out.println(divide(a, b));
        System.out.println(multiply(a, b));
    }

    public static int divide(int a, int b){
        return a/b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }
}