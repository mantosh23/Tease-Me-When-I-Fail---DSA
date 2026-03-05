public class Pattern1 {
    public static void main(String[] args) {
        // print1(4, 0);
        print2(4, 0);
    }

    static void print2(int n, int turn) {
        if (n == 0) {
            return;
        }
        if (turn < n) {
            print2(n, turn + 1);
            System.out.print("*" + " ");
        } else {
            print2(n - 1, 0);
            System.out.println();
        }
    }

    static void print1(int n, int turn) {
        if (n == 1) {
            System.out.println();
            return;

        }
        if (turn == n) {
            System.out.println();
            turn = 0;
            n--;
        }
        System.out.print("*" + " ");
        turn = turn + 1;

        print1(n, turn);

    }
}
