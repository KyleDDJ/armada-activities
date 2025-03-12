// Firefly explosion effect
const explosionImg = "https://i.gifer.com/origin/a0/a07ad08920f303f655251b1a0b353b86_w200.gif";

document.querySelectorAll(".firefly").forEach(firefly => {
    firefly.addEventListener("click", function() {
        this.style.transform = "scale(0.5)"; // Shrink the firefly
        this.style.opacity = "0"; // Fade out

        setTimeout(() => {
            this.src = explosionImg; // Change to explosion effect
            this.style.opacity = "1"; // Show explosion
            this.style.transform = "scale(1)"; // Reset size
        }, 300);

        setTimeout(() => {
            this.src = "https://cdn.dribbble.com/userupload/20573166/file/original-7337f080d11ad62db66a5fdc4478dfd0.gif"; // Revert to firefly
            this.style.opacity = "1"; // Make it visible again
        }, 1000);
    });
});