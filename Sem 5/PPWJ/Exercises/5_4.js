// Create a grid array variable
let grid = [];

// Set a value of 64 for number of cells
let totalCells = 64;

// Set a counter to 0
let counter = 0;

// Create a global variable for the row array
let row;

const columns = 8;

// Create a loop up to totalCells + 1
for (let i = 0; i <= totalCells; i++) {

  // Check if counter is divisible by number of columns
  if (counter % columns === 0) {

    // Check if row is defined
    if (row !== undefined) {
      grid.push(row);
    }

    // Clear the row array if divisible
    row = [];
  }

  // Temporary variable to hold counter value
  let temp = counter;

  row.push(temp);

  // If counter equals totalCells, add the last row
  if (counter === totalCells) {
    grid.push(row);
  }

  counter++;
}

console.log(grid);
