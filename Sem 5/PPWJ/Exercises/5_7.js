const obj = {
  name: 1,
  age: 20,
  cgpa: 4.5,
};
for (let prop in obj) {
  console.log(prop, obj[prop]);
}
const arr = ["Name", "Age", "CGPA"];
for (let w = 0; w < arr.length; w++) {
  console.log(w, arr[w]);
}
for (el in arr) {
  console.log(el, arr[el]);
}
