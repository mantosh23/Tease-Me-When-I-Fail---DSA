public class Skip {
    public static void main(String[] args) {
        // String str = "baccad";
        // System.out.println(skipChar(str));
        System.out.println(skipAppleNotApple("ajvnsdjappenjvs"));
    }

    static String skipChar(String str) {
        if (str.isEmpty()) {
            return " ";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            return skipChar(str.substring(1));
        } else {
            return ch + skipChar(str.substring(1));
        }
    }

    static String skipString(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("apple")) {
            return skipString(str.substring(5));
        } else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }

    static String skipAppleNotApple(String str) {
        if (str.isEmpty()) {
            return "";
        }
        if (str.startsWith("app") && !str.startsWith("apple")) {
            return skipAppleNotApple(str.substring(3));
        } else {
            return str.charAt(0) + skipAppleNotApple(str.substring(1));
        }
    }
}
