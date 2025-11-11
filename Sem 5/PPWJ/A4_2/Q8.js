let size = 5;
let table = [];

for (let i = 1; i <= size; i++) {
  let row = [];
  for (let j = 1; j <= size; j++) {
    row.push(i * j);
  }
  table.push(row);
}

for (let i = 0; i < table.length; i++) {
  console.log(table[i].join(" "));
}
