let num = 1234;
let temp = num, sum = 0;

while (temp > 0) {
  sum += temp % 10;
  temp = Math.floor(temp / 10);
}

let isPrime = true;
if (sum < 2) isPrime = false;
else {
  for (let i = 2; i <= sum / 2; i++) {
    if (sum % i === 0) {
      isPrime = false;
      break;
    }
  }
}

console.log("Code:", num);
console.log("Sum of digits:", sum);
console.log(isPrime ? "Sum is prime numner" : "Not a prime digit sum");


