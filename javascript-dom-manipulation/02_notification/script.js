document.getElementById("showNotification").addEventListener("click", function () {
    const container = document.getElementById("notificationContainer");
    const notification = document.createElement("div");
    notification.classList.add("notification");
    notification.textContent = "You have a new message!";

    const closeButton = document.createElement("span");
    closeButton.classList.add("close-btn");
    closeButton.textContent = "×";
    closeButton.onclick = function () {
        container.removeChild(notification);
    };

    notification.appendChild(closeButton);

    if (container.children.length > 0) {
        container.insertBefore(notification, container.firstChild);
    } else {
        container.appendChild(notification);
    }

    setTimeout(() => {
        if (notification.parentNode === container) {
            container.removeChild(notification);
        }
    }, 5000);
});