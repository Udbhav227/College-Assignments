const choices = ["Rock", "Paper", "Scissors"];
let computer = Math.floor(Math.random() * 3);
let player = Math.floor(Math.random() * 3);
let message = "Player: " + choices[player] + " vs Computer: " + choices[computer] + "\n";

if (player === computer) {
  message += "Game tie";
} else if (player > computer) {
  if (computer == 0 && player == 2) {
    message += "Computer Wins";
  } else {
    message += "Player Wins";
  }
} else {
  if (computer == 2 && player == 0) {
    message += "Player Wins";
  } else {
    message += "Computer Wins";
  }
}
console.log(message);
