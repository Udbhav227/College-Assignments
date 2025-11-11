const prompt = require("prompt-sync")();

const prize = Number(prompt("Choose a number between 0 and 10: "));
const outputMessage = "My Selection: ";

let prizeMessage;

switch (prize) {
  case 0:
    prizeMessage = "Unlucky! Better luck next time!";
    break;
  case 1:
  case 2:
    prizeMessage = "You win a Kit Kat!";
    break;
  case 3:
  case 4:
  case 5:
    prizeMessage = "You win a Iphone 16 Pro!";
    break;
  case 6:
  case 7:
    prizeMessage = "You win a amazon gift card!";
    break;
  case 8:
  case 9:
    prizeMessage = "You win a Boat Bluetooth speaker!";
    break;
  case 10:
    prizeMessage = " You win a brand new Macbook!";
    break;
  default:
    prizeMessage = "Invalid choice! Try a number between 0 and 10.";
}

console.log(outputMessage + prize + " -- " + prizeMessage);