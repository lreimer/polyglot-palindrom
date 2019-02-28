package polyglot.palindrom

import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

@Title('Test spec for the Java Palindrom implementation')
class PalindromSpec extends Specification {

    @Subject
    Palindrom palindrom

    void setup() {
        palindrom = new Palindrom()
    }

    def "Check reverse Palindrom implementation"() {
        expect:
        palindrom.isPalindromReverse(value) == result

        where:
        value                 | result
        null                  | false
        "1qaz2wsx3edc4rfv"    | false
        ""                    | true
        "a"                   | true
        "aba"                 | true
        "abba"                | true
        "abcba"               | true
        "0123456789876543210" | true
    }
}
