package polyglot.palindrom

import io.kotlintest.TestCase
import io.kotlintest.TestCaseOrder
import io.kotlintest.data.forall
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class PalindromTest : StringSpec() {
    override fun testCaseOrder(): TestCaseOrder? = TestCaseOrder.Random

    lateinit var palindrom: Palindrom

    override fun beforeTest(testCase: TestCase) {
        palindrom = Palindrom()
    }

    init {
        "Check iterative Palindrom" {
            forall(row("", true), row("a", true),
                    row("aba", true), row("abba", true),
                    row("abcba", true), row("1234567890987654321", true),
                    row("abc", false), row("1qaz2wsx3edc4rfv", false)
            ) { value, result ->
                palindrom.isPalindromIterative(value) == result
            }
        }

        "Check recursive Palindrom" {
            forall(row("", true), row("a", true),
                    row("aba", true), row("abba", true),
                    row("abcba", true), row("1234567890987654321", true),
                    row("abc", false), row("1qaz2wsx3edc4rfv", false)
            ) { value, result ->
                palindrom.isPalindromRecursive(value) == result
            }
        }

        "Check reversed Palindrom" {
            forall(row("", true), row("a", true),
                    row("aba", true), row("abba", true),
                    row("abcba", true), row("1234567890987654321", true),
                    row("abc", false), row("1qaz2wsx3edc4rfv", false)
            ) { value, result ->
                palindrom.isPalindromReverse(value) == result
            }
        }
    }
}
