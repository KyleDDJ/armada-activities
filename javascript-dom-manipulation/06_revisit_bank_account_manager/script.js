/**
 * DOCU: Bank Account Management Functions
 * These functions allow users to dynamically update their bank balance, deposit and withdraw money,
 * and track transaction history while enforcing a daily withdrawal limit.
 * The functions validate input values before applying changes.
 */

document.addEventListener("DOMContentLoaded", function () {
    // Selecting necessary DOM elements
    const amountInput = document.getElementById("amountInput");
    const currentBalElement = document.getElementById("current-Bal");
    const withdrawLimitElement = document.getElementById("withdrawal-limit");
    const messageElement = document.getElementById("message");
    const depositBtn = document.getElementById("btn-deposit");
    const withdrawBtn = document.getElementById("btn-withdraw");
    const transactionList = document.querySelector("#transaction-list ul"); 

    let transactionCount = 0; // Track transaction numbers
    let dailyWithdrawal = 0; // Track total withdrawals for the day
    const dailyLimit = 500; // Maximum amount allowed for withdrawal per day

    /**
     * Function to update the balance.
     * It processes deposits and withdrawals, ensures withdrawal limits are enforced, 
     * and updates the UI accordingly.
     */
    function updateBalance(amount, isDeposit) {
        let currentBalance = parseFloat(currentBalElement.textContent.replace("Balance: $", ""));
        let transactionAmount = parseFloat(amount);

        // Validate input
        if (isNaN(transactionAmount) || transactionAmount <= 0) {
            showMessage("Please enter a valid amount.", "red");
            return;
        }

        // Handle withdrawals and enforce the daily limit
        if (!isDeposit) {
            if (transactionAmount > currentBalance) {
                showMessage("Insufficient balance.", "red");
                return;
            }
            if (dailyWithdrawal + transactionAmount > dailyLimit) {
                showMessage("Daily withdrawal limit reached!", "red");
                return;
            }
            dailyWithdrawal += transactionAmount; // Update daily withdrawal amount
        }

        // Calculate new balance
        let newBalance = isDeposit ? currentBalance + transactionAmount : currentBalance - transactionAmount;
        currentBalElement.textContent = `Balance: $${newBalance.toFixed(2)}`;

        // Update withdrawal limit display after each withdrawal
        if (!isDeposit) {
            withdrawLimitElement.textContent = `Daily Withdrawal Limit: $${(dailyLimit - dailyWithdrawal).toFixed(2)}`;
        }

        // Show success message
        showMessage(
            isDeposit 
                ? `Deposited $${transactionAmount.toFixed(2)} successfully.`
                : `Withdrew $${transactionAmount.toFixed(2)} successfully.`, 
            "green"
        );

        addTransaction(transactionAmount, isDeposit); // Log transaction
        amountInput.value = ""; // Clear input field
    }

    /**
     * Function to add a transaction record.
     * It logs deposits and withdrawals in the transaction history with timestamps.
     */
    function addTransaction(amount, isDeposit) {
        transactionCount++; // Increment transaction count
        const transactionItem = document.createElement("li");
        transactionItem.classList.add("transaction-item");
        
        const now = new Date();
        const formattedTime = `${now.toLocaleDateString()} ${now.toLocaleTimeString()}`;

        // Create transaction history entry with styling
        transactionItem.innerHTML = `
            <div class="transaction-box ${isDeposit ? "deposit" : "withdraw"}">
                <strong>${isDeposit ? "Deposited" : "Withdrew"}:</strong> 
                <span class="${isDeposit ? "green" : "red"}">$${amount.toFixed(2)}</span>
                <br>
                <small>${formattedTime}</small>
            </div>
        `;

        transactionList.prepend(transactionItem); // Add latest transaction at the top
    }

    /**
     * Function to display messages to the user.
     * It updates the message text and color dynamically.
     */
    function showMessage(text, color) {
        messageElement.textContent = text;
        messageElement.style.color = color;
    }

    // Event Listeners for Deposit and Withdraw buttons
    depositBtn.addEventListener("click", function () {
        updateBalance(amountInput.value, true);
    });

    withdrawBtn.addEventListener("click", function () {
        updateBalance(amountInput.value, false);
    });
});
