public class Recursion4 {

    static String remove2(String s) {
        if (s.isEmpty()) return "";
        String result = remove2(s.substring(1));
        char ch = s.charAt(0);
        if (ch != 'a') return ch + result;
        return result;
    }

    static String removeA(String str, int idx) {
        if (idx == str.length()) return "";
        String result = removeA(str, idx + 1);
        char ch = str.charAt(idx);
        if (ch != 'a') return ch + result;
        return result;
    }

    static String reverseString(String s) {
        if (s.isEmpty()) return "";
        String result = reverseString(s.substring(1));
        char ch = s.charAt(0);
        return result + ch;
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start == end) return true;
        return str.charAt(start) == str.charAt(end) && isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String s = "level";
//        String ans = "";
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != 'a')
//                ans += s.charAt(i);
//        }
//        System.out.println(removeA(s, 0));
//        System.out.println(remove2(s));
       System.out.println(reverseString(s));
//        String rev =  reverseString(s);
//        if (rev.equals(s)) System.out.println("palindrome");
//        else System.out.println("not palindrome");

        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }
}
