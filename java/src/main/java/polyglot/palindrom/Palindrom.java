package polyglot.palindrom;

import static java.util.Objects.isNull;

public class Palindrom {

    public boolean isPalindromIterative(String value) {
        if (isNull(value)) {
            return false;
        } else if (value.length() <= 1) {
            return true;
        }

        char[] chars = value.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - i - 1]) {
                return false;
            }
        }

        return true;
    }

    public boolean isPalindromRecursive(String value) {
        if (isNull(value)) {
            return false;
        } else if (value.length() <= 1) {
            return true;
        }

        char first = value.charAt(0);
        char last = value.charAt(value.length() - 1);

        return (first == last) && isPalindromRecursive(value.substring(1, value.length() - 1));
    }

    public boolean isPalindromReverse(String value) {
        if (isNull(value)) {
            return false;
        }

        StringBuilder b = new StringBuilder(value);
        return value.equals(b.reverse().toString());
    }

}
