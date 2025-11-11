// Create a tile number calculator for given floor dimensions
let lengthFloor = Number(prompt("Enter the length of the floor: "));
let widthFloor = Number(prompt("Enter the width of the floor: "));

let lengthTile = Number(prompt("Enter the length of one tile: "));
let widthTile = Number(prompt("Enter the width of one tile: "));

let areaFloor = lengthFloor * widthFloor;
let areaTile = lengthTile * widthTile;

let numberOfTiles = areaFloor / areaTile;

let perimeterFloor = 2 * (lengthFloor + widthFloor);

console.log("Area of floor: " + areaFloor + " square units");
console.log("Area of one tile: " + areaTile + " square units");
console.log("Number of tiles required: " + numberOfTiles);
console.log("Perimeter of floor: " + perimeterFloor + " units");
