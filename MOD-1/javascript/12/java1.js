const form = document.getElementById("registrationForm");
const responseMessage = document.getElementById("responseMessage");

form.addEventListener("submit", function (e) {
  e.preventDefault();

  responseMessage.textContent = "⏳ Sending registration...";
  responseMessage.className = "message";

  // Gather form data
  const { name, email, event: selectedEvent } = form.elements;
  const userData = {
    name: name.value,
    email: email.value,
    event: selectedEvent.value
  };

  // Simulate network delay with setTimeout
  setTimeout(() => {
    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(userData)
    })
    .then(response => {
      if (!response.ok) throw new Error("Server error");
      return response.json();
    })
    .then(data => {
      responseMessage.textContent = `✅ Registration successful! ID: ${data.id}`;
      responseMessage.classList.add("success");
      form.reset();
    })
    .catch(error => {
      responseMessage.textContent = `❌ Registration failed: ${error.message}`;
      responseMessage.classList.add("error");
    });
  }, 2000); // Simulated delay: 2 seconds
});
