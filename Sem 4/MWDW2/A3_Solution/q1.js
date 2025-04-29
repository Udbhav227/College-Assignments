let a = 2, b = 5;
a = a ^ b;
b = a ^ b;
a = a ^ b;
console.log(a, b);
// 5, 2