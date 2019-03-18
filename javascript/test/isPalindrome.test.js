const isPalindrome = require('../src/isPalindrome');
const testData = require('./testData');

test('isPalindrome', () => {

    testData.forEach(({value, result}) => {
        expect(isPalindrome(value)).toBe(result);
    });

});
