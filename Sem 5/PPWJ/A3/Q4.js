let employees = [201, 202, 203, 204, 205];

delete employees[2];
console.log("After delete:", employees, "Length:", employees.length);

employees.splice(2, 1);
console.log("After splice:", employees, "Length:", employees.length);
