import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Bank one = new Bank(740);
        System.out.println(one);
        System.out.println(one.getBalance());

        Thread t1 = new Runner(one, 500, 1);
        Thread t2 = new Runner(one, 100,2);
        Thread t3 = new Runner(one, 220,3);

        t1.start();
        t2.start();
        t3.start();

    }
}
