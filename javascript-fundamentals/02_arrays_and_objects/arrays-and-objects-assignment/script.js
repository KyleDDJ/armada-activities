// Task 1: Create and Use an Object
let book = {
    title: "The Subtle Art of Not Giving a F*ck",
    author: "Mark Manson",
    pages: 212,
    isRead: false
};

// Access and print properties using: Dot notation, Bracket notation
console.log(book.title);
console.log(book.author);
console.log(book.pages);
console.log(book.isRead);

console.log(book["tittle"]);
console.log(book["author"]);
console.log(book["pages"]);
console.log(book["isRead"]);

// Update properties
book.isRead = true;
book.genre = "Self-Help";

console.log(book);


// Task 2: Create and Modify an Array of Objects
let movies = [
    { title: "Attack on Titan Crimson Bow and Arrow", director: "Tetsurō Araki", year: 2014 },
    { title: "Attack on Titan: The Wings of Freedom", director: "Tetsurô Araki ", year: 2015 },
    { title: "Attack on Titan: The Roar of Awakening", director: "Masashi Koizuka", year: 2018 }
];

// Print title of second movie
console.log(movies[1].title);

// Add a new movie
movies.push({ title: "Attack on Titan: Chronicle", director: "Tetsurō Araki, Masashi Koizuka", year: 2020 });

// Update year of the first movie
movies[0].year = 2023;

console.log(movies);  // Print updated array


// Task 3: Combine Objects and Arrays
let student = {
    name: "Calvin Kyle",
    age: 23,
    subjects: ["Math", "Video Editing", "Blender"]
};

// Print first subject
console.log(student.subjects[0]);

// Add new subject
student.subjects.push("Programming");

console.log(student);  // Print updated object


// Task 4: Challenge Task (Optional)
let recipe = {
    name: "Carbonara",
    ingredients: [
        { name: "Spaghetti", quantity: "250g", isVegetarian: false },
        { name: "Eggs", quantity: "2 pieces", isVegetarian: true },
        { name: "Bacon", quantity: "150g", isVegetarian: false }
    ]
};

// Add new ingredient
recipe.ingredients.push({ name: "Parmesan Cheese", quantity: "50g", isVegetarian: true });

// Print second ingredient name
console.log(recipe.ingredients[1].name); // Output: Eggs

// Print entire recipe object
console.log(recipe);
