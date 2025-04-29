let sum = 0, count = 0, num = 2;
while (count < 1000) {
  let isPrime = true;
  for (let i = 2; i <= Math.sqrt(num); i++)
    if (num % i === 0) {
      isPrime = false;
      break;
    }
  if (isPrime) {
    sum += num;
    count++;
  }
  num++;
}
console.log("Sum:", sum);
// Sum: 3682913