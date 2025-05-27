// Event store
const events = [];

// Closure to track registration count by category
function createCategoryTracker() {
    const categoryCount = {};

    return function registerCategory(category) {
        if (!categoryCount[category]) {
            categoryCount[category] = 0;
        }
        categoryCount[category]++;
        console.log(`Registrations for ${category}: ${categoryCount[category]}`);
    };
}

const trackCategory = createCategoryTracker();

// Add event function
function addEvent(id, name, category) {
    const newEvent = {
        id,
        name,
        category,
        registeredUsers: []
    };
    events.push(newEvent);
    return newEvent;
}

// Register a user for an event
function registerUser(eventId, user) {
    const event = events.find(e => e.id === eventId);
    if (event) {
        event.registeredUsers.push(user);
        // Track category registration using closure
        trackCategory(event.category);
    } else {
        console.log("Event not found.");
    }
}

// Filter events using a callback (higher-order function)
function filterEventsByCategory(callback) {
    return events.filter(callback);
}

// --- Usage ---

addEvent(1, "Tech Conference", "Technology");
addEvent(2, "Art Workshop", "Art");
addEvent(3, "AI Meetup", "Technology");

registerUser(1, { name: "Alice" });
registerUser(3, { name: "Bob" });
registerUser(2, { name: "Charlie" });
registerUser(3, { name: "David" });

// Dynamic filter with callback
const techEvents = filterEventsByCategory(event => event.category === "Technology");
console.log("Technology Events:", techEvents);

// Another filter example
const eventsWithRegistrations = filterEventsByCategory(event => event.registeredUsers.length > 0);
console.log("Events with Registrations:", eventsWithRegistrations);
