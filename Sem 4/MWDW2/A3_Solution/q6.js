function filterOddNumbers(numbers) {
  return numbers.filter((num) => num % 2 !== 0);
}

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
const oddNumbers = filterOddNumbers(numbers);
console.log(oddNumbers); 
// Output: [1, 3, 5, 7, 9]