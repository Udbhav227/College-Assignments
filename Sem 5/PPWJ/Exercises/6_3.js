const person = {
  name : "Ash",
  age : "20",
  city : "Tokyo",
  marks : [10, 20, 30, 40]
}

function displayPerson(person) {
  for (prop in person) {
    console.log(`${prop}: ${person[prop]}`)
  }
  console.log(`total marks: ${calculateTotal(person["marks"])}`)
  console.log(`Average marks: ${calculateAvg(person["marks"])}`)
}

function calculateTotal(arr) {
  return arr.reduce((sum, num) => sum + num)
}

function calculateAvg(arr) {
  return calculateTotal(arr) / arr.length;
}

displayPerson(person)