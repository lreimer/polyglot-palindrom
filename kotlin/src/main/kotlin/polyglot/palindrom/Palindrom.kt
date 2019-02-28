package polyglot.palindrom

class Palindrom {

    fun isPalindromIterative(value: String): Boolean {
        if (value.length <= 1) {
            return true
        }

        for (i in 0 until value.length / 2) {
            if (value[i] != value[value.length - i - 1]) {
                return false
            }
        }

        return true
    }

    fun isPalindromRecursive(value: String): Boolean {
        if (value.isEmpty() || value.length <= 1) {
            return true
        }

        val first = value[0]
        val last = value[value.length - 1]

        return first == last && isPalindromRecursive(value.substring(1, value.length - 1))
    }

    fun isPalindromReverse(value: String): Boolean {
        return value.reversed() == value
    }
}
