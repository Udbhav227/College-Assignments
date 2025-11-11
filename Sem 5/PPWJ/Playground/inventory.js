// Create an array of items in an inventory withing that array create item object, each item object contains
// name, quantity (integer) and price. Display all the items that have quantity less than 10.
// Sort all the items in terms of price then create a new array that contains only the names of the item
// Add a new item {name: "webcame", quantity: 12, price: 2,500}

const inventory = [
  {
    name: "Smartphone",
    quantity: 15,
    price: 20000,
  },  
  {
    name: "Laptop",
    quantity: 9,
    price: 60000,
  },
  {
    name: "Keyboard",
    quantity: 8,
    price: 3500,
  },
];

// All the items that have quantity less than 10
console.log("Items with quantity less than 10:");
for (item of inventory) {
  if (item.quantity < 10) {
    console.log(item);
  }
}

// Sorting in terms of price
inventory.sort((a, b) => a.price - b.price);
console.log("\nInventory sorted by price:");
console.log(inventory);

const itemNames = [];
for (item of inventory) {
  itemNames.push(item.name);
}
console.log("\nArray of item names:");
console.log(itemNames);

inventory.push({ name: "Webcam", quantity: 12, price: 2500 });
console.log("\nUpdated inventory: ", inventory);

