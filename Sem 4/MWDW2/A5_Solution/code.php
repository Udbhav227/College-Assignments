<?php
// 1. Odd Numbers from 50 to 100 (Descending Order) Using While Loop
function displayOddNumbersDescending($start = 100, $end = 50) {
    $num = $start;
    while ($num >= $end) {
        if ($num % 2 != 0) {
            echo "$num ";
        }
        $num--;
    }
    echo "\n";
}

displayOddNumbersDescending();

// 2. Employee Salary Calculation
function calculateSalary($workingHours, $ratePerHour) {
    return $workingHours * $ratePerHour;
}

echo "Employee Salary: " . calculateSalary(160, 15) . "\n";

// 3. LCM of Two Numbers
function findLCM($num1, $num2) {
    $max = max($num1, $num2);
    while (true) {
        if ($max % $num1 == 0 && $max % $num2 == 0) {
            return $max;
        }
        $max++;
    }
}

echo "LCM: " . findLCM(12, 15) . "\n";

// 4. Days to Years, Months, and Days Conversion
function convertDays($days) {
    $years = intdiv($days, 365);
    $days %= 365;
    $months = intdiv($days, 30);
    $days %= 30;
    echo "$years Years, $months Months, $days Days\n";
}

convertDays(500);

// 5. Leap Year Check
function isLeapYear($year) {
    return ($year % 4 == 0 && $year % 100 != 0) || ($year % 400 == 0);
}

echo isLeapYear(2024) ? "Leap Year\n" : "Not a Leap Year\n";

// 6. Indexed Array for Student Names
$students = ["Alice", "Bob", "Charlie", "David", "Eve"];
foreach ($students as $student) {
    echo "$student\n";
}

// 7. Associative Array for Fruits and Colors
$fruits = ["Apple" => "Red", "Banana" => "Yellow", "Grapes" => "Purple", "Orange" => "Orange", "Lemon" => "Green"];
foreach ($fruits as $fruit => $color) {
    echo "$fruit: $color\n";
}

// 8. Sorting an Array in Ascending Order
$numbers = [34, 12, 89, 5, 77];
sort($numbers);
foreach ($numbers as $num) {
    echo "$num ";
}

echo "\n";

// 9. Multidimensional Array for Student Marks
$studentsMarks = [
    "Alice" => [85, 78, 90, 88, 76],
    "Bob" => [65, 58, 70, 68, 66],
    "Charlie" => [95, 88, 92, 91, 90]
];
foreach ($studentsMarks as $name => $marks) {
    $total = array_sum($marks);
    echo "$name: $total\n";
}

// 10. Printing Patterns
// a) Alphabet Pyramid Pattern
$letters = range('A', 'E');
for ($i = 0; $i < count($letters); $i++) {
    echo str_repeat(' ', count($letters) - $i - 1);
    echo implode(' ', array_slice($letters, 0, $i + 1));
    echo ' ' . implode(' ', array_reverse(array_slice($letters, 0, $i))) . "\n";
}

echo "\n";

// b) Star Diamond Pattern
$rows = 5;
for ($i = 1; $i <= $rows; $i++) {
    echo str_repeat(' ', $rows - $i);
    echo str_repeat('* ', $i) . "\n";
}
for ($i = $rows - 1; $i >= 1; $i--) {
    echo str_repeat(' ', $rows - $i);
    echo str_repeat('* ', $i) . "\n";
}

echo "\n";

// c) Zero-One Pyramid Pattern
for ($i = 1; $i <= 5; $i++) {
    echo str_repeat('0 ', 6 - $i) . "\n";
}
for ($i = 1; $i <= 5; $i++) {
    echo str_repeat('1 ', $i) . "\n";
}

echo "\n";

// 11. Multiplication Table (1 to 10)
for ($i = 1; $i <= 10; $i++) {
    for ($j = 1; $j <= 10; $j++) {
        echo $i * $j . "\t";
    }
    echo "\n";
}

// 12. Shape Area Calculation
function calculateArea($shape, $a, $b = null) {
    switch (strtolower($shape)) {
        case "triangle":
            return 0.5 * $a * $b;
        case "rectangle":
            return $a * $b;
        case "square":
            return $a * $a;
        case "circle":
            return pi() * $a * $a;
        default:
            return "Invalid shape";
    }
}

echo "Triangle Area: " . calculateArea("triangle", 5, 10) . "\n";

// 13. Subtraction Function with User Input
function subtract($num1, $num2) {
    return $num1 - $num2;
}

$num1 = (int)readline("Enter the first number: ");
$num2 = (int)readline("Enter the second number: ");
echo "Subtraction Result: " . subtract($num1, $num2) . "\n";

// 14. Number Swapping
// a) Using Third Variable
$a = 10; $b = 20;
$temp = $a;
$a = $b;
$b = $temp;
echo "Swapped using third variable: a=$a, b=$b\n";

// b) Without Third Variable
$a = 10; $b = 20;
$a = $a + $b;
$b = $a - $b;
$a = $a - $b;
echo "Swapped without third variable: a=$a, b=$b\n";

// c) Using * and /
$a = 10; $b = 20;
$a = $a * $b;
$b = $a / $b;
$a = $a / $b;
echo "Swapped using * and /: a=$a, b=$b\n";

// 15. Personalized Greeting Function
function greet($name) {
    echo "Hello, $name!\n";
}

$name = readline("Enter your friend's name: ");
greet($name);

?>
