const student = {
  name: "Ash",
  age: 16,
  marks: [78, 85, 90],
};

student.marks.push(95);

student.marks.sort()
const highest = student.marks[student.marks.length - 1];
console.log("Highest mark:", highest);
