// Array of events
let events = [
  { title: "Rock Concert", type: "music", date: "2025-06-10", registered: false },
  { title: "Workshop on Baking", type: "workshop", date: "2025-06-15", registered: false },
  { title: "Jazz Night", type: "music", date: "2025-06-14", registered: false }
];

// Access DOM element using querySelector
const container = document.querySelector("#events-container");

// Function to render event cards
function renderEvents() {
  container.innerHTML = ""; // Clear previous content

  events.forEach((event, index) => {
    // Create card
    const card = document.createElement("div");
    card.className = "event-card";

    // Event content
    card.innerHTML = `
      <h3>${event.title}</h3>
      <p>Type: ${event.type}</p>
      <p>Date: ${event.date}</p>
      <button>${event.registered ? "Cancel Registration" : "Register"}</button>
    `;

    // Handle button click
    const button = card.querySelector("button");
    button.addEventListener("click", () => {
      // Toggle registration state
      event.registered = !event.registered;
      renderEvents(); // Re-render UI
    });

    // Append card to container
    container.appendChild(card);
  });
}

// Initial render
renderEvents();
