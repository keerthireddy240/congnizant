// Sample event list
const events = [
  { title: "Rock Concert", type: "music", date: "2025-06-10" },
  { title: "Art Exhibition", type: "art", date: "2025-06-12" },
  { title: "Jazz Night", type: "music", date: "2025-06-14" },
  { title: "Workshop on Baking", type: "workshop", date: "2025-06-15" }
];

// ✅ Function using default parameters, spread operator, and destructuring
const filterEvents = (eventList = [], filterType = "all") => {
  const clonedEvents = [...eventList]; // ✅ Spread operator to clone array

  return filterType === "all"
    ? clonedEvents
    : clonedEvents.filter(({ type }) => type === filterType); // ✅ Destructuring
};

// ✅ Function to display event info using destructuring
const displayEvents = (eventList = []) => {
  eventList.forEach(({ title, type, date }) => {
    console.log(`📅 ${title} | Type: ${type} | Date: ${date}`);
  });
};

// ✅ Use the functions
const musicEvents = filterEvents(events, "music");

console.log("🎵 Filtered Music Events:");
displayEvents(musicEvents);

console.log("\n📋 All Events:");
displayEvents(filterEvents(events)); // "all" is the default
