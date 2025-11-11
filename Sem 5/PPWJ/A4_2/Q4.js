let sales = [
  { day: "Mon", sale: 200 },
  { day: "Tue", sale: 500 },
  { day: "Wed", sale: 900 },
  { day: "Thu", sale: 300 },
  { day: "Fri", sale: 800 },
  { day: "Sat", sale: 1200 },
  { day: "Sun", sale: 700 },
];

let total = 0;
let max = sales[0].sale, min = sales[0].sale;
let maxDay = 0, minDay = 0;

for (let i = 0; i < sales.length; i++) {
  total += sales[i].sale;

  if (sales[i].sale > max) {
    max = sales[i].sale;
    maxDay = i;
  }

  if (sales[i].sale < min) {
    min = sales[i].sale;
    minDay = i;
  }
}

console.log("Total:", total);
console.log("Average:", total / sales.length);
console.log("Highest:", max, "on", sales[maxDay].day);
console.log("Lowest:", min, "on", sales[minDay].day);
