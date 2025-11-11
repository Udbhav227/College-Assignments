// 1
let shoppingList = [];

// 2
shoppingList.push("Milk", "Bread", "Apples");

// 3
shoppingList.splice(shoppingList.indexOf("Bread"), 1, "Bananas", "Eggs");

// 4
console.log("Removed last:", shoppingList.pop());

// 5
shoppingList.sort();
console.log("Sorted List:", shoppingList);

// 6
console.log("Index of Milk:", shoppingList.indexOf("Milk"));


// 7 
shoppingList.splice(shoppingList.indexOf("Bananas") + 1, 0, "Carrots", "Lettuce");

// 8
let newList = ["Juice", "Pop"];

// 9
let combined = shoppingList.concat(newList, newList);
console.log("Combined List:", combined);

// 10
console.log("Last index value of Pop:", combined.lastIndexOf("Pop"));
