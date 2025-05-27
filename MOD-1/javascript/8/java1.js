// Sample data
let events = [
  { title: "Rock Concert", type: "music", date: "2025-06-10", registered: false },
  { title: "Jazz Night", type: "music", date: "2025-06-14", registered: false },
  { title: "Art Exhibition", type: "art", date: "2025-06-12", registered: false },
  { title: "Workshop on Baking", type: "workshop", date: "2025-06-15", registered: false }
];

const container = document.querySelector("#events-container");
const filterSelect = document.querySelector("#filter");
const searchInput = document.querySelector("#search");

function renderEvents(filteredEvents) {
  container.innerHTML = "";

  filteredEvents.forEach((event, index) => {
    const card = document.createElement("div");
    card.className = "event-card";

    card.innerHTML = `
      <h3>${event.title}</h3>
      <p>Type: ${event.type}</p>
      <p>Date: ${event.date}</p>
      <button>${event.registered ? "Cancel" : "Register"}</button>
    `;

    const button = card.querySelector("button");
    button.onclick = () => {
      event.registered = !event.registered;
      renderEvents(applyFilters());
    };

    container.appendChild(card);
  });
}

// Apply filters and search
function applyFilters() {
  const selectedType = filterSelect.value;
  const searchTerm = searchInput.value.toLowerCas
