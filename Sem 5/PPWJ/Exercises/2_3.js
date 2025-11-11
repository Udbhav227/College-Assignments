const prompt = require("prompt-sync")();

let a = Number(prompt("Enter the value of side a:"));
let b = Number(prompt("Enter the value of side b:"));

let c = ((a ** 2) + (b ** 2)) ** 0.5;

console.log("The hypotenuse (c) is: " + c);
