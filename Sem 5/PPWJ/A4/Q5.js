let units = 10;
let bill = 0;

switch (true) {
  case units > 0 && units <= 100:
    bill = units * 5;
    break;

  case units > 100 && units <= 200:
    bill = (100 * 5) + ((units - 100) * 7);
    break;

  case units > 200:
    bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
    break;

  default:
    console.log("Invalid input!");
    bill = null;
}

if (bill !== null) console.log("Total Bill: Rs." + bill);
