const max = 5;
const randomNumber = Math.floor(Math.random() * max) + 1;
console.log("Generated random number:", randomNumber);

let isCorrect = false;

while (!isCorrect) {
  let guess = Number(prompt(`Enter a number between 1 and ${max}:`));

  if (guess === randomNumber) {
    alert("Correct Guess! Let's gooo!");
    isCorrect = true;
  } else if (guess > randomNumber) {
    alert("Too high! Try again.");
  } else if (guess < randomNumber) {
    alert("Too low! Try again.");
  } else {
    alert("Invalid input. Please enter a number.");
  }
}
