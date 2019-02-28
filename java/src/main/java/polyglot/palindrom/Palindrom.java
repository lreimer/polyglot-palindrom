package polyglot.palindrom;

import static java.util.Objects.isNull;

public class Palindrom {

    public boolean isPalindrom(String value) {
        if (isNull(value)) {
            return false;
        } else if (value.length() <= 1) {
            return true;
        }

        return true;
    }

    public boolean isPalindromReverse(String value) {
        if (isNull(value)) {
            return false;
        }

        StringBuilder b = new StringBuilder(value);
        return value.equals(b.reverse().toString());
    }

}
