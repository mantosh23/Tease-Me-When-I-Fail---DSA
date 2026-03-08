public class Basics {
    public static void main(String[] args) {
        // StringBuilder str = new StringBuilder("baccad");
        String str = "baccad";
        skip("", str);
    }

    static void skip(String s, String up) {
        if (up.isEmpty()) {
            System.out.println(s);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(s, up.substring(1));
        } else {
            skip(s + ch, up.substring(1));
        }
    }

    // static void remove(StringBuilder str, char a, int index) {
    // if (index == str.length()) {
    // return;
    // }

    // if (str.charAt(index) == a) {
    // str = str.deleteCharAt(index);
    // }

    // remove(str, a, index + 1);
    // }
}
