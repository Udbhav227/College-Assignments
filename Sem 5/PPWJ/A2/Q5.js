// Check if year is leap year
let year = Number(prompt("Enter a year: "));

let result = ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) 
    ? `Year ${year} is a leap year.` 
    : `Year ${year} is not a leap year.`;

console.log(result);