/**
 * DOCU: Profile Card Editor Functions
 * These functions allow users to dynamically update the profile card information, including name, bio, image URL, and background color.
 * The functions validate input values before applying the changes.
 */

/**
 * Function to show message feedback.
 * @param {string} message - Message to display.
 * @param {string} type - Type of message ('success' or 'error').
 */
function showMessage(message, type) {
    const messageBox = document.createElement("p");
    messageBox.textContent = message;
    messageBox.style.color = type === "error" ? "red" : "green";
    messageBox.className = "message-box"; // Added class for easier styling
    document.querySelector(".inputs").appendChild(messageBox);
    setTimeout(() => messageBox.remove(), 2000);
}

/**
 * Function to update content dynamically.
 * @param {string} inputId - The input element's ID.
 * @param {string} targetId - The target element's ID.
 * @param {string} property - Property to be updated (e.g., 'innerText', 'src').
 * @param {string} successMessage - Success message text.
 */
function updateContent(inputId, targetId, property, successMessage) {
    const input = document.getElementById(inputId).value.trim();
    const targetElement = document.getElementById(targetId);

    if (input) {
        targetElement[property] = input;
        showMessage(successMessage, "success");
        document.getElementById(inputId).value = ""; // Reset input field
    } else {
        showMessage("Please enter a value.", "error");
    }
}

/**
 * Function to update the profile name.
 */
function updateName() {
    updateContent("nameInput", "profileName", "innerText", "Name updated successfully!");
}

/**
 * Function to update the profile bio.
 */
function updateBio() {
    updateContent("bioInput", "profileBio", "innerText", "Bio updated successfully!");
}

/**
 * Function to update the profile image.
 */
function updateImage() {
    updateContent("imageInput", "profileImage", "src", "Image updated successfully!");
}

/**
 * Function to update the profile card background color.
 */
function updateBackground() {
    const newColor = document.getElementById("colorInput").value;
    if (newColor) {
        document.querySelector(".profile-card").style.backgroundColor = newColor;
        showMessage("Background color updated successfully!", "success");
    } else {
        showMessage("Please select a background color.", "error");
    }
}