// Sample array of event objects
const events = [
  { name: "Web Dev Bootcamp", date: "2025-06-10", seats: 5 },
  { name: "AI Seminar", date: "2025-05-20", seats: 0 },
  { name: "Startup Meetup", date: "2024-12-01", seats: 10 },
  { name: "Design Workshop", date: "2025-07-01", seats: 3 }
];

// Get reference to DOM elements
const eventContainer = document.getElementById("eventContainer");
const errorMessage = document.getElementById("errorMessage");

// Get today's date
const today = new Date();

// Loop through events and display only valid ones
events.forEach((event, index) => {
  const eventDate = new Date(event.date);

  if (eventDate > today && event.seats > 0) {
    // Create event card
    const eventDiv = document.createElement("div");
    eventDiv.className = "event";
    eventDiv.innerHTML = `
      <strong>${event.name}</strong><br>
      Date: ${event.date}<br>
      Seats left: <span id="seats-${index}">${event.seats}</span><br>
      <button onclick="register(${index})">Register</button>
    `;
    eventContainer.appendChild(eventDiv);
  } else {
    // Skip past or full events
  }
});

// Registration function with error handling
function register(index) {
  try {
    const event = events[index];

    if (!event) throw new Error("Event not found.");
    if (event.seats <= 0) throw new Error("No seats available.");

    // Decrease seat count
    event.seats--;

    // Update the UI
    const seatSpan = document.getElementById(`seats-${index}`);
    if (seatSpan) seatSpan.textContent = event.seats;

    alert(`Successfully registered for ${event.name}`);
    errorMessage.textContent = ""; // Clear error

  } catch (err) {
    errorMessage.textContent = "Registration failed: " + err.message;
  }
}
// Sample array of event objects
const events = [
  { name: "Web Dev Bootcamp", date: "2025-06-10", seats: 5 },
  { name: "AI Seminar", date: "2025-05-20", seats: 0 },
  { name: "Startup Meetup", date: "2024-12-01", seats: 10 },
  { name: "Design Workshop", date: "2025-07-01", seats: 3 }
];

// Get reference to DOM elements
const eventContainer = document.getElementById("eventContainer");
const errorMessage = document.getElementById("errorMessage");

// Get today's date
const today = new Date();

// Loop through events and display only valid ones
events.forEach((event, index) => {
  const eventDate = new Date(event.date);

  if (eventDate > today && event.seats > 0) {
    // Create event card
    const eventDiv = document.createElement("div");
    eventDiv.className = "event";
    eventDiv.innerHTML = `
      <strong>${event.name}</strong><br>
      Date: ${event.date}<br>
      Seats left: <span id="seats-${index}">${event.seats}</span><br>
      <button onclick="register(${index})">Register</button>
    `;
    eventContainer.appendChild(eventDiv);
  } else {
    // Skip past or full events
  }
});

// Registration function with error handling
function register(index) {
  try {
    const event = events[index];

    if (!event) throw new Error("Event not found.");
    if (event.seats <= 0) throw new Error("No seats available.");

    // Decrease seat count
    event.seats--;

    // Update the UI
    const seatSpan = document.getElementById(`seats-${index}`);
    if (seatSpan) seatSpan.textContent = event.seats;

    alert(`Successfully registered for ${event.name}`);
    errorMessage.textContent = ""; // Clear error

  } catch (err) {
    errorMessage.textContent = "Registration failed: " + err.message;
  }
}
