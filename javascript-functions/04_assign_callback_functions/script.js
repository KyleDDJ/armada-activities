//task 1
function customFilter(arr, callback) {
    // Your code here
    let filteredNumbers = []; //the empty array where the filtered element will be stored.
    for (let i = 0; i < arr.length; i++) { 
        if (callback(arr[i])) { //calls the callback function which is isEven with current element.
            filteredNumbers.push(arr[i]); //if the call back is true, the current element is added to the filteredArray using push().
        }
    }
    return filteredNumbers;
}

function isEven(num) {
    return num % 2 === 0;
}

var numbers = [1, 2, 3, 4, 5, 6];
var evenNumbers = customFilter(numbers, isEven);
console.log(evenNumbers);  // Output: [2, 4, 6]

//task 2
function countdown(start, callback) {
    let currentNum = start; //initialize a variable currentNum with value of start
    let timerNum = setInterval(function () {
        callback(currentNum); //calls the callback function
        if (currentNum === 0) { //check if the number is 0
            console.log("Time's up!"); //will print along with 0 
            clearInterval(timerNum); //stops the timer
        }
        currentNum--; // Decrease current number by 1
    }, 1000); //1000 millisecond = 1 second delay
}

function displayNumber(num) {
    console.log(num);
}

countdown(5, displayNumber);  // Output: 5 4 3 2 1 0 (with 1-second delay between each)

//task 3
function createButton(buttonText, callback) {
    let button = document.createElement("button"); // Create button element
    button.innerText = buttonText; // Set button text
    document.body.appendChild(button); // Add button to the page
    button.addEventListener("click", callback); // Attach click event listener
}
function buttonClicked() {
    console.log("Button Clicked!");
}

createButton("Click Me", buttonClicked);

//task 4
function runTasks(tasks) {
    let index = 0; // Start from the first task
    let timer = setInterval(function () {
        tasks[index](); // Execute current task
        index++; // Move to the next task
        if (index === tasks.length) { 
            clearInterval(timer); // Stop the execution
        }
    }, 1000); // 1 second delay
}
function task1() {
    console.log("Task 1 completed");
}

function task2() {
    console.log("Task 2 completed");
}

function task3() {
    console.log("Task 3 completed");
}

runTasks([task1, task2, task3]);

//task 5
function askQuestion(question, choices, correctAnswer, callback) {
    let userAnswer = prompt(`${question}\n${choices.join("\n")}`);  //displays the question with answer choices in a dialog box
    callback(userAnswer === correctAnswer); //compares the user’s input to the correct answer, result (true or false) is passed to the callback() function
}

function checkAnswer(isCorrect) {
    if (isCorrect) {
        console.log("Correct!");
    } else {
        console.log("Wrong!");
    }
}

askQuestion("What is 2 + 2?", ["1", "2", "3", "4"], "4", checkAnswer);