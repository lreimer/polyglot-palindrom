function isPalindrome (str) {
    // force the input (could be anything) into a string
    const forcedString = '' + str;

    // we're case-insensitive, so we only look at the lowerCased version from here on
    const lowerCased = forcedString.toLowerCase();

    // split the string into an array of individual characters
    const characters = lowerCased.split('');

    // simply revert the array
    const reversed = characters.reverse();

    // join reverted array back into a string
    const joined = reversed.join('');

    // compare the reverted string to the input string. true => it's a palindrome!
    return joined === lowerCased;
}

module.exports = isPalindrome;
