const prompt = require("prompt-sync")();

let value = Number(prompt("Choose a number: "));

const num = 100;
let message = "nothing";

if (value > num) {
  message = value + " was greater than " + num;
} else if (value === num) {
  message = value + " was equal to " + num;
} else {
  message = value + " is less than " + num;
}

console.log(message);
