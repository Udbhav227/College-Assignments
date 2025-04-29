function isArmstrongNumber(num) {
  const digits = String(num).split("");
  const numDigits = digits.length;

  const sum = digits.reduce((total, digit) => {
    return total + Math.pow(Number(digit), numDigits);
  }, 0);

  return sum === num;
}

// Example usage
console.log(isArmstrongNumber(153)); // true (1³ + 5³ + 3³ = 153)
console.log(isArmstrongNumber(9474)); // true (9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474)
console.log(isArmstrongNumber(123)); // false
