const testData = [
  {value: "", result: true},
  {value: "a", result: true},
  {value: "aba", result: true},
  {value: "abba", result: true},
  {value: "abcba", result: true},
  {value: "1234567890987654321", result: true},
  {value: "abc", result: false},
  {value: "1qaz2wsx3edc4rfv", result: false}
];

module.exports = testData;
