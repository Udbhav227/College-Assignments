// Use a function createStudentResult and pass all the four parameters name, mark1, mark2, mark3
// calculate the total, avg, and assign a grade based on the average
// if avg >= 90 A, >= 75 B, >= 60 C otherwise D
// return an object from the function containing name, total, avg and grade

let studentName = prompt("Enter name of the student: ");
let marks1 = prompt("Enter mark1: ")
let marks2 = prompt("Enter mark1: ")
let marks3 = prompt("Enter mark1: ")


function createStudentResult(name, mark1, mark2, mark3) {
  let total = mark1 + mark2 + mark3;
  let avg = total / 3;
  let grade;

  if (avg >= 90) {
    grade = "A";
  } else if (avg >= 75) {
    grade = "B";
  } else if (avg >= 60) {
    grade = "C";
  } else {
    grade = "D";
  }

  return {
    name: name,
    total: total,
    avg: avg.toFixed(2),
    grade: grade,
  };
}

let student = createStudentResult("Udbhav", 95, 88, 92);
console.log(student);
