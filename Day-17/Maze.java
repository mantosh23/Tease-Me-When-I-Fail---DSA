public class Maze {
    public static void main(String[] args) {
        System.out.println(maze(3, 3));
        maze("", 3, 3);
    }

    static int maze(int row, int col) {
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = maze(row - 1, col);
        int right = maze(row, col - 1);
        return left + right;
    }

    static void maze(String up, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(up);
            return;
        }
        if (row > 1) {
            maze(up + "D", row - 1, col);
        }
        if (col > 1) {
            maze(up + "R", row, col - 1);
        }

    }
}
