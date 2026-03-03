public class Nto1 {
    public static void main(String[] args) {
        // fun(5);
        funR(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funR(int n) {
        if (n == 0) {
            return;
        }
        funR(n - 1);
        System.out.println(n);
    }
}
