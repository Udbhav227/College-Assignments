let rows = 5;

for (let i = 0; i < rows; i++) {
  let num = 1;
  let row = "";

  for (let j = 0; j < rows - i - 1; j++) {
    row += " ";
  }

  for (let k = 0; k <= i; k++) {
    row += num + " ";
    num = num * (i - k) / (k + 1);
  }

  console.log(row);
}
