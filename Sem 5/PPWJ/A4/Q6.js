let shipCode = prompt("Enter the first letter of the ship's serial number");

switch (shipCode.toLowerCase) {
  case "b" || "B":
    console.log("Battleship");
    break;
  case "c" || "C":
    console.log("Cruiser");
    break;
  case "d" || "D":
    console.log("Destroyer");
    break;
  case "f" || "F":
    console.log("Frigate");
    break;
  default:
    console.log("Unknown");
}

