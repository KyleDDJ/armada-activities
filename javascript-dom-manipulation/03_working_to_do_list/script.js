/**
 * DOCU: Todo App Functions
 * These functions enable users to dynamically add and remove tasks from the todo list. 
 * The app also displays notifications for invalid input and toggles the list visibility.
 */

document.addEventListener("DOMContentLoaded", () => {
    const addButton = document.querySelector(".add-btn");
    const input = document.querySelector(".todo-input");
    const list = document.querySelector(".todo-list");
    const notificationContainer = document.createElement("div");
    notificationContainer.className = "notification-container";
    document.body.appendChild(notificationContainer);

    // Hide list initially
    list.style.display = "none";

    /**
     * Function to display and hide notifications.
     * @param {string} message - Notification message to display.
     */
    function showNotification(message) {
        const notification = document.createElement("div");
        notification.className = "notification";
        notification.textContent = message;
        notificationContainer.appendChild(notification);
        notificationContainer.style.position = "absolute";
        notificationContainer.style.bottom = "250px";
        notificationContainer.style.width = "100%";
        notificationContainer.style.textAlign = "center";

        setTimeout(() => {
            notification.remove();
        }, 1000);
    }

    /**
     * Function to add a task to the list.
     * Validates input and displays the list if a task is added.
     */
    function addTask() {
        const taskText = input.value.trim();
        if (taskText === "") {
            showNotification("Task cannot be empty!");
            return;
        }

        // Show list when task is added
        list.style.display = "block";

        const listItem = document.createElement("li");
        listItem.className = "todo-item";
        listItem.style.display = "flex";
        listItem.style.justifyContent = "space-between";
        listItem.style.alignItems = "center";

        const label = document.createElement("label");
        label.className = "todo-text";
        label.textContent = taskText;

        const deleteButton = document.createElement("button");
        deleteButton.textContent = "Remove";
        deleteButton.style.background = "Red";
        deleteButton.style.color = "white";
        deleteButton.style.border = "none";
        deleteButton.style.borderRadius = "5px";
        deleteButton.style.padding = "5px 10px 5px 10px";
        deleteButton.className = "delete-btn";
        deleteButton.onclick = () => {
            listItem.remove();
            if (list.children.length === 0) {
                list.style.display = "none";
            }
        };

        listItem.appendChild(label);
        listItem.appendChild(deleteButton);
        list.appendChild(listItem);
        input.value = "";
    }

    // Event Listeners
    addButton.addEventListener("click", addTask);
    input.addEventListener("keypress", (e) => {
        if (e.key === "Enter") {
            addTask();
        }
    });
});
