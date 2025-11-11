let arr = [5, 2, 8, 3, 9, 2, 5];
let choice = 7;

switch (choice) {
  case 1:
    console.log("Array elements:");
    for (let i = 0; i < arr.length; i++) console.log(arr[i]);
    break;

  case 2:
    let sum = 0, max = arr[0], min = arr[0];
    for (let i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (arr[i] > max) max = arr[i];
      if (arr[i] < min) min = arr[i];
    }
    console.log("Sum:", sum, "Max:", max, "Min:", min);
    break;

  case 3:
    let even = 0, odd = 0;
    for (let i = 0; i < arr.length; i++)
      arr[i] % 2 === 0 ? even++ : odd++;
    console.log("Even:", even, "Odd:", odd);
    break;

  case 4:
    let rev = [];
    for (let i = arr.length - 1; i >= 0; i--) rev[rev.length] = arr[i];
    console.log("Reversed:", rev);
    break;

  case 5:
    let search = 3;
    let found = -1;
    for (let i = 0; i < arr.length; i++)
      if (arr[i] === search) { found = i; break; }
    console.log(found !== -1 ? `Found at index ${found}` : "Not found");
    break;

  case 6:
    let unique = [];
    for (let i = 0; i < arr.length; i++) {
      let dup = false;
      for (let j = 0; j < unique.length; j++)
        if (arr[i] === unique[j]) { dup = true; break; }
      if (!dup) unique[unique.length] = arr[i];
    }
    console.log("Without duplicates:", unique);
    break;

  case 7:
    for (let i = 0; i < arr.length - 1; i++)
      for (let j = i + 1; j < arr.length; j++)
        if (arr[i] > arr[j]) {
          let t = arr[i];
          arr[i] = arr[j];
          arr[j] = t;
        }
    console.log("Sorted:", arr);
    break;

  default:
    console.log("Invalid choice");
}
