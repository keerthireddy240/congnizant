const container = document.querySelector("#events-container");
const spinner = document.querySelector("#spinner");
const API_URL = "https://mocki.io/v1/abcdefg123456"; // Replace with actual mock URL

// Using .then() and .catch()
function fetchEventsThenCatch() {
  spinner.style.display = "block";

  fetch(API_URL)
    .then(response => {
      if (!response.ok) throw new Error("Network response was not ok");
      return response.json();
    })
    .then(data => {
      renderEvents(data);
    })
    .catch(error => {
      container.innerHTML = `<p style="color:red;">Error: ${error.message}</p>`;
    })
    .finally(() => {
      spinner.style.display = "none";
    });
}

// Render function
function renderEvents(events) {
  container.innerHTML = "";
  events.forEach(event => {
    const card = document.createElement("div");
    card.className = "event-card";
    card.innerHTML = `
      <h3>${event.title}</h3>
      <p>Type: ${event.type}</p>
      <p>Date: ${event.date}</p>
    `;
    container.appendChild(card);
  });
}

// Uncomment to test this version:
// fetchEventsThenCatch();
