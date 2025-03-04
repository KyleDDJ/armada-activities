//Tasks/Challenges

//Challenge 1:
function calculateSum(arr) {
    let sum = 0;
    for (let i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
}
  
  let numbers = [1, 2, 3, 4];
  console.log("Sum:", calculateSum(numbers));

//Predicted Output: Sum: 10  // Actual Output: Sum: 10

//Challenge 2:
function isEven(num) {
    if (num % 2 === 0) {
      return true;
    } else {
      return false;
    }
  }
  
  console.log(isEven(4));
  console.log(isEven(7));
  console.log(isEven(0));

  /*Predicted Output:
  Hello, Alice!
  Hello, Bob!
  Hello, Charlie!

  Actual Output:
  Hello, Alice!
  Hello, Bob!
  Hello, Charlie!*/

//Challenge 3:
  function greet(name) {
    return "Hello, " + name + "!";
  }
  
  function personalizedGreeting(names) {
    for (let i = 0; i < names.length; i++) {
      console.log(greet(names[i]));
    }
  }
  
  let friends = ["Alice", "Bob", "Charlie"];
  personalizedGreeting(friends);  

/*Predicted Output:
true
false
true

Actual Output:
true
false
true*/

// Challenge 4:
  function reverseArray(arr) {
    let reversed = [];
    for (let i = arr.length - 1; i >= 0; i--) {
      reversed.push(arr[i]);
    }
    return reversed;
  }
  
  let originalArray = [10, 20, 30];
  console.log(reverseArray(originalArray));
  console.log(originalArray);

/*Predicted Output:
[30, 20, 10]
[10, 20, 30]

Actual Output:
[30, 20, 10]
[10, 20, 30]*/


// Challenge 5:
function multiplyMatrix(matrix) {
  for (let i = 0; i < matrix.length; i++) {
    for (let j = 0; j < matrix[i].length; j++) {
      matrix[i][j] *= 2;
    }
  }
  return matrix;
}

let matrix = [
  [1, 2],
  [3, 4],
];
console.log(multiplyMatrix(matrix));

/*Predicted Output: I can't the answer for this one.

Actual Output:
[Array(2), Array(2)]
*/