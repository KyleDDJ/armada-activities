**JavaScript Challenge II**

**Task 1: Inventory Tracker**

**Given Code:**
```javascript
let inventory = ["apple", "banana", "cherry", "date", "elderberry"];
let inventoryCount = [10, 15, 5, 20, 7];

for (let i = 0; i < inventory.length; i++) {
  console.log(`${inventory[i]}: ${inventoryCount[i]}`);
}
```

**Output:**
```
apple: 10
banana: 15
cherry: 5
date: 20
elderberry: 7
```

**Explanation:**
- Represents an **Inventory Tracker** displaying fruits with their quantities.
- `inventory` array stores fruit names.
- `inventoryCount` array holds corresponding quantities.
- The `for` loop iterates through the `inventory` array.
- Uses **template literals** to print fruit names with their quantities.

---

**Task 2: Alphabetical Sorting**

**Given Code:**
```javascript
let words = ["zebra", "apple", "mango", "cherry", "banana"];

for (let i = 0; i < words.length; i++) {
  for (let j = i + 1; j < words.length; j++) {
    if (words[i] > words[j]) {
      let temp = words[i];
      words[i] = words[j];
      words[j] = temp;
    }
  }
}

console.log(words);
```

**Output:**
```
["apple", "banana", "cherry", "mango", "zebra"]
```

**Explanation:**
- Sorts an array of **words alphabetically**.
- Outer loop selects each word.
- Inner loop compares selected word with remaining words.
- If the selected word is greater than the compared word, their positions are swapped.
- Uses a **temporary variable** for swapping.

---

**Task 3: Unique Array Builder**

**Given Code:**
```javascript
let uniqueNumbers = [];

while (uniqueNumbers.length < 10) {
  let randomNumber = Math.floor(Math.random() * 20) + 1;

  let exists = false;
  for (let i = 0; i < uniqueNumbers.length; i++) {
    if (uniqueNumbers[i] === randomNumber) {
      exists = true;
      break;
    }
  }

  if (!exists) {
    uniqueNumbers.push(randomNumber);
  }
}

console.log(uniqueNumbers);
```

**Output:**
```
[4, 15, 8, 12, 1, 20, 5, 9, 17, 3]
```

**Explanation:**
- Builds an array of **10 unique random numbers** between 1 and 20.
- `while` loop runs until the array reaches 10 elements.
- Random number generated using `Math.random()` and `Math.floor()`.
- `for` loop checks for duplicate numbers.
- If the number does not exist, it is added using **`push()`** method.

---

**Task 4: Triangle Checker**

**Given Code:**
```javascript
let sideA = 7;
let sideB = 10;
let sideC = 5;

if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
  console.log(`The sides ${sideA}, ${sideB}, and ${sideC} form a valid triangle.`);
} else {
  console.log(`The sides ${sideA}, ${sideB}, and ${sideC} do not form a valid triangle.`);
}
```

**Output:**
```
The sides 7, 10, and 5 form a valid triangle.
```

**Explanation:**
- Checks if three sides form a **valid triangle**.
- Uses **triangle inequality theorem**: The sum of any two sides must be greater than the third side.
- `if` statement checks all combinations of sides.
- Outputs whether the triangle is valid or not.

