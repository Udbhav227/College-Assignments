// Check if student is qualified for relay race
const rollNo = Number(prompt("Enter the student's roll number: "));

const result = (rollNo % 3 === 0 && rollNo % 5 === 0) 
    ? "Qualified" 
    : "Not qualified";

console.log(result);