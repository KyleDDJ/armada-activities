//Task 1 Grading System
let score = 89;

if (score >= 90 && score <= 100) {
    console.log("Grade A");
} else if (score >= 80 && score <= 89) {
    console.log("Grade B");
} else if (score >= 70 && score <= 79) {
    console.log("Grade C");
} else if (score >= 60 && score <= 69) {
    console.log("Grade D");
} else {
    console.log("Grade F");
}

//Task 2 Weather Advisor
let tempearture = 30;

if (tempearture < 0) {
    console.log("It's freezing outside! Bundle up!");
} else if (tempearture >= 0 && tempearture <= 15) {
    console.log("It's cold outside. Wear a jacket.")
} else if (tempearture >= 16 && tempearture <= 30) {
    console.log("The weather is nice. Enjoy your day!");
} else {
    console.log("It's hot outside. Stay hydrated!")
}

//Task 3 Eligibility Checker
let age = 18;

if (age < 13) {
    console.log("You are too young for this activity.");
} else if (age >= 13 && age <= 17) {
    console.log("You need parental permission.");
} else {
    console.log("You are eligible for this activity.");
}

//Task 4 Ticket Price Calculator
let ageage = 10;
let isMember = true;

if (ageage < 12) {
    console.log("Ticket is free");
} else if (ageage >= 12 && isMember ) {
    console.log("Ticket costs $10");
} else {
    console.log("Ticket cost $15");
}