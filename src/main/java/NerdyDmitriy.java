public class NerdyDmitriy {

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        }
        return a;
    }

    public static int factorial(int a) {
        int f = 1;
        for (int i = 1; i <= a; i++) {
            f = f * i;
        }
        return f;
    }

    public static int power(int a, int b) {
        int p = a;
        for (int i = 1; i < b; i++) {
            p = p * a;
        }
        return p;
    }

    public boolean isPalindrome(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public String unicharString(char c, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += c;
        }
        return s;
    }

    public boolean isUnicharString(String a) {
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) != a.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public int countChar(String s, char c) {
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                d += 1;
            }
        }
        return d;
    }

    public int countWords(String s) {
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                d += 1;
            }
        }
        return d + 1;
    }

    public boolean isDoubleSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                if (s.charAt(i + 1) == 32) {
                    return true;
                }
            }
        }
        return false;
    }

    public String deleteDoubleSpace(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 32) {
                if (s.charAt(i + 1) == 32) {
                    return s.replace("  ", " ");
                }
            }
        }
        String b = "String has no double spaces";
        return b;
    }

    public String deleteDoubleSpaceCheat(String s) {
        return s.replace("  ", " ");
    }

    public String dublicateChar(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            a += s.charAt(i) + s.substring(i, i+1);

        }
        return a;
    }
}





