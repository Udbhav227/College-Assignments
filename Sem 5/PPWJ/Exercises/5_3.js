let myWork = [];

for (let i = 1; i <= 10; i++) {
  let status = i % 2 === 0 ? false : true;
  let lesson = {
    name: `Lesson ${i}`,
    status,
  };
  myWork.push(lesson);
}

console.log(myWork);
