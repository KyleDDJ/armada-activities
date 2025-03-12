const container = document.getElementById("container");
const message = document.getElementById("message");
const buttons = document.querySelectorAll(".color-box");
const title = document.getElementById("title");
const instruction = document.getElementById("instruction");

buttons.forEach(button => {
    button.addEventListener("click", function(event) {
        event.stopPropagation();
        
        // Get selected color from dataset
        const selectedColor = this.dataset.color;

        // Update container and body background color
        container.style.backgroundColor = selectedColor;
        document.body.style.backgroundColor = selectedColor;

        // Update text message
        message.textContent = "Selected Color: " + this.textContent;

        // Change text color based on selection
        if (selectedColor === "yellow") {
            title.style.color = "black";
            instruction.style.color = "black";
            message.style.color = "black";
        } else {
            title.style.color = "white";
            instruction.style.color = "white";
            message.style.color = "white";
        }

        // Remove active class from all buttons
        buttons.forEach(btn => btn.classList.remove("active"));
        
        // Add active class to the selected button
        this.classList.add("active");
    });
});

// Reset background and text colors when clicking the container
container.addEventListener("click", function(event) {
    event.stopPropagation(); // Prevents event bubbling
    
    // Reset colors
    this.style.backgroundColor = "lightgray";
    document.body.style.backgroundColor = "white";
    message.textContent = "Selected Color: None";

    // Reset text color to black (default)
    title.style.color = "black";
    instruction.style.color = "black";
    message.style.color = "black";

    // Remove active class from buttons
    buttons.forEach(btn => btn.classList.remove("active"));
});