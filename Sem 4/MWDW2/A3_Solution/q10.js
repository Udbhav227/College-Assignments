function calculator(num1, operator, num2) {
  switch (operator) {
    case "+":
      return num1 + num2;
    case "-":
      return num1 - num2;
    case "*":
      return num1 * num2;
    case "/":
      return num2 !== 0 ? num1 / num2 : "Error: Division by zero";
    case "%":
      return num2 !== 0 ? num1 % num2 : "Error: Modulo by zero";
    default:
      return "Error: Invalid operator";
  }
}

// Example usage
console.log(calculator(5, "+", 3)); // Output: 8
console.log(calculator(10, "-", 4)); // Output: 6
console.log(calculator(7, "*", 2)); // Output: 14
console.log(calculator(8, "/", 2)); // Output: 4
console.log(calculator(9, "%", 4)); // Output: 1
console.log(calculator(5, "/", 0)); // Output: Error: Division by zero
console.log(calculator(5, "x", 3)); // Output: Error: Invalid operator
