const prompt = require("prompt-sync")();

let randomNumber = Math.floor(Math.random() * 6);
let question = prompt("Ask the Magic 8-Ball a question: ");

switch (randomNumber) {
  case 0:
    answer = "Yes";
    break;
  case 1:
    answer = "No";
    break;
  case 2:
    answer = "Maybe";
    break;
  case 3:
    answer = "Ask again later.";
    break;
  case 4:
    answer = "Try once more";
    break;
  case 5:
    answer = "Absolutely!";
    break;
  default:
    answer = "Hmm... something went wrong!";
}
console.log(`Magic 8-Ball response: ${answer}`);

// Output
// Ask the Magic 8-Ball a question: Should I skip lunch today?
// Magic 8-Ball response: Maybe