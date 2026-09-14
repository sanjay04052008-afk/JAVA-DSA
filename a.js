const form = document.getElementById('ecolearn-form');
const successMessage = document.getElementById('success-message');

form.addEventListener('submit', function(event) {
    event.preventDefault();

    // Hide the form
    form.style.display = 'none';

    // Show success message
    successMessage.classList.remove('hidden');
});