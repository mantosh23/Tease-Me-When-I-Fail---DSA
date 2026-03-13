public class Maze {
    public static void main(String[] args) {
        count("", 3, 3);
    }

    static void count(String up, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(up);
            return;
        }
        if (r > 1) {
            count(up + "D", r - 1, c);
        }
        if (c > 1) {
            count(up + "U", r, c - 1);
        }
    }
}
