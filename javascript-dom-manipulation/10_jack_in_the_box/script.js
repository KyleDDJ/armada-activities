document.addEventListener("DOMContentLoaded", function () {
    const box = document.getElementById("box");
    const button = document.getElementById("toggleBtn");

    function toggleBox() {
        let state = box.getAttribute("data-state");
        if (state === "closed") {
            box.src = box.getAttribute("data-open");
            box.setAttribute("data-state", "open");
            button.textContent = "Close";
        } else {
            box.src = box.getAttribute("data-closed");
            box.setAttribute("data-state", "closed");
            button.textContent = "Click Me";
        }
    }

    // Click event for both image and button
    box.addEventListener("click", toggleBox);
    button.addEventListener("click", toggleBox);
});
