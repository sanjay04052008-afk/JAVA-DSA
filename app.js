document.addEventListener('DOMContentLoaded', () => {
    const form = document.getElementById('submission-form');
    const input = document.getElementById('flag-input');
    const status = document.getElementById('status-display');
    const submitBtn = document.getElementById('submit-btn');

    form.addEventListener('submit', (e) => {
        e.preventDefault();
        const submittedFlag = input.value.trim();

        // Reset previous classes
        status.classList.remove('status-success', 'status-failure', 'hidden');

        if (submittedFlag === "FLAG{FL3XB0X_D3RYPT3D}") {
            status.innerText = "ACCESS GRANTED. SECTOR 2 UNLOCKED.";
            status.classList.add('status-success');
            input.disabled = true;
            submitBtn.disabled = true;
        } else {
            status.innerText = "ACCESS DENIED. INVALID FLAG.";
            status.classList.add('status-failure');
            input.value = '';
        }

        status.classList.remove('hidden');
    });
});