public class q1 {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }

    static boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return checkAgainValidation(s, start + 1, end) || checkAgainValidation(s, start, end - 1);
            }
        }
        return true;
    }

    static boolean checkAgainValidation(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
