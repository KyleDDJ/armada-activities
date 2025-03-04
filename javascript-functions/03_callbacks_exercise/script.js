//task 1
function calculate(num1, num2, operation) {
      return operation(num1, num2);
  }
  
  function add(a, b) {
      return a + b;     
  }
  
  function multiply(a, b) {
      return a * b;    
  }
  
  //added callback function
  function subtract(a, b) {
      return a - b;     //subract the second number to first number and return result.
  }
  
  function divide(a, b) {
      if (b !== 0) {     //This function checks if the divisor (b) is not zero.
          return a / b;     //Otherwise, it returns the division result.
      } else {
          return 'Cannot divide by zero';     //If b is zero, it returns the message: "Cannot divide by zero".
      }
  }
  
  console.log(calculate(20, 3, add));
  console.log(calculate(24, 2, multiply));
  console.log(calculate(10, 9, subtract)); 
  console.log(calculate(12, 4, divide));
  console.log(calculate(12, 0, divide));

//task 2
function delayedMessage(message, delay, beforeCallback, afterCallback) {
    beforeCallback();     // This callback runs before the delay    
    setTimeout(() => {
        afterCallback(message);     // This callback runs after the delay
    }, delay);
}

delayedMessage("Hello, world!", 2000, 
    function() { console.log("Starting delay..."); }, 
    function(msg) { console.log(msg); }
);

//task 3
function repeatTask(times, callback) {
    for (let i = 0; i < times; i++) {
        if (callback(i) === false) {
            break;
        }
    }
}

repeatTask(5, function(index) {
    console.log("Iteration:", index);
    if (index === 2) {
        return false;      // Stop early at iteration 2
    }
});