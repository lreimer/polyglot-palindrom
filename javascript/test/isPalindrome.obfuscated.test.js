const isPalindrome = require('../src/isPalindrome.obfuscated');
const testData = require('./testData');

test('isPalindrome', () => {

    testData.forEach(({value, result}) => {
        expect(isPalindrome(value)).toBe(result);
    });

});
