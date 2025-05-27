const form = document.getElementById("registrationForm");
const responseMessage = document.getElementById("responseMessage");

form.addEventListener("submit", function (e) {
  e.preventDefault(); // Prevent page reload
  console.log("📤 Form submitted");

  responseMessage.textContent = "⏳ Sending registration...";
  responseMessage.className = "message";

  // ✅ Step 1: Extract form data
  const { name, email, event: selectedEvent } = form.elements;
  const userData = {
    name: name.value.trim(),
    email: email.value.trim(),
    event: selectedEvent.value
  };

  console.log("✅ Extracted form data:", userData);

  // ✅ Step 2: Simulate delay
  setTimeout(() => {
    console.log("⏳ Making POST request to API...");

    fetch("https://jsonplaceholder.typicode.com/posts", {
      method: "POST",
      headers: {
        "Content-Type": "application/json"
      },
      body: JSON.stringify(userData)
    })
    .then(response => {
      console.log("✅ Fetch response status:", response.status);
      if (!response.ok) throw new Error("Server responded with error");
      return response.json();
    })
    .then(data => {
      console.log("✅ Server returned:", data);
      responseMessage.textContent = `✅ Registration successful! ID: ${data.id}`;
      responseMessage.classList.add("success");
      form.reset();
    })
    .catch(error => {
      console.error("❌ Error during registration:", error);
      responseMessage.textContent = `❌ Registration failed: ${error.message}`;
      responseMessage.classList.add("error");
    });
  }, 2000); // 2-second simulated delay
});
