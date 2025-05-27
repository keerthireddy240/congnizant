const form = document.getElementById("registrationForm");
const successMessage = document.getElementById("successMessage");

// Get error message containers
const nameError = document.getElementById("nameError");
const emailError = document.getElementById("emailError");
const eventError = document.getElementById("eventError");

form.addEventListener("submit", function (event) {
  event.preventDefault(); // ✅ Prevent form from submitting

  // Clear previous errors
  nameError.textContent = "";
  emailError.textContent = "";
  eventError.textContent = "";
  successMessage.textContent = "";

  // ✅ Access inputs using form.elements
  const { name, email, event: selectedEvent } = form.elements;

  let isValid = true;

  // ✅ Validate name
  if (name.value.trim() === "") {
    nameError.textContent = "Name is required.";
    isValid = false;
  }

  // ✅ Validate email
  if (email.value.trim() === "") {
    emailError.textContent = "Email is required.";
    isValid = false;
  } else if (!/\S+@\S+\.\S+/.test(email.value)) {
    emailError.textContent = "Please enter a valid email.";
    isValid = false;
  }

  // ✅ Validate selected event
  if (selectedEvent.value === "") {
    eventError.textContent = "Please select an event.";
    isValid = false;
  }

  // ✅ If valid, show success message
  if (isValid) {
    successMessage.textContent = `Thank you, ${name.value}, for registering for "${selectedEvent.value}"!`;
    form.reset();
  }
});
