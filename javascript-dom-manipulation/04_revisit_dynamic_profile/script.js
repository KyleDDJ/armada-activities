/**
 * DOCU: Profile Card Editor Functions
 * This version uses addEventListener() to update all elements at once.
 */

/**
 * Function to show message feedback.
 */
function showMessage(message, type) {
    const messageBox = document.createElement("p");
    messageBox.textContent = message;
    messageBox.style.color = type === "error" ? "red" : "green";
    messageBox.className = "message-box";
    document.querySelector(".inputs").appendChild(messageBox);
    setTimeout(() => messageBox.remove(), 2000);
}

/**
 * Function to update content dynamically.
 */
function updateContent(inputId, targetId, property) {
    const input = document.getElementById(inputId).value.trim();
    const targetElement = document.getElementById(targetId);

    if (input) {
        targetElement[property] = input;
    }
}

/**
 * Function to update the profile card.
 */
function updateProfile() {
    updateContent("nameInput", "profileName", "innerText");
    updateContent("bioInput", "profileBio", "innerText");
    updateContent("imageInput", "profileImage", "src");

    const newColor = document.getElementById("colorInput").value;
    if (newColor) {
        document.querySelector(".profile-card").style.backgroundColor = newColor;
    }

    showMessage("Profile updated successfully!", "success");
}

// Attach the update function to the button using addEventListener
document.querySelector(".button-color").addEventListener("click", updateProfile);
