// Initial array of community events
let events = [
  { title: "Rock Concert", type: "music", date: "2025-06-10" },
  { title: "Art Exhibition", type: "art", date: "2025-06-12" },
  { title: "Jazz Night", type: "music", date: "2025-06-14" },
  { title: "Workshop on Baking", type: "workshop", date: "2025-06-15" }
];

// ✅ Add new events using .push()
events.push(
  { title: "Pop Music Festival", type: "music", date: "2025-06-20" },
  { title: "Coding Bootcamp", type: "workshop", date: "2025-06-22" }
);

// ✅ Use .filter() to show only music events
let musicEvents = events.filter(event => event.type === "music");

console.log("🎵 Music Events:");
console.log(musicEvents);

// ✅ Use .map() to format display cards
let displayCards = events.map(event => {
  return `🗓️ ${event.title} (${event.type}) - ${event.date}`;
});

console.log("\n📋 Display Cards:");
console.log(displayCards);
