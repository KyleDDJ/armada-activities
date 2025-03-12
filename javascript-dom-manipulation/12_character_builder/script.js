document.addEventListener("DOMContentLoaded", () => {
    const selectionItems = document.querySelectorAll(".selectable");

    selectionItems.forEach(item => {
        item.addEventListener("click", () => {
            let part = item.getAttribute("data-part");
            let partSlot = document.getElementById(`${part}-slot`);

            if (!partSlot) return;

            partSlot.src = item.src;

            document.querySelectorAll(`.selectable[data-part="${part}"]`).forEach(el => {
                el.classList.remove("selected");
            });

            item.classList.add("selected");
        });
    });
});
