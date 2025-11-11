let age = Number(prompt("Enter your age:"));
let category, price;

if (age < 12) {
  category = "Child";
  price = 5;
} else if (age < 18) {
  category = "Teen";
  price = 10;
} else if (age < 60) {
  category = "Adult";
  price = 20;
} else {
  category = "Senior";
  price = 15;
}

console.log("Category: " + category);
console.log("Ticket Price: Rs." + price);
