let counter = 0;
let step;

do {
  step = Number(prompt("Enter next step:"));
  counter += step;
  console.log(counter);
} while (counter < 100);

console.log("Final counter value:", counter);
