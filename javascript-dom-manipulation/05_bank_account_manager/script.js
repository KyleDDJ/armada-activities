/**
 * DOCU: Bank Account Manager Functions
 * These functions allow users to deposit and withdraw money dynamically.
 * The app validates user input, updates the account balance in real time, 
 * and displays notifications for invalid transactions.
 */

document.addEventListener("DOMContentLoaded", function () {
    // Get necessary DOM elements
    const amountInput = document.getElementById("amountInput");
    const currentBalElement = document.getElementById("current-Bal");
    const messageElement = document.getElementById("message");
    const depositBtn = document.getElementById("btn-deposit");
    const withdrawBtn = document.getElementById("btn-withdraw");

    /**
     * Function to update the balance
     * @param {string} amount - The amount entered by the user
     * @param {boolean} isDeposit - Determines if the transaction is a deposit (true) or withdrawal (false)
     */
    function updateBalance(amount, isDeposit) {
        let currentBalance = parseFloat(currentBalElement.textContent.replace("Current Balance: $", ""));
        let transactionAmount = parseFloat(amount);

        // Validate input: Ensure it's a number and greater than zero
        if (isNaN(transactionAmount) || transactionAmount <= 0) {
            showMessage("Please enter a valid amount.", "red");
            return;
        }

        // Prevent overdraft: Check if withdrawal amount exceeds balance
        if (!isDeposit && transactionAmount > currentBalance) {
            showMessage("Insufficient balance.", "red");
            return;
        }

        // Calculate the new balance
        let newBalance = isDeposit ? currentBalance + transactionAmount : currentBalance - transactionAmount;
        currentBalElement.textContent = `Current Balance: $${newBalance.toFixed(2)}`;

        // Display success message
        showMessage(
            isDeposit 
                ? `Deposited $${transactionAmount.toFixed(2)} successfully!`
                : `Withdrawn $${transactionAmount.toFixed(2)} successfully!`, 
            "green"
        );

        // Clear input field after transaction
        amountInput.value = "";
    }

    /**
     * Function to display transaction messages
     * @param {string} text - The message to be displayed
     * @param {string} color - The color of the message (green for success, red for error)
     */
    function showMessage(text, color) {
        messageElement.textContent = text;
        messageElement.style.color = color;
    }

    // Event listener for deposit button
    depositBtn.addEventListener("click", function () {
        updateBalance(amountInput.value, true);
    });

    // Event listener for withdrawal button
    withdrawBtn.addEventListener("click", function () {
        updateBalance(amountInput.value, false);
    });
});
