let pin = Number(prompt("Enter PIN:"));
let rev = 0;

for (let n = pin; n > 0; n = Math.floor(n / 10)) {
  rev = rev * 10 + (n % 10);
}

console.log("Original PIN:", pin);
console.log("Reversed PIN:", rev);
