// Calculate net salary
let basic = 50000;

let hra = (basic * 20) / 100;
let da = (basic * 10) / 100;
let gross = basic + hra + da;

let tax = basic > 1000 ? (gross * 5) / 100 : 0;

let netSalary = gross - tax;

console.log("Tax: Rs." + tax);
console.log("Net Salary: Rs." + netSalary);