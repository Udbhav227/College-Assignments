let amount = Number(prompt("Enter purchase amount:"));

if (amount < 0) {
  console.log("Invalid input! Purchase amount cannot be negative.");
} else {
  let discount = 0;

  if (amount >= 100) discount = 20;
  else if (amount >= 50) discount = 10;

  let savings = (amount * discount) / 100;
  let finalPrice = amount - savings;

  console.log("Discount: " + discount + "%");
  console.log("You saved: Rs." + savings);
  console.log("Final Price: Rs." + finalPrice);
}
