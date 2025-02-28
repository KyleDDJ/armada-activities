// Task 1: For Loop to print numbers 1-10
console.log("Task 1: Numbers 1-10");
for (let i = 1; i <= 10; i++) {
    console.log(i);
}

// Task 2: For Loop to print even numbers between 1-20
console.log("Task 2: Even Numbers between 1-20");
for (let i = 2; i <= 20; i += 2) {
    console.log(i);
}

// Task 3: Nested Loop to create a 5x5 grid of asterisks
console.log("Task 3: 5x5 Grid of Asterisks");
for (let i = 0; i < 5; i++) {
    let row = "";
    for (let j = 0; j < 5; j++) {
        row += "* ";
    }
    console.log(row);
}

// Task 4: Array Iteration using For Loop
console.log("Task 4: Array Iteration");
let fruits = ["Apple", "Banana", "Cherry", "Date"];
for (let i = 0; i < fruits.length; i++) {
    console.log(fruits[i]);
}

// Task 5: Reverse Array Elements
console.log("Task 5: Reverse Array Elements");
let numbers = [1, 3, 5, 7, 9];
for (let i = numbers.length - 1; i >= 0; i--) {
    console.log("Reversed Element:", numbers[i]);
}
