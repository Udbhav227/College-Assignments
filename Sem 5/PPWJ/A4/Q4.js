let rollNumber = Number(prompt("Enter roll number:"));

if (rollNumber % 3 === 0 && rollNumber % 5 === 0) {
  console.log("Qualified!");
} else {
  console.log("Not qualified.");
}
