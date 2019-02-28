package polyglot.palindrom

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Subject
import spock.lang.Title

@Title('Test spec for the Java Palindrom implementation')
class PalindromSpec extends Specification {

    @Shared
    @Subject
    Palindrom palindrom

    @Shared
    def values
    @Shared
    def results

    void setupSpec() {
        palindrom = new Palindrom()
        values = [null, "", "a", "ab", "aba", "abba", "abcba", "0123456789876543210", "1qaz2wsx3edc4rfv"]
        results = [false, true, true, false, true, true, true, true, false]
    }

    def "Check default Palindrom implementation"() {
        expect:
        palindrom.isPalindrom(value) == result

        where:
        value << values
        result << results
    }

    def "Check recursive Palindrom implementation"() {
        expect:
        palindrom.isPalindromRecursive(value) == result

        where:
        value << values
        result << results
    }

    def "Check reverse Palindrom implementation"() {
        expect:
        palindrom.isPalindromReverse(value) == result

        where:
        value << values
        result << results
    }
}
