

public class Main {
    public static void main(String[] args)
    {
        DynamicFibonacci fib = new DynamicFibonacci();
        for (int i = 0; i < 20; i++) {
            System.out.println(fib.fibonacci(i));
        }
        System.out.println(fib.fibonacci(17));
    }
}
