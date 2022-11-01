package learn;

public class A {
    public static void main(String[] args) {
        People p=()->{
            System.out.println("run");
        };
        p.run();
    }
}

@FunctionalInterface
interface People{
    void run();
}
