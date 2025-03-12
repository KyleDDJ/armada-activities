//Task 1: Custom Map Function
//   let numbers = [1, 2, 4, 6, 8, 10];
//   let doubled = customMap(numbers, function(num) { return num * 2; });
//   console.log(doubled);
//Custom Map Function
function customMap(array, callback) {
    let doubledArr = []; 

    array.forEach(function(item, index) {
      doubledArr.push(callback(item, index, array));
    });
  
    return doubledArr; 
  }

  let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  let doubled = customMap(numbers, function(num) { return num * 2; });
  console.log(doubled); // Should output: [2, 4, 6]

//Task 2: Filter Function
// let result = filter([1,2,3,4,15], function(val) { return val<10; });
// console.log(result); // Should output: [1,2,3,4]
//Filter Function
function filter(array, callback) {
    let filteredArray = [];

  for (let i = 0; i < array.length; i++) {
    if (callback(array[i])) { 
      filteredArray.push(array[i]); 
    }
  }

  return filteredArray; 
}

  let result = filter([1, 2, 3, 4, 15, 26, 100], function(val) { return val < 10;});
  console.log(result);

//Task 3: Some Function
// let result = some([1,2,3,4], function(val) { return val>5; });
// console.log(result); // Should output: true
//Some Function
function some(array, callback) {
    for (let i = 0; i < array.length; i++) {
      if (callback(array[i])) {
        return true;
      }
    }
    return false;
  }

  result = some([1, 2, 3, 4], function(val) { return val > 5; });
  let result2 = some([1, 2, 3, 9], function(val) { return val > 5; });
  console.log(result); //false
  console.log(result2); //true

//task 4: Every Function
// let result = every([1,2,3], function(val) { return val>0; });
// console.log(result); // Should output: true
//Every Function
function every(array, callback) {
    for (let i = 0; i < array.length; i++) {
      if (!callback(array[i])) {
        return false;
      }
    }
    return true;
  }

  result = every([1, 2, 3], function(val) { return val > 0; });
  console.log(result);


//task 5: Reduce Function
// let sum = reduce([1,2,3], function(acc, num) { return acc + num; });
// console.log(sum); // Should output: 6
//Reduce Function
function reduce(array, callback, initialValue) {
    let accumulator = initialValue !== undefined ? initialValue : array[0];
    let startIndex = initialValue !== undefined ? 0 : 1;
  
    for (let i = startIndex; i < array.length; i++) {
      accumulator = callback(accumulator, array[i]); 
    }
  
    return accumulator;
  }

  let sum = reduce([1,2,3,4], function(acc, num) { return acc + num; });
  console.log(sum); // Should output: 6

//task 6: Includes Check
// let result = includes([1,2,3], function(val) { return val===2; });
// console.log(result); // Should output: true
//Includes Function
function includes(array, callback) {
    for (let i = 0; i < array.length; i++) {
      if (callback(array[i])) {
        return true;
      }
    }
    return false;
  }

  result = includes([1, 2, 3], function(val) { return val === 2; });
  console.log(result);