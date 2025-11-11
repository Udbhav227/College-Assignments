let marks = [
  [85, 90, 78],
  [88, 76, 92],
  [80, 85, 89]
];

for (let i = 0; i < marks.length; i++) {
  let total = 0;
  for (let j = 0; j < marks[i].length; j++) {
    total += marks[i][j];
  }
  console.log("Student", i + 1, "Total:", total);
}
